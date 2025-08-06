#!/bin/bash

# Check if compiled classes exist
if [ ! -d "out" ]; then
    echo "Please compile the project first by running ./compile.sh"
    exit 1
fi

# Run the Calculator application
echo "Running Calculator..."
java -cp out com.example.calculator.Calculator