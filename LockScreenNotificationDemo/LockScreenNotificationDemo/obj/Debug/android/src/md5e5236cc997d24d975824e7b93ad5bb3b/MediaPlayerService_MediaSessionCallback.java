package md5e5236cc997d24d975824e7b93ad5bb3b;


public class MediaPlayerService_MediaSessionCallback
	extends android.media.session.MediaSession.Callback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPlay:()V:GetOnPlayHandler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onStop:()V:GetOnStopHandler\n" +
			"";
		mono.android.Runtime.register ("LockScreenNotificationDemo.MediaPlayerService+MediaSessionCallback, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayerService_MediaSessionCallback.class, __md_methods);
	}


	public MediaPlayerService_MediaSessionCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayerService_MediaSessionCallback.class)
			mono.android.TypeManager.Activate ("LockScreenNotificationDemo.MediaPlayerService+MediaSessionCallback, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onPlay ()
	{
		n_onPlay ();
	}

	private native void n_onPlay ();


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onStop ()
	{
		n_onStop ();
	}

	private native void n_onStop ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
