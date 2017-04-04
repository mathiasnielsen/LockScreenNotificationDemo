package md5e5236cc997d24d975824e7b93ad5bb3b;


public class MediaPlayerService_NotificationListener
	extends android.service.notification.NotificationListenerService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("LockScreenNotificationDemo.MediaPlayerService+NotificationListener, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlayerService_NotificationListener.class, __md_methods);
	}


	public MediaPlayerService_NotificationListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlayerService_NotificationListener.class)
			mono.android.TypeManager.Activate ("LockScreenNotificationDemo.MediaPlayerService+NotificationListener, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
