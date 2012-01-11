include_directories (${ARIA_INCLUDE_DIR})

set (EXAMPLES_SRCS
	actionExample.cpp
	actionGroupExample.cpp
	actsColorFollowingExample.cpp
	armExample.cpp
	auxSerialExample.cpp
	configExample.cpp
	demo.cpp
	directMotionExample.cpp
	dpptuExample.cpp
	functorExample.cpp
	gotoActionExample.cpp
	gpsExample.cpp
	gpsRobotTaskExample.cpp
	gripperExample.cpp
	gyroExample.cpp
	ipthru.cpp
	joydriveActionExample.cpp
	joydriveThreaded.cpp
	joydriveUserTask.cpp
	lineFinderExample.cpp
	moduleExample.cpp
	netServerExample.cpp
	robotConnectionCallbacks.cpp
	robotSyncTaskExample.cpp
	sickLogger.cpp
	sickRobotExample.cpp
	sickTeleop.cpp
	simpleConnect.cpp
	simpleMotionCommands.cpp
	socketClientExample.cpp
	socketServerExample.cpp
	sonyPTZDemo.cpp
	soundsQueueExample.cpp
	teleopActionsExample.cpp
	threadExample.cpp
	triangleDriveToActionExample.cpp
	twoRobotWander.cpp
	vcc4CameraExample.cpp
	wanderAndLogData.cpp
	wander.cpp
	)

foreach (EXAMPLE_SRC ${EXAMPLES_SRCS})
	string (REPLACE ".cpp" "" EXAMPLE ${EXAMPLE_SRC})
	add_executable (${EXAMPLE} ${EXAMPLE_SRC})
	target_link_libraries (${EXAMPLE} ariaShared)
endforeach (EXAMPLE_SRC)