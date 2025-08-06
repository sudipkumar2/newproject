#!/bin/bash

# Create output directory for compiled classes
mkdir -p out

# Compile all Java files
echo "Compiling Java files..."
javac -d out src/main/java/com/example/calculator/*.java

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
else
    echo "Compilation failed!"
    exit 1
fi