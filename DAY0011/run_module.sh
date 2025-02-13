#!/bin/bash

APPMODULES='appmodules'

APPFUNCS='appfuncs'
APPFUNCS_CLASS_PATH="$APPMODULES/$APPFUNCS"
APPFUNCS_MODULE_DIR="appsrc/$APPFUNCS"
APPFUNCS_MODULE_FILE="$APPFUNCS_MODULE_DIR/module-info.java"
APPFUNCS_FILE_DIR="$APPFUNCS_MODULE_DIR/$APPFUNCS/simplefuncs"
APPFUNCS_FILE="$APPFUNCS_FILE_DIR/SimpleMathFuncs.java"

APPSTART='appstart'
APPSTART_CLASS_PATH="$APPMODULES/$APPSTART"
APPSTART_MODULE_DIR="appsrc/$APPSTART"
APPSTART_MODULE_FILE="$APPSTART_MODULE_DIR/module-info.java"
APPSTART_FILE_DIR="$APPSTART_MODULE_DIR/$APPSTART/modappdemo"
APPSTART_FILE="$APPSTART_FILE_DIR/ModAppDemo.java"

MAINFILE='appstart/appstart.modappdemo.ModAppDemo'

javac -d $APPFUNCS_CLASS_PATH $APPFUNCS_MODULE_FILE $APPFUNCS_FILE

javac --module-path $APPMODULES -d $APPSTART_CLASS_PATH $APPSTART_MODULE_FILE $APPSTART_FILE

#javac -d $APPMODULES --module-source-path appsrc $APPSTART_FILE

java --module-path $APPMODULES -m $MAINFILE