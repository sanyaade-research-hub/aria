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
#ifndef ARRVISIONPTZ_H
#define ARRVISIONPTZ_H

#include "ariaTypedefs.h"
#include "ArBasePacket.h"
#include "ArPTZ.h"
#include "ArSerialConnection.h"
/// A class for for making commands to send to the RVision camera
/** There are only two functioning ways to put things into this packet,
 * uByteToBuf() and byte2ToBuf;  You
 *  MUST use thse, if you use anything else your commands won't work.  
*/
class ArRVisionPacket: public ArBasePacket
{
public:
  /// Constructor
  AREXPORT ArRVisionPacket(ArTypes::UByte2 bufferSize = 15);
  AREXPORT virtual ~ArRVisionPacket();
  
  AREXPORT virtual void uByteToBuf(ArTypes::UByte val);
  AREXPORT virtual void byte2ToBuf(ArTypes::Byte2 val);
  /// This is a new function, read the details before you try to use it
  AREXPORT void byte2ToBufAtPos(ArTypes::Byte2 val, ArTypes::UByte2 pose);
};

class ArRobot;

/// A class to use the RVision pan tilt zoom unit

class ArRVisionPTZ : public ArPTZ
{
public:
  AREXPORT ArRVisionPTZ(ArRobot *robot);
  AREXPORT virtual ~ArRVisionPTZ();
  
  AREXPORT virtual bool init(void);
  AREXPORT virtual bool pan(double degrees);
  AREXPORT virtual bool panRel(double degrees);
  AREXPORT virtual bool tilt(double degrees);
  AREXPORT virtual bool tiltRel(double degrees);
  AREXPORT virtual bool panTilt(double degreesPan, double degreesTilt);
  AREXPORT virtual bool panTiltRel(double degreesPan, double degreesTilt);
  AREXPORT virtual bool canZoom(void) const { return true; }
  AREXPORT virtual bool zoom(int zoomValue);
  AREXPORT virtual bool zoomRel(int zoomValue);
  AREXPORT virtual double getPan(void) const { return myPan; }
  AREXPORT virtual double getTilt(void) const { return myTilt; }
  AREXPORT virtual int getZoom(void) const { return myZoom; }
  //AREXPORT void getRealPanTilt(void);
  //AREXPORT void getRealZoomPos(void);
  AREXPORT virtual double getMaxPosPan(void) const { return MAX_PAN; }
  AREXPORT virtual double getMaxNegPan(void) const { return MIN_PAN; }
  AREXPORT virtual double getMaxPosTilt(void) const { return MAX_TILT; }
  AREXPORT virtual double getMaxNegTilt(void) const { return MIN_TILT; }
  AREXPORT virtual int getMaxZoom(void) const { return MAX_ZOOM; }
  AREXPORT virtual int getMinZoom(void) const { return MIN_ZOOM; }

  AREXPORT virtual bool canGetRealPanTilt(void) const { return false; }
  AREXPORT virtual bool canGetRealZoom(void) const { return false; }
  AREXPORT virtual bool canGetFOV(void) { return true; }
  /// Gets the field of view at maximum zoom
  AREXPORT virtual double getFOVAtMaxZoom(void) { return 4.4; }
  /// Gets the field of view at minimum zoom
  AREXPORT virtual double getFOVAtMinZoom(void) { return 48.8; }

  //AREXPORT bool packetHandler(ArBasePacket *packet);
  virtual ArBasePacket* readPacket(void);
  enum {
    MAX_PAN = 180, ///< maximum degrees the unit can pan (clockwise from top)
    MIN_PAN = -180, ///< minimum degrees the unit can pan (counterclockwise from top)
    MIN_TILT = -30, ///< minimum degrees the unit can tilt
    MAX_TILT = 60, ///< maximum degrees the unit can tilt
    MIN_ZOOM = 0, ///< minimum value for zoom
    MAX_ZOOM = 32767, ///< maximum value for zoom
    TILT_OFFSET_IN_DEGREES = 38, ///< offset value to convert internal camera coords to world
    PAN_OFFSET_IN_DEGREES = 190 ///< offset value to convert internal camera coords to world
  };
protected:
  void initializePackets(void);
  ArRobot *myRobot;
  double myPan;
  double myTilt;
  int myZoom;
  double myDegToTilt;
  double myDegToPan;
  double myPanOffsetInDegrees;
  double myTiltOffsetInDegrees;
  ArRVisionPacket myPacket;
  ArRVisionPacket myZoomPacket; 
  ArRVisionPacket myPanTiltPacket;
  ArRVisionPacket myInquiryPacket;
  ArDeviceConnection *myConn;
};

#endif // ARRVISIONPTZ_H
