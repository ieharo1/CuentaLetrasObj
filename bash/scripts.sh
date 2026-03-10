#!/bin/bash
# Script maestro para ejecutar ejemplos de texto.

set -e

echo "Ejecutando word_counter.sh"
bash "$(dirname "$0")/word_counter.sh"

echo ""
echo "Ejecutando log_analyzer.sh"
bash "$(dirname "$0")/log_analyzer.sh"

echo ""
echo "Ejecutando text_cleaner.sh"
bash "$(dirname "$0")/text_cleaner.sh"
