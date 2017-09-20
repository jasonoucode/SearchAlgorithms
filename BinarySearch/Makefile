#
# A simple makefile for compiling three java classes
#

# define a makefile variable for the java compiler
#
JCC = javac

# define a makefile variable for compilation flags
# the -g flag compiles with debugging information
#
JFLAGS = -g

# typing 'make' will invoke the first target entry in the makefile
# (the default one in this case)
#
default: BinarySearch.class BinarySearchTest.class

# this target entry builds the Node, BinarySearch, and BinarySearchTest Classes
#
BinarySearch.class: BinarySearch.java
	$(JCC) $(JFLAGS) BinarySearch.java

BinarySearchTest.class: BinarySearchTest.java
	$(JCC) $(JFLAGS) BinarySearchTest.java

# Running tests to make sure our code is working.
# 'make test' to run tests.
test: BinarySearchTest.class
	java BinarySearchTest

# To start over from scratch, type 'make clean'.
# Removes all .class files, so that the next make rebuilds them
#
clean:
	$(RM) *.class