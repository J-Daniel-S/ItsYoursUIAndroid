
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _recordpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _audiopanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _videopanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _atestpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _vtestpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _donatepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _merchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _iyview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _layouthome = RemoteObject.createImmutable("");
public static RemoteObject _iywebview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _webbackbutton = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ytubeview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _faceview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _instaview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"aTestPanel",_ref.getField(false, "_atestpanel"),"audioPanel",_ref.getField(false, "_audiopanel"),"donatePanel",_ref.getField(false, "_donatepanel"),"faceView",_ref.getField(false, "_faceview"),"instaView",_ref.getField(false, "_instaview"),"iyView",_ref.getField(false, "_iyview"),"iYWebView",_ref.getField(false, "_iywebview"),"LayoutHome",_ref.getField(false, "_layouthome"),"merchPanel",_ref.getField(false, "_merchpanel"),"recordPanel",_ref.getField(false, "_recordpanel"),"Root",_ref.getField(false, "_root"),"videoPanel",_ref.getField(false, "_videopanel"),"vTestPanel",_ref.getField(false, "_vtestpanel"),"webBackButton",_ref.getField(false, "_webbackbutton"),"WebView1",_ref.getField(false, "_webview1"),"xui",_ref.getField(false, "_xui"),"ytubeView",_ref.getField(false, "_ytubeview")};
}
}