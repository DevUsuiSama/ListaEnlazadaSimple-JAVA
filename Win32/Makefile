CC = g++
CXXFLAGS = -shared

APPNAME = Console

SRC = src/win32
INCLUDEDIR = -I'C:/Program Files/Java/jdk-19/include' -I'C:/Program Files/Java/jdk-19/include/win32' -Iinclude
DEBUGDIR = debug/$(APPNAME)

EXTINPUT = cpp
EXTOUTPUT = dll

OUTPUT = $(DEBUGDIR).$(EXTOUTPUT)

programa:
	$(CC) $(CXXFLAGS) $(SRC).$(EXTINPUT) $(INCLUDEDIR) -o $(OUTPUT)