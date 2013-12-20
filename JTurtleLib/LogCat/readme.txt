LogCat Readme
-------------

LogCat assumes that adb (and for Windows some additional DLLs) resides in 
the subdirectory .jdroidtools of user home directory <userhome).

When started, it first checks if there is an attached device (emulator or real device).
If no device is found, the program exits with an error message.

If a device is found, the command 'adb logcat <filter>' is spawned, 
where <filter> is the only command line option. If no command line
option is given, 'adb logcat' is spawned.

The starter applications ExecDebugNNN.jar spawns LogCat.jar with the following filters:

ExecDebugAplu.jar : *:S ch.aplu.android:V  (displays JDroidLib message only)
ExecDebugRT.jar : *:S AndroidRuntime:E ch.aplu.android:V (also displays realtime messages)
ExecDebugAll.jar : no filter (displays all messages)


Installation:
------------

Copy the distributed jdroidtoolsXXX (XXX indicates your OS) as .jdroidtools (don't forget
the leading period) in your home directory and create links to the 
ExecDebugNNN.jar (or call LogCat.jar with the filter you want).
