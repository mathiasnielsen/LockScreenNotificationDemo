package md5e5236cc997d24d975824e7b93ad5bb3b;


public class MediaPlaybackService
	extends android.support.v4.media.MediaBrowserServiceCompat
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:()V:GetOnCreateHandler\n" +
			"n_onGetRoot:(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/support/v4/media/MediaBrowserServiceCompat$BrowserRoot;:GetOnGetRoot_Ljava_lang_String_ILandroid_os_Bundle_Handler\n" +
			"n_onLoadChildren:(Ljava/lang/String;Landroid/support/v4/media/MediaBrowserServiceCompat$Result;)V:GetOnLoadChildren_Ljava_lang_String_Landroid_support_v4_media_MediaBrowserServiceCompat_Result_Handler\n" +
			"";
		mono.android.Runtime.register ("LockScreenNotificationDemo.MediaPlaybackService, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaPlaybackService.class, __md_methods);
	}


	public MediaPlaybackService () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaPlaybackService.class)
			mono.android.TypeManager.Activate ("LockScreenNotificationDemo.MediaPlaybackService, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate ()
	{
		n_onCreate ();
	}

	private native void n_onCreate ();


	public android.support.v4.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot (java.lang.String p0, int p1, android.os.Bundle p2)
	{
		return n_onGetRoot (p0, p1, p2);
	}

	private native android.support.v4.media.MediaBrowserServiceCompat.BrowserRoot n_onGetRoot (java.lang.String p0, int p1, android.os.Bundle p2);


	public void onLoadChildren (java.lang.String p0, android.support.v4.media.MediaBrowserServiceCompat.Result p1)
	{
		n_onLoadChildren (p0, p1);
	}

	private native void n_onLoadChildren (java.lang.String p0, android.support.v4.media.MediaBrowserServiceCompat.Result p1);

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
