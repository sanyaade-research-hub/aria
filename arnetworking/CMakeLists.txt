option (ARNETWORKING_BUILD_STATIC "Build Aria Networking static libraries" OFF)
option (ARNETWORKING_BUILD_EXAMPLES "Build Aria Networking examples" OFF)
option (ARNETWORKING_BUILD_DOC "Build Aria Networking documentation" OFF)

include_directories (${ARIA_INCLUDE_DIR})

set (ARNETWORKING_SRCS
	ArCentralManager.cpp
	ArCentralForwarder.cpp
	ArClientBase.cpp
	ArClientData.cpp
	ArClientHandlerConfig.cpp
	ArClientFileUtils.cpp
	ArClientSimpleConnector.cpp
	ArClientSwitchManager.cpp
	ArClientArgUtils.cpp
	ArHybridForwarderVideo.cpp
	ArMapChanger.cpp
	ArNetPacket.cpp
	ArNetPacketReceiverUdp.cpp
	ArNetPacketReceiverTcp.cpp
	ArNetPacketSenderTcp.cpp
	ArServerBase.cpp
	ArServerClient.cpp
	ArServerData.cpp
	ArServerFileUtils.cpp
	ArServerHandlerCamera.cpp
	ArServerHandlerCameraCollection.cpp
	ArServerHandlerCommands.cpp
	ArServerHandlerCommMonitor.cpp
	ArServerHandlerConfig.cpp
	ArServerHandlerMap.cpp
	ArServerHandlerMapping.cpp
	ArServerHandlerPopup.cpp
	ArServerMode.cpp
	ArServerModeDrive.cpp
	ArServerModeIdle.cpp
	ArServerModeRatioDrive.cpp
	ArServerModeStop.cpp
	ArServerModeWander.cpp
	ArServerInfoDrawings.cpp
	ArServerInfoRobot.cpp
	ArServerInfoSensor.cpp
	ArServerInfoStrings.cpp
	ArServerSimpleCommands.cpp
	ArServerSimpleOpener.cpp
	ArServerUserInfo.cpp
	md5.cpp
	)

add_library (arnetworkingShared SHARED ${ARNETWORKING_SRCS})
target_link_libraries (arnetworkingShared ariaShared)
set_target_properties (arnetworkingShared PROPERTIES
	OUTPUT_NAME arnetworking
	VERSION 2.7.3
	SOVERSION 2.7.3
	)
install (TARGETS arnetworkingShared DESTINATION lib)

if (ARNETWORKING_BUILD_STATIC)
	add_library(arnetworkingStatic STATIC ${ARNETWORKING_SRCS})
	set_target_properties (arnetworkingStatic PROPERTIES
		OUTPUT_NAME arnetworking
		VERSION 2.7.3
		SOVERSION 2.7.3
		)
	target_link_libraries (arnetworkingStatic ariaStatic)
	install (TARGETS arnetworkingStatic DESTINATION lib)
endif (ARNETWORKING_BUILD_STATIC)

if (ARNETWORKING_BUILD_EXAMPLES)
	add_subdirectory (examples)
endif (ARNETWORKING_BUILD_EXAMPLES)

if (ARNETWORKING_BUILD_DOC)
	find_package(Doxygen REQUIRED)
	configure_file (doxygen.conf.in ${CMAKE_CURRENT_BINARY_DIR}/doxygen.conf @ONLY)
	add_custom_target(arnetworking_doc
		${DOXYGEN_EXECUTABLE} ${CMAKE_CURRENT_BINARY_DIR}/doxygen.conf
		WORKING_DIRECTORY ${CMAKE_CURRENT_BINARY_DIR}
		COMMENT "Generating API documentation with Doxygen" VERBATIM
		)
	add_dependencies (doc arnetworking_doc)
	install (DIRECTORY ${CMAKE_CURRENT_BINARY_DIR}/docs/html DESTINATION share/doc/arnetworking-doc-html)
endif (ARNETWORKING_BUILD_DOC)