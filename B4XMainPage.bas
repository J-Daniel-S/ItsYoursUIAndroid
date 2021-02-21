B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI

	Private WebView1 As B4XView
	Private recordPanel As Panel
	Private audioPanel As Panel
	Private videoPanel As Panel
	Private aTestPanel As Panel
	Private vTestPanel As Panel
	Private donatePanel As Panel
	Private merchPanel As Panel
	Private iyView As ImageView
	Private LayoutHome As String
	Private iYWebView As ImageView
	Private webBackButton As Label
	Private ytubeView As ImageView
	Private faceView As ImageView
	Private instaView As ImageView
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPageLayout")
	LayoutHome = "MainPageLayout"
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub iyView_Click
	Select LayoutHome
		Case "MainPageLayout"
		Case Else
			Root.LoadLayout("MainPageLayout")
			LayoutHome = "MainPageLayout"
	End Select
End Sub

Private Sub aboutPanel_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub

Private Sub recordPanel_Click
	Root.LoadLayout("selectrecord")
	LayoutHome = "selectrecord"
End Sub

Private Sub audioPanel_Click
	xui.MsgboxAsync("Load audio record!", "Audio clicked")
End Sub

Private Sub videoPanel_Click
	xui.MsgboxAsync("Load video record!", "Video clicked")
End Sub

Private Sub aTestPanel_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub

Private Sub vTestPanel_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub

Private Sub donatePanel_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub

Private Sub merchPanel_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub

Private Sub iYWebView_Click
	Root.LoadLayout("MainPageLayout")
End Sub

Private Sub webBackButton_Click
	xui.MsgboxAsync("Go back", "Back I Tell You!")
End Sub

Private Sub ytubeView_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub

Private Sub faceView_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub

Private Sub instaView_Click
	Root.LoadLayout("WebView")
'	WebView1.loadurl("https://www.itsyours.org/about-us/")
End Sub