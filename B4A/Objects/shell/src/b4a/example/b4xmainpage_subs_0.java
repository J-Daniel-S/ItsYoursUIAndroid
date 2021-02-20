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
 BA.debugLineNum = 52;BA.debugLine="Root.LoadLayout(\"WebView\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _atestpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("aTestPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("atestpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","atestpanel_click", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Private Sub aTestPanel_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("audioPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("audiopanel_click")) { return __ref.runUserSub(false, "b4xmainpage","audiopanel_click", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Private Sub audioPanel_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="xui.MsgboxAsync(\"Load audio record!\", \"Audio clic";
Debug.ShouldStop(536870912);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Load audio record!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Audio clicked"))));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 30;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Root = Root1";
Debug.ShouldStop(1073741824);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 32;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPageLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="LayoutHome = \"MainPageLayout\"";
Debug.ShouldStop(1);
__ref.setField ("_layouthome" /*RemoteObject*/ ,BA.ObjectToString("MainPageLayout"));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 12;BA.debugLine="Private Label1 As Label";
b4xmainpage._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",b4xmainpage._label1);
 //BA.debugLineNum = 13;BA.debugLine="Private WebView1 As B4XView";
b4xmainpage._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_webview1",b4xmainpage._webview1);
 //BA.debugLineNum = 14;BA.debugLine="Private recordPanel As Panel";
b4xmainpage._recordpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_recordpanel",b4xmainpage._recordpanel);
 //BA.debugLineNum = 15;BA.debugLine="Private audioPanel As Panel";
b4xmainpage._audiopanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_audiopanel",b4xmainpage._audiopanel);
 //BA.debugLineNum = 16;BA.debugLine="Private videoPanel As Panel";
b4xmainpage._videopanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_videopanel",b4xmainpage._videopanel);
 //BA.debugLineNum = 17;BA.debugLine="Private aTestPanel As Panel";
b4xmainpage._atestpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_atestpanel",b4xmainpage._atestpanel);
 //BA.debugLineNum = 18;BA.debugLine="Private vTestPanel As Panel";
b4xmainpage._vtestpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_vtestpanel",b4xmainpage._vtestpanel);
 //BA.debugLineNum = 19;BA.debugLine="Private donatePanel As Panel";
b4xmainpage._donatepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_donatepanel",b4xmainpage._donatepanel);
 //BA.debugLineNum = 20;BA.debugLine="Private merchPanel As Panel";
b4xmainpage._merchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_merchpanel",b4xmainpage._merchpanel);
 //BA.debugLineNum = 21;BA.debugLine="Private iyView As ImageView";
b4xmainpage._iyview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_iyview",b4xmainpage._iyview);
 //BA.debugLineNum = 22;BA.debugLine="Private LayoutHome As String";
b4xmainpage._layouthome = RemoteObject.createImmutable("");__ref.setField("_layouthome",b4xmainpage._layouthome);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _donatepanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("donatePanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("donatepanel_click")) { return __ref.runUserSub(false, "b4xmainpage","donatepanel_click", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Private Sub donatePanel_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("iyView_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("iyview_click")) { return __ref.runUserSub(false, "b4xmainpage","iyview_click", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Private Sub iyView_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Select LayoutHome";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(__ref.getField(true,"_layouthome" /*RemoteObject*/ ),BA.ObjectToString("MainPageLayout"))) {
case 0: {
 break; }
default: {
 BA.debugLineNum = 42;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
Debug.ShouldStop(512);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPageLayout")),__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="LayoutHome = \"MainPageLayout\"";
Debug.ShouldStop(1024);
__ref.setField ("_layouthome" /*RemoteObject*/ ,BA.ObjectToString("MainPageLayout"));
 break; }
}
;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "b4xmainpage","label1_click", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPageLayout")),__ref.getField(false, "ba"));
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
public static RemoteObject  _merchpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("merchPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("merchpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","merchpanel_click", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Private Sub merchPanel_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("recordPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("recordpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","recordpanel_click", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Private Sub recordPanel_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Root.LoadLayout(\"selectrecord\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("selectrecord")),__ref.getField(false, "ba"));
 BA.debugLineNum = 58;BA.debugLine="LayoutHome = \"selectrecord\"";
Debug.ShouldStop(33554432);
__ref.setField ("_layouthome" /*RemoteObject*/ ,BA.ObjectToString("selectrecord"));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("videoPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("videopanel_click")) { return __ref.runUserSub(false, "b4xmainpage","videopanel_click", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Private Sub videoPanel_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="xui.MsgboxAsync(\"Load video record!\", \"Video clic";
Debug.ShouldStop(2);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Load video record!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Video clicked"))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vtestpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("vTestPanel_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("vtestpanel_click")) { return __ref.runUserSub(false, "b4xmainpage","vtestpanel_click", __ref);}
 BA.debugLineNum = 73;BA.debugLine="Private Sub vTestPanel_Click";
Debug.ShouldStop(256);
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
}