using System;
using Android.App;
using Android.Content;
using Android.Media;
using Android.Media.Session;
using Android.OS;

namespace LockScreenNotificationDemo
{
    [Service]
    public class MediaPlayerService : Service
    {
		public const string ActionPlay = "action_play";
		public const string ActionPause = "action_pause";
		public const string ActionRewind = "action_rewind";
		public const string ActionFastForward = "action_fast_forward";
		public const string ActionNext = "action_next";
		public const string ActionPrevious = "action_previous";
        public const string ActionStop = "action_stop";

        private MediaSession mediaSession;
        private MediaPlayer mediaPlayer;
        private MediaSessionManager mediaSessionManager;
        private MediaController mediaController;

        public override IBinder OnBind(Intent intent)
        {
            return null;
        }

        public override bool OnUnbind(Intent intent)
        {
            mediaSession.Release();
            return base.OnUnbind(intent);
        }

        private void HandleIntent(Intent intent)
        {
            if (intent == null || intent.Action == null)
            {
                return;
            }

            var action = intent.Action;
            switch (action)
            { 
                case ActionPlay:
                    mediaController.GetTransportControls().Play();
                    break;

                case ActionPause:
                    mediaController.GetTransportControls().Pause();
                    break;

				case ActionRewind:
                    mediaController.GetTransportControls().Rewind();
                    break;

                case ActionFastForward:
                    mediaController.GetTransportControls().FastForward();
                    break;

                case ActionNext:
                    mediaController.GetTransportControls().SkipToNext();
                    break;

                case ActionPrevious:
                    mediaController.GetTransportControls().SkipToPrevious();
                    break;

                case ActionStop:
                    mediaController.GetTransportControls().Stop();
                    break;
            }
        }

        private Notification.Action GenerateAction(int icon, string title, string intentAction)
        {
            var intent = new Intent(ApplicationContext, typeof(MediaPlayerService));
            intent.SetAction(intentAction);

            var pendingIntent = PendingIntent.GetService(ApplicationContext, 1, intent, 0);
            return new Notification.Action.Builder(icon, title, pendingIntent).Build();
        }

        private void BuildNotification(Notification.Action action)
        {
            var style = new Notification.MediaStyle();
            var intent = new Intent(ApplicationContext, typeof(MediaPlayerService));
            intent.SetAction(ActionStop);
            var pendingIntent = PendingIntent.GetService(ApplicationContext, 1, intent, 0);
            Notification.Builder builder = new Notification.Builder(this)
                .SetSmallIcon(Resource.Mipmap.Icon)
                .SetContentTitle("Lock screen example")
                .SetContentText("Artist name")
                .SetDeleteIntent(pendingIntent)
                .SetStyle(style);

            builder.AddAction(GenerateAction(Android.Resource.Drawable.IcMediaPrevious, "Previous", ActionPrevious));
            builder.AddAction(GenerateAction(Android.Resource.Drawable.IcMediaRew, "Rew", ActionRewind));
            builder.AddAction(action);
            builder.AddAction(GenerateAction(Android.Resource.Drawable.IcMediaFf, "Fast forward", ActionFastForward));
            builder.AddAction(GenerateAction(Android.Resource.Drawable.IcMediaNext, "Next", ActionNext));

            style.SetShowActionsInCompactView(0, 1, 2, 3, 4);

            var notificationManager = (NotificationManager)GetSystemService(NotificationService);
            notificationManager.Notify(1, builder.Build());
        }

        public override StartCommandResult OnStartCommand(Intent intent, StartCommandFlags flags, int startId)
        {
            if (mediaSessionManager == null)
            { 
            
            }

            return base.OnStartCommand(intent, flags, startId);
        }

        private void InitializeMediaSession()
        {
            mediaPlayer = new MediaPlayer();
            mediaSession = new MediaSession(ApplicationContext, "example player session");
            mediaController = new MediaController(ApplicationContext, mediaSession.SessionToken);

            var callback = new MediaSessionCallback();
			mediaSession.SetCallback(callback);

            callback.OnPlayChanged += (sender, e) =>
            {
                BuildNotification(GenerateAction(Android.Resource.Drawable.IcMediaPause, "Pause", ActionPause));
            };

            callback.OnPauseChanged += (sender, e) =>
            {
                BuildNotification(GenerateAction(Android.Resource.Drawable.IcMediaPlay, "Play", ActionPlay));
            };

            callback.OnStopChanged += (sender, e) =>
            {
                var notificationManager = (NotificationManager)GetSystemService(NotificationService);
                notificationManager.Cancel(1);
                var intent = new Intent(ApplicationContext, typeof(MediaPlayerService));
                StopService(intent);
            };
        }

        private class MediaSessionCallback : MediaSession.Callback
        {
			public event EventHandler OnPlayChanged;
			public event EventHandler OnPauseChanged;
            public event EventHandler OnStopChanged;

            public override void OnPlay()
            {
                base.OnPlay();
                OnPlayChanged?.Invoke(this, null);
            }

            public override void OnPause()
            {
                base.OnPause();
                OnPauseChanged?.Invoke(this, null);
            }

            public override void OnStop()
            {
                base.OnStop();
                OnStopChanged?.Invoke(this, null);
            }
        }
    }
}
