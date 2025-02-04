#!/bin/bash

Class='Day0013'

Directory='DAY0013'
Extension='.java'

CompilerCommand="$Directory/$Class$Extension"
JavaCommand="$Directory.$Class"

javac $CompilerCommand
java $JavaCommand