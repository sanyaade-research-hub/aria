include_directories (${ARIA_INCLUDE_DIR})

set (ADVANCED_EXAMPLES_SRCS
	amptuDemo.cpp
	functorListsAndStdAlgorithms.cpp
	joydriveActionModule.cpp
	sickAutoLogger.cpp
	condition.cpp
	sickSquareLogger.cpp
	sickSpinLogger.cpp
	actsDemoSimple.cpp
	joydriveUserControl.cpp
	peoplebotDemo.cpp
	actsDemo.cpp
	)

foreach (EXAMPLE_SRC ${ADVANCED_EXAMPLES_SRCS})
	string (REPLACE ".cpp" "" EXAMPLE ${EXAMPLE_SRC})
	add_executable (${EXAMPLE} ${EXAMPLE_SRC})
	target_link_libraries (${EXAMPLE} ariaShared)
endforeach (EXAMPLE_SRC)
