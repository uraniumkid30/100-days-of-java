#!/bin/bash

Class='Day0007'

Directory='DAY0007'
Extension='.java'

CompilerCommand="$Directory/$Class$Extension"
JavaCommand="$Directory.$Class"

javac $CompilerCommand
java $JavaCommand