CFILEEXT:=cpp
# Make sure we're using a compiler (we probably don't need to define
# it but we have been so here it is unless it was already set)
ifndef CXX
CXX=g++
endif
CXXFLAGS+= -fPIC -g -Wall -D_REENTRANT -fno-exceptions
WRAPPER_CXX_FLAGS=-fPIC -g -Wall -D_REENTRANT 
CXXINC:=-I../include -Iinclude
CXXLINK:=-L../lib -lAria -lArNetworking -lpthread -ldl -lrt \
	-Xlinker -Bstatic -lstdc++ -Xlinker -Bdynamic
CXXSTATICLINK:=-L../lib -Xlinker -Bstatic -lArNetworking -lAria -Xlinker -Bdynamic -lpthread -ldl -lrt -Xlinker -Bstatic -lstdc++ -Xlinker -Bdynamic

ifdef JAVA_BIN
JAVAC:=$(JAVA_BIN)/javac
JAR:=$(JAVA_BIN)/jar
else
JAVAC:=javac
JAR:=jar
endif

CFILES:= \
	ArCentralManager.cpp \
	ArCentralForwarder.cpp \
	ArClientBase.cpp \
	ArClientData.cpp \
	ArClientHandlerConfig.cpp \
	ArClientFileUtils.cpp \
	ArClientSimpleConnector.cpp \
	ArClientSwitchManager.cpp \
	ArClientArgUtils.cpp \
	ArHybridForwarderVideo.cpp \
	ArMapChanger.cpp \
	ArNetPacket.cpp \
	ArNetPacketReceiverUdp.cpp \
	ArNetPacketReceiverTcp.cpp \
	ArNetPacketSenderTcp.cpp \
	ArServerBase.cpp \
	ArServerClient.cpp \
	ArServerData.cpp \
	ArServerFileUtils.cpp \
	ArServerHandlerCamera.cpp \
	ArServerHandlerCameraCollection.cpp \
	ArServerHandlerCommands.cpp \
	ArServerHandlerCommMonitor.cpp \
	ArServerHandlerConfig.cpp \
	ArServerHandlerMap.cpp \
	ArServerHandlerMapping.cpp \
	ArServerHandlerPopup.cpp \
	ArServerMode.cpp \
	ArServerModeDrive.cpp \
	ArServerModeIdle.cpp \
	ArServerModeRatioDrive.cpp \
	ArServerModeStop.cpp \
	ArServerModeWander.cpp \
	ArServerInfoDrawings.cpp \
	ArServerInfoRobot.cpp \
	ArServerInfoSensor.cpp 	\
	ArServerInfoStrings.cpp \
	ArServerSimpleCommands.cpp \
	ArServerSimpleOpener.cpp \
	ArServerUserInfo.cpp \
	md5.cpp


OTFILES:=$(patsubst %.$(CFILEEXT),%.o,$(CFILES))
OFILES:=$(patsubst %,../obj/%,$(OTFILES))

TARGETS:=../lib/libArNetworking.so examples

EXAMPLES_CPP:=$(shell find examples -name "*.$(CFILEEXT)" | grep -v Mod.cpp)
EXAMPLES:=$(patsubst %.$(CFILEEXT),%,$(EXAMPLES_CPP))

TESTS_CPP:=$(shell find tests -name "*.$(CFILEEXT)" | grep -v Mod.cpp)
TESTS:=$(patsubst %.$(CFILEEXT),%,$(TESTS_CPP))

SRC_FILES:=$(patsubst %,src/%,$(CFILES))
HEADER_FILES:=$(shell find include -type f -name \*.h)

all: dirs $(TARGETS)

dirs:
	@mkdir -p -v ../obj
	@mkdir -p -v ../lib

../lib/libArNetworking.so: $(OFILES) Makefile.dep 
	$(CXX) -shared 	-Xlinker -Bstatic -lstdc++ -Xlinker -Bdynamic -o $(@) $(OFILES) 

../lib/libArNetworking.a: $(OFILES) Makefile.dep
	ar -cr $(@) $(OFILES)
	ranlib $(@)


examples: dirs $(EXAMPLES) Makefile.dep ../lib/libArNetworking.so


tests: dirs $(TESTS) Makefile.dep ../lib/libArNetworking.so

clean: cleanExamples
	rm -f ../lib/libArNetworking.so ../lib/libArNetworking.a \
	`find . -name core` $(OFILES) `find . -name '*~'`

cleanPython:
	-rm ../python/_ArNetworkingPy.so
	-rm ../python/ArNetworkingPy.py
	-rm ../python/ArNetworkingPy.pyc
	-rm ../python/ArNetworkingPy_wrap.cpp
	-rm ../obj/ArNetworkingPy_wrap.o

cleanExamples:
	rm -f $(EXAMPLES)

cleanDoc:
	-rm -f docs/*.html docs/*.png docs/*.png
	-rm -rf docs/tmp

cleanAll: clean cleanExamples cleanJava cleanPython cleanDoc

docs: doc
doc: docs/index.html
docs/index.html: $(SRC_FILES) $(HEADER_FILES) $(EXAMPLES_CPP) doxygen.conf docs/options/all_options.dox ../docs/index.html
	$(MAKE) cleanDoc
	-mkdir docs
	doxygen doxygen.conf

../docs/index.html: FORCE
	$(MAKE) -C .. docs/index.html

#doxygen.conf: FORCE
#	$(MAKE) -C .. ArNetworking/$@

Makefile.dep:
	$(MAKE) dep

dep: clean 
	if [ -f `echo src/*.cpp | cut -d' ' -f1` ]; then \
	$(CXX) $(CXXFLAGS) $(CXXINC) -MM src/*.cpp | \
	awk '$$1 ~ /:/{printf "../obj/%s\n", $$0} $$1 !~ /:/' > Makefile.dep; fi
	if [ -f `echo examples/*.cpp | cut -d' ' -f1` ]; then \
        $(CXX) $(CXXFLAGS) $(CXXINC) -MM examples/*.cpp | \
        awk '$$1 ~ /:/{printf "examples/%s\n", $$0} $$1 !~ /:/' | \
        sed 's/\.o//' >> Makefile.dep; fi

../lib/libAria.so: FORCE
	$(MAKE) -C .. dirs lib/libAria.so

../lib/libAria.a: FORCE
	$(MAKE) -C .. dirs lib/libAria.a

../obj/%.o : src/%.cpp Makefile.dep
	$(CXX) $(CXXFLAGS) $(CXXINC) -c $< -o $@

../obj/%.o : src/%.c Makefile.dep
	$(CXX) $(CXXFLAGS) $(CXXINC) -c $< -o $@

# Don't build .o files if their library is up to date with respect to source files:
.INTERMEDIATE: $(OFILES)

# But don't delete .o files if we do make them in order to make a library:
.PRECIOUS: $(OFILES)

examples/%: examples/%.$(CFILEEXT) ../lib/libArNetworking.so Makefile.dep
	$(CXX) $(CXXFLAGS) $(CXXINC) $< -o $@ $(CXXLINK)

tests/%: tests/%.$(CFILEEXT) ../lib/libArNetworking.so Makefile.dep
	$(CXX) $(CXXFLAGS) $(CXXINC) $< -o $@ $(CXXLINK)


examples/%Static: examples/%.$(CFILEEXT) ../lib/libAria.a ../lib/libArNetworking.a Makefile.dep
	$(CXX) $(CXXFLAGS) $(CXXINC) $< -o $@ $(CXXSTATICLINK)
	strip $@

tests/%Static: tests/%.$(CFILEEXT) ../lib/libAria.a ../lib/libArNetworking.a Makefile.dep
	$(CXX) $(CXXFLAGS) $(CXXINC) $< -o $@ $(CXXSTATICLINK)
	strip $@

CommandLineOptions.txt.in docs/options/all_options.dox: proprietary/genCommandLineOptionDocs 
	-mkdir docs/options
	proprietary/genCommandLineOptionDocs

proprietary/genCommandLineOptionDocs: ../utils/genCommandLineOptionDocs.cpp ../lib/libAria.so ../lib/libArNetworking.so src/ArServerSimpleOpener.cpp src/ArClientSimpleConnector.cpp src/ArClientSwitchManager.cpp
	$(CXX) $(CXXFLAGS) -DFOR_ARNETWORKING $(CXXINC) $< -o $@ $(CXXLINK)

## Python SWIG wrapper ##

python: ariaPython ../python/_ArNetworkingPy.so

ariaPython:
	$(MAKE) -C .. python

../python/ArNetworkingPy_wrap.cpp ../python/ArNetworkingPy.py: include/wrapper.i $(HEADER_FILES)
	cd ../python; swig -c++ -python -modern -module ArNetworkingPy -Dlinux -DAREXPORT -o ArNetworkingPy_wrap.cpp -I../include -I../ArNetworking/include ../ArNetworking/include/wrapper.i  

#	-rm -f `find ../python -xtype f -maxdepth 1 -name "*ArNetworking*"| grep -v .ds | grep -v .sln | grep -v .vcproj`

# This is the old way that would compile in all the object files, it is 
# deprecated in favor of the way below

#python/_ArNetworkingPy.so: ../obj/ArNetworkingPy_wrap.o $(OFILES) Makefile.dep
#	@echo  == Building loadable module for python with `$(CXX) --version`
#	$(CXX) -shared -o $(@) $(OFILES) ../obj/ArNetworkingPy_wrap.o -lpthread -ldl -lrt

# This is the new way that just links in the aria lib instead (so this
# will work for other libraries too)
../python/_ArNetworkingPy.so: ../obj/ArNetworkingPy_wrap.o ../lib/libArNetworking.so Makefile.dep
	$(CXX) -shared $(WRAPPER_CXX_FLAGS) -o $(@) ../obj/ArNetworkingPy_wrap.o -lpthread -ldl -lrt \
	-L../lib -lAria -lArNetworking

../obj/ArNetworkingPy_wrap.o: ../python/ArNetworkingPy_wrap.cpp
	@ if test -z "$(PYTHON_INCLUDE)"; then echo "*** Error: PYTHON_INCLUDE is not set, building ArNetworkingPy_wrap.cpp will probably fail! ***"; fi
	$(CXX) -c $(WRAPPER_CXX_FLAGS) $(CXXINC) -I$(PYTHON_INCLUDE) $< -o $@


## Java SWIG wrapper ##


java: ../lib/libArNetworkingJava.so ../java/ArNetworking.jar

../java/Aria.jar:
	$(MAKE) -C .. java

../java/ArNetworking.jar: ../java/com/mobilerobots/ArNetworking/ArServerBase.class
	cd ../java ; $(JAR) cf ArNetworking.jar com/mobilerobots/ArNetworking/*.class

../java/ArNetworkingJava_wrap.cpp ../java/com/mobilerobots/ArNetworking/ArServerBase.java: include/wrapper.i $(HEADER_FILES)
	-mkdir -p ../java/com/mobilerobots/ArNetworking
	rm ../java/com/mobilerobots/ArNetworking/*.java ../java/ArNetworkingJava_wrap.cpp ../java/ArNetworkingJava_wrap.h ; swig -c++ -java -package com.mobilerobots.ArNetworking -outdir ../java/com/mobilerobots/ArNetworking -module ArNetworkingJava -Dlinux -DAREXPORT -o ../java/ArNetworkingJava_wrap.cpp -I../include -Iinclude include/wrapper.i 
 
../java/com/mobilerobots/ArNetworking/ArServerBase.class: ../java/com/mobilerobots/ArNetworking/ArServerBase.java ../java/Aria.jar
	 rm ../java/com/mobilerobots/ArNetworking/*.class; $(JAVAC) -classpath ../java/Aria.jar:../java ../java/com/mobilerobots/ArNetworking/*.java 

cleanJava:
	-rm ../java/ArNetworking.jar
	-rm -r ../java/com/mobilerobots/ArNetworking
	-rm ../java/ArNetworkingJava_wrap.* ../obj/ArNetworkingJava_wrap.o ../lib/libArNetworkingJava.so

../lib/libArNetworkingJava.so: ../obj/ArNetworkingJava_wrap.o Makefile.dep ../lib/libArNetworking.so
	$(CXX) -shared $(WRAPPER_CXX_FLAGS) -o $(@) ../obj/ArNetworkingJava_wrap.o -lpthread -ldl -lrt -L../lib -lAria -lArNetworking

../obj/ArNetworkingJava_wrap.o: ../java/ArNetworkingJava_wrap.cpp
	@ if test -z "$(JAVA_INCLUDE)"; then echo "*** Error: JAVA_INCLUDE is not set, building ArNetworkingPy_wrap.cpp will probably fail! ***"; fi
	$(CXX) -c $(WRAPPER_CXX_FLAGS) $(CXXINC) -I$(JAVA_INCLUDE) -I$(JAVA_INCLUDE)/linux $< -o $@

FORCE:

# Just see if there is a Makefile.dep, if so include one... there
# should be one because of the rules up in the command line parsing
# part above
ifeq (Makefile.dep,$(wildcard Makefile.dep))
include Makefile.dep
# End of the Makefile.dep check
endif


### dist
# Include rules for creating distribution packages, if enabled
# (for MobileRobots internal use)
ifdef ARIA_DIST
ifeq (../dist/Makefile.aria-dist,$(wildcard ../dist/Makefile.aria-dist))
$(info in ArNetworking/Makfeile ARIA_DIST variable is set and ../dist/Makefile.aria-dist exists, including it)
include ../dist/Makefile.aria-dist
else
$(warning in ArNetworking/Makefile ARIA_DIST variable is set but ../dist/Makefile.aria-dist not found, skipping it)
endif
endif
