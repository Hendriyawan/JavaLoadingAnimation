# JavaLoadingAnimation
(Java) simple to display loading animation

```
Loading wave = new Loading(true, "Loading message...", LoadingType.WAVE);
wave.start();
//OR
new Loading(true, "Loading message...", LoadingType.WAVE).start();
```
# LoadingType
```
LoadingType.WAVE
```
```
LoadingType.SPINNER
```
# Compile and Running
to compile, you use the AIDE app, then grab the classes.dex.zip file and sign in using the zipsigner app. then rename with filename loading.jar and put in your internal storage (sdcard)
create a new file with the name loading.sh then fill in as follows
```
dalvikvm -classpath /sdcard/loading.jar Main "$@"
```
# Running
open Terminal Emulator app, then type follows
```
localhasot@android:/ sh /sdcard/loading.sh <type>
type :
- wave
- spinner
```


DEMO :<br>
![Alt Text](https://raw.githubusercontent.com/Hendriyawan/JavaLoadingAnimation/master/demo/demo.gif)
