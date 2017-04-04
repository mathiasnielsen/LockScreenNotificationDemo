using System;
using Android.App;
using Android.Content;
using Android.Media;
using Android.OS;
using Android.Runtime;

namespace LockScreenNotificationDemo
{
    public class MediaAudioManager
    {
		public MediaAudioManager(Context context)
        {

        }

        private void DoingStuffWithAudioFocus(Context context)
        { 
            var audioManager = (AudioManager)context.GetSystemService(Context.AudioService);
			var listener = new MyOnAudioFocusChangeListener();

			// Request audio focus for playback
			var result = audioManager.RequestAudioFocus(listener,
								Stream.Music,
								AudioFocus.Gain);

			if (result == AudioFocusRequest.Granted)
			{
				// Start playback
			}
        }

        private class MyOnAudioFocusChangeListener : Java.Lang.Object, AudioManager.IOnAudioFocusChangeListener
        {
            public void OnAudioFocusChange([GeneratedEnum] AudioFocus focusChange)
            {
            }
        }
    }
}
