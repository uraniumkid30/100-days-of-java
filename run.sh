#!/bin/bash

Class='Day0016'

Directory='DAY0016'
Extension='.java'

CompilerCommand="$Directory/$Class$Extension"
JavaCommand="$Directory.$Class"

javac $CompilerCommand
java $JavaCommand