find_package (SWIG REQUIRED)
include (${SWIG_USE_FILE})

find_package (Java REQUIRED Development)

file (GLOB ARIA_JAVA_SRCS *.java)

add_jar (ariajava ${ARIA_JAVA_SRCS)
	
# include_directories (${CMAKE_CURRENT_SOURCE_DIR})

# set (CMAKE_SWIG_FLAGS "")

# set_source_files_properties (wrapper.i PROPERTIES CPLUSPLUS ON)

# set_source_files_properties (wrapper.i PROPERTIES SWIG_FLAGS "-modern;-Dlinux;-DAREXPORT")
