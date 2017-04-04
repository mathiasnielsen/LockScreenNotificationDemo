package md5e5236cc997d24d975824e7b93ad5bb3b;


public class MediaPlaybackService_MySessionCallback
	extends android.support.v4.media.session.MediaSessionCompat.Callback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("LockScreenNotificationDemo.MediaPlaybackService+MySessionCallback, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlaybackService_MySessionCallback.class, __md_methods);
	}


	public MediaPlaybackService_MySessionCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlaybackService_MySessionCallback.class)
			mono.android.TypeManager.Activate ("LockScreenNotificationDemo.MediaPlaybackService+MySessionCallback, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
