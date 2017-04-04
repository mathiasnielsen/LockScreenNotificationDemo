using System;
using Android.App;
using Android.Content;
using Android.Media;
using Android.Views;
using Android.Widget;

namespace LockScreenNotificationDemo
{
    public class RemoteControlClientManager
    {
        public RemoteControlClientManager(Context mycontext)
        {
            var myEventReceiver = new ComponentName(mycontext.PackageName, nameof(RemoteControlReceiver));
            var myAudioManager = (AudioManager)mycontext.GetSystemService(Context.AudioService);
            myAudioManager.RegisterMediaButtonEventReceiver(myEventReceiver);

            // build the PendingIntent for the remote control client
            Intent mediaButtonIntent = new Intent(Intent.ActionMediaButton);
            mediaButtonIntent.SetComponent(myEventReceiver);
            var mediaPendingIntent = PendingIntent.GetBroadcast(mycontext, 0, mediaButtonIntent, 0);

            // create and register the remote control client
            var myRemoteControlClient = new RemoteControlClient(mediaPendingIntent);
            myAudioManager.RegisterRemoteControlClient(myRemoteControlClient);
        }

        public class RemoteControlReceiver : BroadcastReceiver
        {
            public override void OnReceive(Context context, Intent intent)
            {
                if (Intent.ActionMediaButton == (intent.Action))
                {
                    var Xevent = (KeyEvent)intent.GetParcelableExtra(Intent.ExtraKeyEvent);
                    var keyType = Xevent.KeyCode;

                    ////Intent i = new Intent();
                    ////    i.SetAction("com.MainActivity.Shakey.MEDIA_BUTTON");
                    ////    i.PutExtra("keyType", (int)keyType);
                    ////    context.SendBroadcast(i);
                    ////    Toast.MakeText(context, String.valueOf(MainActivity.mult), Toast.LENGTH_SHORT).show();
                    ////MainActivity.mul++;
                    ////abortBroadcast();
                }
            }
        }
    }
}