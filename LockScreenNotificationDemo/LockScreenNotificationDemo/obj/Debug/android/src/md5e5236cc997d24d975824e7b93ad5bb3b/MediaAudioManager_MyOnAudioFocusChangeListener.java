package md5e5236cc997d24d975824e7b93ad5bb3b;


public class MediaAudioManager_MyOnAudioFocusChangeListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioManager.OnAudioFocusChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioFocusChange:(I)V:GetOnAudioFocusChange_IHandler:Android.Media.AudioManager/IOnAudioFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("LockScreenNotificationDemo.MediaAudioManager+MyOnAudioFocusChangeListener, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MediaAudioManager_MyOnAudioFocusChangeListener.class, __md_methods);
	}


	public MediaAudioManager_MyOnAudioFocusChangeListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MediaAudioManager_MyOnAudioFocusChangeListener.class)
			mono.android.TypeManager.Activate ("LockScreenNotificationDemo.MediaAudioManager+MyOnAudioFocusChangeListener, LockScreenNotificationDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAudioFocusChange (int p0)
	{
		n_onAudioFocusChange (p0);
	}

	private native void n_onAudioFocusChange (int p0);

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
