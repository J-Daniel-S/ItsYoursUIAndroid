package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _aboutpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("aboutPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("aboutpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","aboutpanel_click", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Private Sub aboutPanel_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 53;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/about-";
Debug.ShouldStop(2097152);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.itsyours.org/about-us/")));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audiopanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("audioPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("audiopanel_click")) { return __ref.runUserSub(false, "b4xmainpage","audiopanel_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub audioPanel_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="xui.MsgboxAsync(\"Load audio record!\", \"Audio clic";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Load audio record!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Audio clicked"))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 34;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Root = Root1";
Debug.ShouldStop(4);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 36;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
Debug.ShouldStop(8);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPageLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 37;BA.debugLine="LayoutHome = \"MainPageLayout\"";
Debug.ShouldStop(16);
__ref.setField ("_layouthome" /*RemoteObject*/ ,BA.ObjectToString("MainPageLayout"));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backpanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("backPanel_Touch (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("backpanel_touch")) { return __ref.runUserSub(false, "b4xmainpage","backpanel_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 113;BA.debugLine="Private Sub backPanel_Touch (Action As Int, X As F";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 115;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPageLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private WebView1 As WebView";
b4xmainpage._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");__ref.setField("_webview1",b4xmainpage._webview1);
 //BA.debugLineNum = 13;BA.debugLine="Private recordPanel As Panel";
b4xmainpage._recordpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_recordpanel",b4xmainpage._recordpanel);
 //BA.debugLineNum = 14;BA.debugLine="Private audioPanel As Panel";
b4xmainpage._audiopanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_audiopanel",b4xmainpage._audiopanel);
 //BA.debugLineNum = 15;BA.debugLine="Private videoPanel As Panel";
b4xmainpage._videopanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_videopanel",b4xmainpage._videopanel);
 //BA.debugLineNum = 16;BA.debugLine="Private testPanel As Panel";
b4xmainpage._testpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_testpanel",b4xmainpage._testpanel);
 //BA.debugLineNum = 17;BA.debugLine="Private donatePanel As Panel";
b4xmainpage._donatepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_donatepanel",b4xmainpage._donatepanel);
 //BA.debugLineNum = 18;BA.debugLine="Private merchPanel As Panel";
b4xmainpage._merchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_merchpanel",b4xmainpage._merchpanel);
 //BA.debugLineNum = 19;BA.debugLine="Private iyView As ImageView";
b4xmainpage._iyview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_iyview",b4xmainpage._iyview);
 //BA.debugLineNum = 20;BA.debugLine="Private LayoutHome As String";
b4xmainpage._layouthome = RemoteObject.createImmutable("");__ref.setField("_layouthome",b4xmainpage._layouthome);
 //BA.debugLineNum = 21;BA.debugLine="Private iYWebView As ImageView";
b4xmainpage._iywebview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_iywebview",b4xmainpage._iywebview);
 //BA.debugLineNum = 22;BA.debugLine="Private webBackButton As Label";
b4xmainpage._webbackbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_webbackbutton",b4xmainpage._webbackbutton);
 //BA.debugLineNum = 23;BA.debugLine="Private ytubeView As ImageView";
b4xmainpage._ytubeview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_ytubeview",b4xmainpage._ytubeview);
 //BA.debugLineNum = 24;BA.debugLine="Private faceView As ImageView";
b4xmainpage._faceview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_faceview",b4xmainpage._faceview);
 //BA.debugLineNum = 25;BA.debugLine="Private instaView As ImageView";
b4xmainpage._instaview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_instaview",b4xmainpage._instaview);
 //BA.debugLineNum = 26;BA.debugLine="Private backPanel As Panel";
b4xmainpage._backpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_backpanel",b4xmainpage._backpanel);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _donatepanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("donatePanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("donatepanel_click")) { return __ref.runUserSub(false, "b4xmainpage","donatepanel_click", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Private Sub donatePanel_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(8192);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 79;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 80;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/donate";
Debug.ShouldStop(32768);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.itsyours.org/donate/")));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _faceview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("faceView_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("faceview_click")) { return __ref.runUserSub(false, "b4xmainpage","faceview_click", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Private Sub faceView_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(128);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 105;BA.debugLine="WebView1.loadurl(\"https://www.facebook.com/itsYou";
Debug.ShouldStop(256);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.facebook.com/itsYours.org/")));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _instaview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("instaView_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("instaview_click")) { return __ref.runUserSub(false, "b4xmainpage","instaview_click", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Private Sub instaView_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 110;BA.debugLine="WebView1.loadurl(\"https://www.instagram.com/iynon";
Debug.ShouldStop(8192);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.instagram.com/iynonprofit/")));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iyview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("iyView_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("iyview_click")) { return __ref.runUserSub(false, "b4xmainpage","iyview_click", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Private Sub iyView_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Select LayoutHome";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(__ref.getField(true,"_layouthome" /*RemoteObject*/ ),BA.ObjectToString("MainPageLayout"))) {
case 0: {
 break; }
default: {
 BA.debugLineNum = 46;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPageLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 47;BA.debugLine="LayoutHome = \"MainPageLayout\"";
Debug.ShouldStop(16384);
__ref.setField ("_layouthome" /*RemoteObject*/ ,BA.ObjectToString("MainPageLayout"));
 break; }
}
;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iywebview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("iYWebView_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("iywebview_click")) { return __ref.runUserSub(false, "b4xmainpage","iywebview_click", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Private Sub iYWebView_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 91;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPageLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _merchpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("merchPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("merchpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","merchpanel_click", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Private Sub merchPanel_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 85;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 86;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/produc";
Debug.ShouldStop(2097152);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.itsyours.org/product/its-yours-t-shirt/")));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recordpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("recordPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("recordpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","recordpanel_click", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Private Sub recordPanel_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 59;BA.debugLine="Root.LoadLayout(\"selectrecord\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("selectrecord")),__ref.getField(false, "ba"));
 BA.debugLineNum = 60;BA.debugLine="LayoutHome = \"selectrecord\"";
Debug.ShouldStop(134217728);
__ref.setField ("_layouthome" /*RemoteObject*/ ,BA.ObjectToString("selectrecord"));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("testPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("testpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","testpanel_click", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Private Sub testPanel_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(128);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 73;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(256);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/testim";
Debug.ShouldStop(512);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.itsyours.org/testimonies/")));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _videopanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("videoPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("videopanel_click")) { return __ref.runUserSub(false, "b4xmainpage","videopanel_click", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Private Sub videoPanel_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="xui.MsgboxAsync(\"Load video record!\", \"Video clic";
Debug.ShouldStop(8);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Load video record!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Video clicked"))));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webbackbutton_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("webBackButton_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("webbackbutton_click")) { return __ref.runUserSub(false, "b4xmainpage","webbackbutton_click", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Private Sub webBackButton_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="WebView1.Back";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("Back");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ytubeview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ytubeView_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("ytubeview_click")) { return __ref.runUserSub(false, "b4xmainpage","ytubeview_click", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Private Sub ytubeView_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(4);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 100;BA.debugLine="WebView1.loadurl(\"https://www.youtube.com/channel";
Debug.ShouldStop(8);
__ref.getField(false,"_webview1" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.youtube.com/channel/UC41X0QO8aeiP5ClWoXhkeRQ")));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}