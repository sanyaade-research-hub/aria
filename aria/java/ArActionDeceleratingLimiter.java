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

public class ArActionDeceleratingLimiter extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionDeceleratingLimiter(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionDeceleratingLimiterUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionDeceleratingLimiter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArActionDeceleratingLimiter(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArActionDeceleratingLimiter(String name, ArActionDeceleratingLimiter.LimiterType type) {
    this(AriaJavaJNI.new_ArActionDeceleratingLimiter__SWIG_0(name, type.swigValue()), true);
  }

  public ArActionDeceleratingLimiter(String name) {
    this(AriaJavaJNI.new_ArActionDeceleratingLimiter__SWIG_1(name), true);
  }

  public ArActionDeceleratingLimiter() {
    this(AriaJavaJNI.new_ArActionDeceleratingLimiter__SWIG_2(), true);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionDeceleratingLimiter_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionDeceleratingLimiter_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed, double slowSpeed, double sideClearanceAtFastSpeed, double paddingAtFastSpeed, double fastSpeed, double preferredDecel, boolean useEStop, double maxEmergencyDecel) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_0(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed, slowSpeed, sideClearanceAtFastSpeed, paddingAtFastSpeed, fastSpeed, preferredDecel, useEStop, maxEmergencyDecel);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed, double slowSpeed, double sideClearanceAtFastSpeed, double paddingAtFastSpeed, double fastSpeed, double preferredDecel, boolean useEStop) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_1(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed, slowSpeed, sideClearanceAtFastSpeed, paddingAtFastSpeed, fastSpeed, preferredDecel, useEStop);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed, double slowSpeed, double sideClearanceAtFastSpeed, double paddingAtFastSpeed, double fastSpeed, double preferredDecel) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_2(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed, slowSpeed, sideClearanceAtFastSpeed, paddingAtFastSpeed, fastSpeed, preferredDecel);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed, double slowSpeed, double sideClearanceAtFastSpeed, double paddingAtFastSpeed, double fastSpeed) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_3(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed, slowSpeed, sideClearanceAtFastSpeed, paddingAtFastSpeed, fastSpeed);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed, double slowSpeed, double sideClearanceAtFastSpeed, double paddingAtFastSpeed) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_4(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed, slowSpeed, sideClearanceAtFastSpeed, paddingAtFastSpeed);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed, double slowSpeed, double sideClearanceAtFastSpeed) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_5(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed, slowSpeed, sideClearanceAtFastSpeed);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed, double slowSpeed) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_6(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed, slowSpeed);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed, double paddingAtSlowSpeed) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_7(swigCPtr, this, clearance, sideClearanceAtSlowSpeed, paddingAtSlowSpeed);
  }

  public void setParameters(double clearance, double sideClearanceAtSlowSpeed) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_8(swigCPtr, this, clearance, sideClearanceAtSlowSpeed);
  }

  public void setParameters(double clearance) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_9(swigCPtr, this, clearance);
  }

  public void setParameters() {
    AriaJavaJNI.ArActionDeceleratingLimiter_setParameters__SWIG_10(swigCPtr, this);
  }

  public ArActionDeceleratingLimiter.LimiterType getType() {
    return ArActionDeceleratingLimiter.LimiterType.swigToEnum(AriaJavaJNI.ArActionDeceleratingLimiter_getType(swigCPtr, this));
  }

  public void setType(ArActionDeceleratingLimiter.LimiterType type) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setType(swigCPtr, this, type.swigValue());
  }

  public void addToConfig(ArConfig config, String section, String prefix) {
    AriaJavaJNI.ArActionDeceleratingLimiter_addToConfig__SWIG_0(swigCPtr, this, ArConfig.getCPtr(config), config, section, prefix);
  }

  public void addToConfig(ArConfig config, String section) {
    AriaJavaJNI.ArActionDeceleratingLimiter_addToConfig__SWIG_1(swigCPtr, this, ArConfig.getCPtr(config), config, section);
  }

  public boolean getUseLocationDependentDevices() {
    return AriaJavaJNI.ArActionDeceleratingLimiter_getUseLocationDependentDevices(swigCPtr, this);
  }

  public void setUseLocationDependentDevices(boolean useLocationDependentDevices) {
    AriaJavaJNI.ArActionDeceleratingLimiter_setUseLocationDependentDevices(swigCPtr, this, useLocationDependentDevices);
  }

  public final static class LimiterType {
    public final static LimiterType FORWARDS = new LimiterType("FORWARDS");
    public final static LimiterType BACKWARDS = new LimiterType("BACKWARDS");
    public final static LimiterType LATERAL_LEFT = new LimiterType("LATERAL_LEFT");
    public final static LimiterType LATERAL_RIGHT = new LimiterType("LATERAL_RIGHT");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static LimiterType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + LimiterType.class + " with value " + swigValue);
    }

    private LimiterType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private LimiterType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private LimiterType(String swigName, LimiterType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static LimiterType[] swigValues = { FORWARDS, BACKWARDS, LATERAL_LEFT, LATERAL_RIGHT };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}