/*
MobileRobots Advanced Robotics Interface for Applications (ARIA)
Copyright (C) 2004, 2005 ActivMedia Robotics LLC
Copyright (C) 2006, 2007, 2008, 2009 MobileRobots Inc.
Copyright (C) 2010, 2011 Adept Technology, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; 800-639-9481
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class Aria {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public Aria(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(Aria obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_Aria(swigCPtr);
    }
    swigCPtr = 0;
  }

  public static void init(Aria.SigHandleMethod method, boolean initSockets, boolean sigHandleExitNotShutdown) {
    AriaJavaJNI.Aria_init__SWIG_0(method.swigValue(), initSockets, sigHandleExitNotShutdown);
  }

  public static void init(Aria.SigHandleMethod method, boolean initSockets) {
    AriaJavaJNI.Aria_init__SWIG_1(method.swigValue(), initSockets);
  }

  public static void init(Aria.SigHandleMethod method) {
    AriaJavaJNI.Aria_init__SWIG_2(method.swigValue());
  }

  public static void init() {
    AriaJavaJNI.Aria_init__SWIG_3();
  }

  public static void uninit() {
    AriaJavaJNI.Aria_uninit();
  }

  public static void addInitCallBack(ArFunctor cb, ArListPos.Pos position) {
    AriaJavaJNI.Aria_addInitCallBack(ArFunctor.getCPtr(cb), cb, position.swigValue());
  }

  public static void addUninitCallBack(ArFunctor cb, ArListPos.Pos position) {
    AriaJavaJNI.Aria_addUninitCallBack(ArFunctor.getCPtr(cb), cb, position.swigValue());
  }

  public static void shutdown() {
    AriaJavaJNI.Aria_shutdown();
  }

  public static void exit(int exitCode) {
    AriaJavaJNI.Aria_exit__SWIG_0(exitCode);
  }

  public static void exit() {
    AriaJavaJNI.Aria_exit__SWIG_1();
  }

  public static boolean getRunning() {
    return AriaJavaJNI.Aria_getRunning();
  }

  public static void setDirectory(String directory) {
    AriaJavaJNI.Aria_setDirectory(directory);
  }

  public static String getDirectory() {
    return AriaJavaJNI.Aria_getDirectory();
  }

  public static boolean parseArgs() {
    return AriaJavaJNI.Aria_parseArgs();
  }

  public static void logOptions() {
    AriaJavaJNI.Aria_logOptions();
  }

  public static void setKeyHandler(ArKeyHandler keyHandler) {
    AriaJavaJNI.Aria_setKeyHandler(ArKeyHandler.getCPtr(keyHandler), keyHandler);
  }

  public static ArKeyHandler getKeyHandler() {
    long cPtr = AriaJavaJNI.Aria_getKeyHandler();
    return (cPtr == 0) ? null : new ArKeyHandler(cPtr, false);
  }

  public static void setJoyHandler(ArJoyHandler joyHandler) {
    AriaJavaJNI.Aria_setJoyHandler(ArJoyHandler.getCPtr(joyHandler), joyHandler);
  }

  public static ArJoyHandler getJoyHandler() {
    long cPtr = AriaJavaJNI.Aria_getJoyHandler();
    return (cPtr == 0) ? null : new ArJoyHandler(cPtr, false);
  }

  public static void addExitCallback(ArFunctor functor, int position) {
    AriaJavaJNI.Aria_addExitCallback__SWIG_0(ArFunctor.getCPtr(functor), functor, position);
  }

  public static void addExitCallback(ArFunctor functor) {
    AriaJavaJNI.Aria_addExitCallback__SWIG_1(ArFunctor.getCPtr(functor), functor);
  }

  public static void remExitCallback(ArFunctor functor) {
    AriaJavaJNI.Aria_remExitCallback(ArFunctor.getCPtr(functor), functor);
  }

  public static void setExitCallbacksLogLevel(ArLog.LogLevel level) {
    AriaJavaJNI.Aria_setExitCallbacksLogLevel(level.swigValue());
  }

  public static void exitOld(int exitCode) {
    AriaJavaJNI.Aria_exitOld__SWIG_0(exitCode);
  }

  public static void exitOld() {
    AriaJavaJNI.Aria_exitOld__SWIG_1();
  }

  public static void signalHandlerCB(int sig) {
    AriaJavaJNI.Aria_signalHandlerCB(sig);
  }

  public static void callExitCallbacks() {
    AriaJavaJNI.Aria_callExitCallbacks();
  }

  public static void addParseArgsCB(ArRetFunctor_Bool functor, int position) {
    AriaJavaJNI.Aria_addParseArgsCB__SWIG_0(ArRetFunctor_Bool.getCPtr(functor), functor, position);
  }

  public static void addParseArgsCB(ArRetFunctor_Bool functor) {
    AriaJavaJNI.Aria_addParseArgsCB__SWIG_1(ArRetFunctor_Bool.getCPtr(functor), functor);
  }

  public static void setParseArgLogLevel(ArLog.LogLevel level) {
    AriaJavaJNI.Aria_setParseArgLogLevel(level.swigValue());
  }

  public static void addLogOptionsCB(ArFunctor functor, int position) {
    AriaJavaJNI.Aria_addLogOptionsCB__SWIG_0(ArFunctor.getCPtr(functor), functor, position);
  }

  public static void addLogOptionsCB(ArFunctor functor) {
    AriaJavaJNI.Aria_addLogOptionsCB__SWIG_1(ArFunctor.getCPtr(functor), functor);
  }

  public static boolean deviceConnectionAddCreator(String deviceConnectionType, SWIGTYPE_p_ArRetFunctor3T_ArDeviceConnection_p_char_const_p_char_const_p_char_const_p_t creator) {
    return AriaJavaJNI.Aria_deviceConnectionAddCreator(deviceConnectionType, SWIGTYPE_p_ArRetFunctor3T_ArDeviceConnection_p_char_const_p_char_const_p_char_const_p_t.getCPtr(creator));
  }

  public static String deviceConnectionGetTypes() {
    return AriaJavaJNI.Aria_deviceConnectionGetTypes();
  }

  public static ArDeviceConnection deviceConnectionCreate(String deviceConnectionType, String port, String defaultInfo, String prefix) {
    long cPtr = AriaJavaJNI.Aria_deviceConnectionCreate__SWIG_0(deviceConnectionType, port, defaultInfo, prefix);
    return (cPtr == 0) ? null : new ArDeviceConnection(cPtr, false);
  }

  public static ArDeviceConnection deviceConnectionCreate(String deviceConnectionType, String port, String defaultInfo) {
    long cPtr = AriaJavaJNI.Aria_deviceConnectionCreate__SWIG_1(deviceConnectionType, port, defaultInfo);
    return (cPtr == 0) ? null : new ArDeviceConnection(cPtr, false);
  }

  public static void setRobotJoyHandler(ArRobotJoyHandler robotJoyHandler) {
    AriaJavaJNI.Aria_setRobotJoyHandler(ArRobotJoyHandler.getCPtr(robotJoyHandler), robotJoyHandler);
  }

  public static ArRobotJoyHandler getRobotJoyHandler() {
    long cPtr = AriaJavaJNI.Aria_getRobotJoyHandler();
    return (cPtr == 0) ? null : new ArRobotJoyHandler(cPtr, false);
  }

  public static ArConfig getConfig() {
    long cPtr = AriaJavaJNI.Aria_getConfig();
    return (cPtr == 0) ? null : new ArConfig(cPtr, false);
  }

  public static ArStringInfoGroup getInfoGroup() {
    long cPtr = AriaJavaJNI.Aria_getInfoGroup();
    return (cPtr == 0) ? null : new ArStringInfoGroup(cPtr, false);
  }

  public static void addRobot(ArRobot robot) {
    AriaJavaJNI.Aria_addRobot(ArRobot.getCPtr(robot), robot);
  }

  public static void delRobot(ArRobot robot) {
    AriaJavaJNI.Aria_delRobot(ArRobot.getCPtr(robot), robot);
  }

  public static ArRobot findRobot(String name) {
    long cPtr = AriaJavaJNI.Aria_findRobot(name);
    return (cPtr == 0) ? null : new ArRobot(cPtr, false);
  }

  public static SWIGTYPE_p_std__listT_ArRobot_p_t getRobotList() {
    long cPtr = AriaJavaJNI.Aria_getRobotList();
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__listT_ArRobot_p_t(cPtr, false);
  }

  public static int getMaxNumLasers() {
    return AriaJavaJNI.Aria_getMaxNumLasers();
  }

  public static void setMaxNumLasers(int maxNumLasers) {
    AriaJavaJNI.Aria_setMaxNumLasers(maxNumLasers);
  }

  public static boolean laserAddCreator(String laserType, SWIGTYPE_p_ArRetFunctor2T_ArLaser_p_int_char_const_p_t creator) {
    return AriaJavaJNI.Aria_laserAddCreator(laserType, SWIGTYPE_p_ArRetFunctor2T_ArLaser_p_int_char_const_p_t.getCPtr(creator));
  }

  public static String laserGetTypes() {
    return AriaJavaJNI.Aria_laserGetTypes();
  }

  public static ArLaser laserCreate(String laserType, int laserNumber, String prefix) {
    long cPtr = AriaJavaJNI.Aria_laserCreate__SWIG_0(laserType, laserNumber, prefix);
    return (cPtr == 0) ? null : new ArLaser(cPtr, false);
  }

  public static ArLaser laserCreate(String laserType, int laserNumber) {
    long cPtr = AriaJavaJNI.Aria_laserCreate__SWIG_1(laserType, laserNumber);
    return (cPtr == 0) ? null : new ArLaser(cPtr, false);
  }

  public Aria() {
    this(AriaJavaJNI.new_Aria(), true);
  }

  public final static class SigHandleMethod {
    public final static SigHandleMethod SIGHANDLE_SINGLE = new SigHandleMethod("SIGHANDLE_SINGLE");
    public final static SigHandleMethod SIGHANDLE_THREAD = new SigHandleMethod("SIGHANDLE_THREAD");
    public final static SigHandleMethod SIGHANDLE_NONE = new SigHandleMethod("SIGHANDLE_NONE");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static SigHandleMethod swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + SigHandleMethod.class + " with value " + swigValue);
    }

    private SigHandleMethod(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private SigHandleMethod(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private SigHandleMethod(String swigName, SigHandleMethod swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static SigHandleMethod[] swigValues = { SIGHANDLE_SINGLE, SIGHANDLE_THREAD, SIGHANDLE_NONE };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
