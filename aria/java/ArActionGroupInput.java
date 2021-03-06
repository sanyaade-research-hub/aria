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

public class ArActionGroupInput extends ArActionGroup {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionGroupInput(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionGroupInputUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionGroupInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArActionGroupInput(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArActionGroupInput(ArRobot robot) {
    this(AriaJavaJNI.new_ArActionGroupInput(ArRobot.getCPtr(robot), robot), true);
  }

  public void setVel(double vel) {
    AriaJavaJNI.ArActionGroupInput_setVel(swigCPtr, this, vel);
  }

  public void setRotVel(double rotVel) {
    AriaJavaJNI.ArActionGroupInput_setRotVel(swigCPtr, this, rotVel);
  }

  public void setHeading(double heading) {
    AriaJavaJNI.ArActionGroupInput_setHeading(swigCPtr, this, heading);
  }

  public void deltaHeadingFromCurrent(double delta) {
    AriaJavaJNI.ArActionGroupInput_deltaHeadingFromCurrent(swigCPtr, this, delta);
  }

  public void clear() {
    AriaJavaJNI.ArActionGroupInput_clear(swigCPtr, this);
  }

  public ArActionInput getActionInput() {
    long cPtr = AriaJavaJNI.ArActionGroupInput_getActionInput(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionInput(cPtr, false);
  }

}
