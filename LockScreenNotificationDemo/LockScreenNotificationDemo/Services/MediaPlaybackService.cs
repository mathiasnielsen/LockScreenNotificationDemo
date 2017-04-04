using System;
using Android.App;
using Android.OS;
using Android.Support.V4.Media;
using Android.Support.V4.Media.Session;

namespace LockScreenNotificationDemo
{
    [Service]
	public class MediaPlaybackService : MediaBrowserServiceCompat
    {
        private const string LogTag = nameof(LogTag);
        private const string MY_MEDIA_ROOT_ID = nameof(MY_MEDIA_ROOT_ID);

		private MediaSessionCompat mMediaSession;
		private PlaybackStateCompat.Builder mStateBuilder;

        public override void OnCreate()
        {
            base.OnCreate();

			// Create a MediaSessionCompat
			mMediaSession = new MediaSessionCompat(ApplicationContext, LogTag);

			// Enable callbacks from MediaButtons and TransportControls
            mMediaSession.SetFlags(
                MediaSessionCompat.FlagHandlesMediaButtons |
                MediaSessionCompat.FlagHandlesTransportControls);

			// Set an initial PlaybackState with ACTION_PLAY, so media buttons can start the player
			mStateBuilder = new PlaybackStateCompat.Builder()
                                                   .SetActions(
                                                       PlaybackStateCompat.ActionPlay |
                                                       PlaybackStateCompat.ActionPause);
            
            mMediaSession.SetPlaybackState(mStateBuilder.Build());

			// MySessionCallback() has methods that handle callbacks from a media controller
            mMediaSession.SetCallback(new MySessionCallback());

			// Set the session's token so that client activities can communicate with it.
            SessionToken = mMediaSession.SessionToken;
        }

		// "A MediaBrowserService has two methods that handle client connections:
        // onGetRoot() controls access to the service, 
        // and onLoadChildren() provides the ability for a client to build and display 
        // a menu of the MediaBrowserService's content hierarchy."

        public override BrowserRoot OnGetRoot(string p0, int p1, Bundle p2)
        {
			// (Optional) Control the level of access for the specified package name.
			// You'll need to write your own logic to do this.
			////if (allowBrowsing(clientPackageName, clientUid))
            if (true)
			{
				// Returns a root ID, so clients can use onLoadChildren() to retrieve the content hierarchy
				return new BrowserRoot(MY_MEDIA_ROOT_ID, null);
			}
			else
			{
				// Clients can connect, but since the BrowserRoot is an empty string
				// onLoadChildren will return nothing. This disables the ability to browse for content.
				return new BrowserRoot("", null);
			}
        }

        public override void OnLoadChildren(string p0, Result p1)
        {
            throw new NotImplementedException();
        }

        private class MySessionCallback : MediaSessionCompat.Callback
        { 
        }
    }
}
