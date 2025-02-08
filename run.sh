#!/bin/bash

Class='Day0017'

Directory='DAY0017'
Extension='.java'

CompilerCommand="$Directory/$Class$Extension"
JavaCommand="$Directory.$Class"

javac $CompilerCommand
java $JavaCommand