# AndroidColdStart
Android 冷启动，优化app启动速度(视觉上提高启动速度)
###一 介绍：
默认情况下，当app启动时候会出现一小段时间的空白现象。<br>
<br>**出现这种现象的原因**：

*  当用户点击app时候到系统调用Activity.onCreat() 这个时间内，WindowManager会首先预览Theme中的windowBackground为背景，然后再加载activity中的layout布局

#####效果：<br>
默认情况下：![image](https://github.com/hyr0318/AndroidColdStart/blob/master/image/no_coldstart.gif)<br>
优化情况下：![image](https://github.com/hyr0318/AndroidColdStart/blob/master/image/no_coldstart.gif)
