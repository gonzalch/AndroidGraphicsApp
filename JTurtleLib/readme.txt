JTurtleLib Framework
An Education Oriented Java Package To Develop Turtle Apps For Android 
Smartphones
Version 1.26, July 23, 2013
==========================================================================

See http://www.jturtlelib.ch for most recent information.

History of JTurtleLib:
----------------------
V1.00 - Aug 2011: - First public release
V1.01 - Aug 2012: - Fixed: Hidden turtle now remains hidden when setColor() is called
                  - Modified: While the global turtle was never shown, its speed
                    is MAXSPEED. After it has been shown the first time, its
                    speed is 5.
                  - Fixed: The pen width is now set individually 
                  - Modified: Improved line quality for thick lines in animated mode
V1.02 - Aug 2012: - Added: Turtle.fill(), Turtle.fill(x, y) fills with current pen color
                  - Modified; number of rotatable sprites set to 36 (10 degrees 
                    angle resolution) to save memory
                  - Modified: Turtle ctor from Turtle(color, x, y) to Turtle(x, y, color)
                  - Added: Turtle.isOnBorder()
                  - Added: Playground ctor with turtle image file
                  - Added: Turtle.setSize()
V.1.03 - Aug 2012 - Fixed: Playground.isOnBorder() now works
                  - Removed: Turtle.fill() with color (current pen color used)
                  - Added: Turtle.fillToPoint(), fillToHorizontal(), 
                    fillToVertical(), fillOff() (same for global turtle)
                  - Added: Turtle.isForwardValid(), Turtle.isBackValid()
V1.04 - Aug 2012  - Added to class Playground: readString(), readStringWithCancel(),
                    readInt(), readDouble(), showValue()
V1.05 - Aug 2012  - Fixed: Turtle.setColor() now changes color in emulator too
                  - Fixed: Turtle.setSize() now takes the current turtle color
                  - Fixed: Turtle.setColor() now takes the current turtle size
                  - Modified: addActor() changed to addActorNoRefresh() to avoid
                    flickering
V1.06 - Aug 2012  - Modified: Global turtle is white now (user request)
                  - Added: Turtle.clone()
V1.07 - Sep 2012  - Modifications to JDroidLib only
V1.08 - Sep 2012  - New implementation of animated turtle traces (less spiky)
V1.09 - Sep 2012  - Modifications to JDroidLib only
V1.10 - Sep 2012  - Fixed: fillToPoint(), fillToHorizontal(), fillToVertical()
                    now fill correctly (wrong after new implementation of traces)
V1.11 - Sep 2012  - Fixed: removed Moire artifact with fillToPoint()
                  - Fixed: Turtle.clear() does no longer change
                    playground border size when penWidth is greater than 1
                  - Fixed: Turtle movement without flickering when
                    using many threads (e.g with playgroundPressed()) 
V1.12 - Sep 2012  - Modifications to JDroidLib only
V1.13 - Oct 2012  - Modified: No title bar in portrait mode
                  - Modified: Custom toast at startup
V1.14 - Oct 2012  - Modifications to JDroidLib only
V1.15 - Oct 2012  - Modifications to JDroidLib only 
V1.16 - Nov 2012  - Modifications to JDroidLib only 
V1.17 - Dec 2012  - Modifications to JDroidLib only 
V1.18 - Dec 2012  - Modifications to JDroidLib only 
V1.19 - Dec 2012  - Modifications to JDroidLib only 
V1.20 - Dec 2012  - Modified: GameGrid.playgroundFling() renamed to
                    GameGrid.playgroundFlung() with additional parameters
                  - Added: Playgroundd.getTurtlesNear(), Playground.getTopTurtleNear()
V1.21 - Jan 2013  - Fixed: Turtle.setSpeed() now takes int again
V1.22 - Feb 2013  - Modifications to JDroidLib only 
V1.23 - May 2013  - Added support for multi-touch events 
                    GameGrid.playgroundPressed(x, y, id), 
                    GameGrid.playgroundReleased(x, y, id), 
                    GameGrid.playgroundDragged(x, y, id), 
                  - Added: GameGrid.setDragEnabled(), setMultiDragEnabled()
                    (disabled by default)
V1.24 - May 2013  - Modifications to JDroidLib only 
V1.25 - Jun 2013  - Modifications to JDroidLib only 
V1.26 - Jul 2013  - Modifications to JDroidLib only 



Distribution folders:

- App: Sample apps for Android smartphones/tablets that supports Android V2.2 up

- Tutorial: Apps that are part of the JDroidLib or JTurtleLib tutorial 
  on website www.aplu.ch/android or www.aplu.ch/jturtlelib

- Lib: JDroidLib.jar/TcpALib.jar or JTurtleLib.jar  library files

- Doc: The JavaDoc for JDroidLib/TcpALib or JTurtleLib

- ProjectBuilder_Desktop: the GUI version of the project builder, including source

- ProjectBuilder_App: App creating JDroidLib/JTurtleLib projects for AIDE

- LogCat: a user friendly interface to the Android Debug Logger

- InstallUSBLinux: USB device installer for Android smartphones (under Linux)

- InstallationAndUse: This installation guide



Installation and Use
--------------------

Consult jdroidinstall.pdf in subfolder InstallationAndUse.

For any help or suggestions send an e-mail to support@aplu.ch or post an article
to the forum at http://www.aplu.ch/forum.

Enjoy!
