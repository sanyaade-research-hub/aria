option (ARIA_BUILD_DOCUMENTATION "Build Aria documentation" OFF)

if (ARIA_BUILD_DOCUMENTATION)
  find_package(Doxygen REQUIRED)
  if (DOXYGEN_FOUND)
    set (doxygenConfigFileIn "${CMAKE_CURRENT_SOURCE_DIR}/doxygen.conf.in")
    set (doxygenConfigFile "${CMAKE_CURRENT_BINARY_DIR}/doxygen.conf")
    
    set (DOXYGEN_LANGUAGE "English" CACHE STRING "Documentation language")
    mark_as_advanced (DOXYGEN_LANGUAGE)
    
    find_program (HAVE_DOT dot)
    if (HAVE_DOT)
      set (HAVE_DOT_PROGRAM YES)
    endif (HAVE_DOT)
    find_package (Perl)
    
    # Generate the doxygen configure file based on various configuration parameters
    configure_file (${doxygenConfigFileIn} ${doxygenConfigFile} @ONLY)
    
    add_custom_target (doc
      ${DOXYGEN_EXECUTABLE} ${doxygenConfigFile}
      DEPENDS ${doxygenConfigFile}
      WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}
      VERBATIM)
    add_dependencies (doc ariaShared)
    
    # Install documentation
    set (docInstallDir "share/doc/libaria")
    set (docSourceDir "${CMAKE_CURRENT_BINARY_DIR}/html")
    # Make the output directory now so install doesn't complain that it doesn't exist
    file (MAKE_DIRECTORY ${docSourceDir})
    install (DIRECTORY ${docSourceDir}
      DESTINATION ${docInstallDir})
      
  else (DOXYGEN_FOUND)
    message (STATUS "Documentation will not be built - Doxygen not found")
  endif (DOXYGEN_FOUND)
endif (ARIA_BUILD_DOCUMENTATION)

