include_directories (${ARIA_INCLUDE_DIR} ${ARNETWORKING_INCLUDE_DIR})

set (ARNETWORKING_EXAMPLES_SRCS
	clientDemo.cpp
	popupExample.cpp
	serverDemo.cpp
	drawingsExampleWithRobot.cpp
	configServerRobot.cpp
	simpleServerExample.cpp
	configClientToServer.cpp
	ptzCameraClientExample.cpp
	configServer.cpp
	drawingsExample.cpp
	clientCommandLister.cpp
	getVideoExample.cpp
	configClient.cpp
	)

foreach (EXAMPLE_SRC ${ARNETWORKING_EXAMPLES_SRCS})
	string (REPLACE ".cpp" "" EXAMPLE ${EXAMPLE_SRC})
	add_executable (${EXAMPLE} ${EXAMPLE_SRC})
	target_link_libraries (${EXAMPLE} arnetworkingShared)
endforeach (EXAMPLE_SRC)