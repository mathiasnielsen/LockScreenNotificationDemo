package md5e5236cc997d24d975824e7b93ad5bb3b;


public class MediaPlayerService_ActiveSessionChangedListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActiveSessionsChanged:(Ljava/util/List;)V:GetOnActiveSessionsChanged_Ljava_util_List_Handler:Android.Media.Session.MediaSessionManager/IOnActiveSessionsChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("LockScreenNotificationDemo.MediaPlayerService+ActiveSessionChangedListener, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayerService_ActiveSessionChangedListener.class, __md_methods);
	}


	public MediaPlayerService_ActiveSessionChangedListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayerService_ActiveSessionChangedListener.class)
			mono.android.TypeManager.Activate ("LockScreenNotificationDemo.MediaPlayerService+ActiveSessionChangedListener, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onActiveSessionsChanged (java.util.List p0)
	{
		n_onActiveSessionsChanged (p0);
	}

	private native void n_onActiveSessionsChanged (java.util.List p0);

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
