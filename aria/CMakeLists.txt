option (ARIA_BUILD_STATIC "Build Aria static libraries" OFF)
#option (ARIA_BUILD_PYTHON "Build Aria Python wrappers" OFF)
#option (ARIA_BUILD_JAVA "Build Aria Java wrappers" OFF)
#option (ARIA_BUILD_EXAMPLES "Build Aria examples" OFF)
#option (ARIA_BUILD_ADVANCED_EXAMPLES "Build Aria advanced examples" OFF)

set(aria_PKGCONFIG_FILE aria.pc)
configure_file(${aria_PKGCONFIG_FILE}.in ${aria_PKGCONFIG_FILE} @ONLY)
install(FILES ${CMAKE_CURRENT_BINARY_DIR}/${aria_PKGCONFIG_FILE} DESTINATION lib/pkgconfig)

set (ARIA_SRCS ArAction.cpp ArActionAvoidFront.cpp
	ArActionAvoidSide.cpp ArActionBumpers.cpp ArActionColorFollow.cpp
	ArActionConstantVelocity.cpp ArActionDeceleratingLimiter.cpp
	ArActionDesired.cpp ArActionDriveDistance.cpp ArActionGoto.cpp
	ArActionGotoStraight.cpp ArActionGroup.cpp ArActionGroups.cpp
	ArActionInput.cpp ArActionIRs.cpp ArActionJoydrive.cpp
	ArActionKeydrive.cpp ArActionLimiterBackwards.cpp
	ArActionLimiterForwards.cpp ArActionLimiterTableSensor.cpp
	ArActionMovementParameters.cpp ArActionRatioInput.cpp
	ArActionRobotJoydrive.cpp ArActionStallRecover.cpp ArActionStop.cpp
	ArActionTriangleDriveTo.cpp ArActionTurn.cpp ArACTS.cpp ArAMPTU.cpp
	ArAnalogGyro.cpp ArArg.cpp ArArgumentBuilder.cpp
	ArArgumentParser.cpp ArASyncTask.cpp ArBasePacket.cpp ArBumpers.cpp
	ArCameraCommands.cpp ArCameraCollection.cpp ArCondition_LIN.cpp
	ArConfig.cpp ArConfigArg.cpp ArConfigGroup.cpp ArDataLogger.cpp
	ArDeviceConnection.cpp ArDPPTU.cpp ArFileParser.cpp
	ArForbiddenRangeDevice.cpp ArFunctorASyncTask.cpp ArGPS.cpp
	ArGPSConnector.cpp ArGPSCoords.cpp ArGripper.cpp ArInterpolation.cpp
	ArIrrfDevice.cpp ArIRs.cpp ArJoyHandler.cpp ArJoyHandler_LIN.cpp
	ArKeyHandler.cpp ArLaser.cpp ArLaserConnector.cpp ArLaserFilter.cpp
	ArLaserLogger.cpp ArLaserReflectorDevice.cpp ArLineFinder.cpp
	ArLMS1XX.cpp ArLMS2xx.cpp ArLMS2xxPacket.cpp
	ArLMS2xxPacketReceiver.cpp ArLog.cpp ArLogFileConnection.cpp
	ArMap.cpp ArMapComponents.cpp ArMapInterface.cpp ArMapObject.cpp
	ArMapUtils.cpp ArMD5Calculator.cpp ArMode.cpp ArModes.cpp
	ArModule.cpp ArModuleLoader.cpp ArMutex.cpp ArMutex_LIN.cpp
	ArNetServer.cpp ArNMEAParser.cpp ArNovatelGPS.cpp ArP2Arm.cpp
	ArPriorityResolver.cpp ArPTZ.cpp ArRangeBuffer.cpp ArRangeDevice.cpp
	ArRangeDeviceThreaded.cpp ArRatioInputKeydrive.cpp
	ArRatioInputJoydrive.cpp ArRatioInputRobotJoydrive.cpp
	ArRecurrentTask.cpp ArRobot.cpp ArRobotConfig.cpp
	ArRobotConfigPacketReader.cpp ArRobotConnector.cpp
	ArRobotJoyHandler.cpp ArRobotPacket.cpp ArRobotPacketReceiver.cpp
	ArRobotPacketSender.cpp ArRobotParams.cpp ArRobotTypes.cpp
	ArRVisionPTZ.cpp ArSerialConnection_LIN.cpp ArSick.cpp
	ArSignalHandler_LIN.cpp ArSimpleConnector.cpp ArSimulatedLaser.cpp
	ArSocket.cpp ArSocket_LIN.cpp ArSonarDevice.cpp ArSensorReading.cpp
	ArSonyPTZ.cpp ArSoundsQueue.cpp ArSoundPlayer.cpp
	ArStringInfoGroup.cpp ArSyncLoop.cpp ArSyncTask.cpp
	ArSystemStatus.cpp ArSonarAutoDisabler.cpp ArSpeech.cpp ArTCM2.cpp
	ArTCMCompassDirect.cpp ArTCMCompassRobot.cpp ArTcpConnection.cpp
	ArThread.cpp ArThread_LIN.cpp ArTransform.cpp ArTrimbleGPS.cpp
	ArUrg.cpp ArUrg_2_0.cpp ArVersalogicIO.cpp ArVCC4.cpp Aria.cpp
	ariaUtil.cpp md5.cpp )

set (ARIA_HDRS ArActionAvoidFront.h ArActionAvoidSide.h
	ArActionBumpers.h ArActionColorFollow.h ArActionConstantVelocity.h
	ArActionDeceleratingLimiter.h ArActionDesired.h
	ArActionDriveDistance.h ArActionGoto.h ArActionGotoStraight.h
	ArActionGroup.h ArActionGroups.h ArAction.h ArActionInput.h
	ArActionIRs.h ArActionJoydrive.h ArActionKeydrive.h
	ArActionLimiterBackwards.h ArActionLimiterForwards.h
	ArActionLimiterTableSensor.h ArActionMovementParameters.h
	ArActionRatioInput.h ArActionRobotJoydrive.h ArActionStallRecover.h
	ArActionStop.h ArActionTriangleDriveTo.h ArActionTurn.h ArACTS.h
	ArAMPTU.h ArAnalogGyro.h ArArg.h ArArgumentBuilder.h
	ArArgumentParser.h ArASyncTask.h ArBasePacket.h ArBumpers.h
	ArCameraCollection.h ArCameraCommands.h ArCommands.h ArCondition.h
	ArConfigArg.h ArConfigGroup.h ArConfig.h ArDataLogger.h
	ArDeviceConnection.h ArDPPTU.h ArDrawingData.h ArExport.h
	ArFileParser.h ArForbiddenRangeDevice.h ArFunctorASyncTask.h
	ArFunctor.h ArGPSConnector.h ArGPSCoords.h ArGPS.h ArGripper.h
	Aria.h ariaInternal.h ariaOSDef.h ariaTypedefs.h ariaUtil.h
	ArInterpolation.h ArIrrfDevice.h ArIRs.h ArJoyHandler.h
	ArKeyHandler.h ArLaserConnector.h ArLaserFilter.h ArLaser.h
	ArLaserLogger.h ArLaserReflectorDevice.h ArLineFinder.h ArLMS1XX.h
	ArLMS2xx.h ArLMS2xxPacket.h ArLMS2xxPacketReceiver.h
	ArLogFileConnection.h ArLog.h ArMapComponents.h ArMap.h
	ArMapInterface.h ArMapObject.h ArMapUtils.h ArMD5Calculator.h
	ArMode.h ArModes.h ArModule.h ArModuleLoader.h ArMutex.h
	ArNetServer.h ArNMEAParser.h ArNovatelGPS.h ArP2Arm.h
	ArPixelDevice.h ArPriorityResolver.h ArPTZ.h ArRangeBuffer.h
	ArRangeDevice.h ArRangeDeviceThreaded.h ArRatioInputJoydrive.h
	ArRatioInputKeydrive.h ArRatioInputRobotJoydrive.h ArRecurrentTask.h
	ArResolver.h ArRingQueue.h ArRobotConfig.h
	ArRobotConfigPacketReader.h ArRobotConnector.h ArRobot.h
	ArRobotJoyHandler.h ArRobotPacket.h ArRobotPacketReceiver.h
	ArRobotPacketSender.h ArRobotParams.h ArRobotTypes.h ArRVisionPTZ.h
	ArSensorReading.h ArSerialConnection.h ArSick.h ArSignalHandler.h
	ArSimpleConnector.h ArSimulatedLaser.h ArSocket.h
	ArSonarAutoDisabler.h ArSonarDevice.h ArSonyPTZ.h ArSoundPlayer.h
	ArSoundsQueue.h ArSpeech.h ArStringInfoGroup.h ArSyncLoop.h
	ArSyncTask.h ArSystemStatus.h ArTaskState.h ArTCM2.h
	ArTCMCompassDirect.h ArTCMCompassRobot.h ArTcpConnection.h
	ArThread.h ArTransform.h ArTrimbleGPS.h ArUrg_2_0.h ArUrg.h ArVCC4.h
	ArVersalogicIO.h md5.h wrapper_ExtraClasses.h wrapper_Functors.h )
install (FILES ${ARIA_HDRS} DESTINATION ${aria_INCLUDE_DIR})

find_package (Threads)
if (NOT CMAKE_USE_PTHREADS_INIT)
	message(FATAL_ERROR "Could not find pthreads")
endif (NOT CMAKE_USE_PTHREADS_INIT)

add_library (ariaShared SHARED ${ARIA_SRCS})
target_link_libraries (ariaShared ${CMAKE_THREAD_LIBS_INIT} -lrt -ldl)
set_target_properties (ariaShared PROPERTIES
	OUTPUT_NAME aria
	VERSION ${aria_VERSION}
	SOVERSION ${aria_API_VERSION}
	)
install (TARGETS ariaShared DESTINATION ${aria_LIBRARY_DIR})

if (ARIA_BUILD_STATIC)
	add_library(ariaStatic STATIC ${ARIA_SRCS})
	set_target_properties (ariaStatic PROPERTIES
		OUTPUT_NAME aria
	    VERSION ${aria_VERSION}
	    SOVERSION ${aria_API_VERSION}
		)
	target_link_libraries (ariaStatic ${CMAKE_THREAD_LIBS_INIT} -lrt -ldl)
	install (TARGETS ariaStatic DESTINATION ${aria_LIBRARY_DIR})
endif (ARIA_BUILD_STATIC)

#if (ARIA_BUILD_PYTHON)
#	find_package (SWIG REQUIRED)
#	include (${SWIG_USE_FILE})
#
#	find_package (PythonLibs REQUIRED)
#	include_directories (${PYTHON_INCLUDE_PATH})
#
#	include_directories (${ARIA_INCLUDE_DIR})
#
#	set (CMAKE_SWIG_FLAGS "")
#
#	set_source_files_properties (wrapper.i PROPERTIES CPLUSPLUS ON)
#
#	set_source_files_properties (wrapper.i PROPERTIES SWIG_FLAGS "-modern;-Dlinux;-DAREXPORT")
#	swig_add_module (ariapy python wrapper.i)
#	swig_link_libraries (ariapy ${PYTHON_LIBRARIES} ariaShared)
#endif (ARIA_BUILD_PYTHON)

#if (ARIA_BUILD_JAVA)
#	add_subdirectory (java)
#endif (ARIA_BUILD_JAVA)

#if (ARIA_BUILD_EXAMPLES)
#	add_subdirectory (examples)
#endif (ARIA_BUILD_EXAMPLES)

#if (ARIA_BUILD_ADVANCED_EXAMPLES)
#	add_subdirectory (advanced)
#endif (ARIA_BUILD_ADVANCED_EXAMPLES)

add_subdirectory (doc)
