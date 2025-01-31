#!/bin/bash

Class='Day0009'

Directory='DAY0009'
Extension='.java'

CompilerCommand="$Directory/$Class$Extension"
JavaCommand="$Directory.$Class"

javac $CompilerCommand
java $JavaCommand