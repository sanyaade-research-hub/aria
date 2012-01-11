cmake_minimum_required (VERSION 2.6)

project (aria)

set (aria_VERSION 2.7.3 CACHE STRING "aria distribution version")
SET (aria_API_VERSION 2.7 CACHE STRING "aria API version")

set(aria_SHARED_DIR share/aria)
set(aria_INCLUDE_DIR include/aria)
set(aria_LIBRARY_DIR lib/aria)

add_subdirectory (aria)

#set (ARIA_INCLUDE_DIR ${aria_SOURCE_DIR}/aria)
#set (ARNETWORKING_INCLUDE_DIR ${aria_SOURCE_DIR}/arnetworking)
#add_subdirectory (arnetworking)
