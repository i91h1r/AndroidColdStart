# AndroidColdStart
Android 冷启动，优化app启动速度(视觉上提高启动速度)
###一 介绍：
默认情况下，当app启动时候会出现一小段时间的空白现象。<br>
<br>**出现这种现象的原因**：

*  当用户点击一个没有执行过的应用后到执行Activity.onCreat() 这个时间会比较长，还会出现白色的背景现象。这是因为当启动一个应用，系统会先解析启动Activity的Theme,根据里面的元素绘制出一个初始的界面，如主题定义的状态栏颜色和窗口的背景，当系统加载完所有的资源并启动Activity的onCreate()之后，然后再把初始界面替换为Activity的实际layout的界面

#####效果：<br>![](https://github.com/hyr0318/AndroidColdStart/blob/master/image/coldstart.gif)![](https://github.com/hyr0318/AndroidColdStart/blob/master/image/no_coldstart.gif)

###使用：
*	首先在style.xml 中定义一个新的主题<br>`    <style name="AppTheme.Launcher">
   <item name="android:windowBackground">@drawable/launch_screen</item>
   </style>`
* launch_screen :<br><pre>
   `<?xml version="1.0" encoding="utf-8"?>
	<layer-list xmlns:android="http://schemas.android.com/apk/res/android"
		 android:opacity="opaque">
    		<item android:drawable="@android:color/white"/> 
	<item>
        <bitmap
            android:src="@drawable/googlelogo"
            android:gravity="center"/>
    	</item>
	</layer-list>`</pre>
