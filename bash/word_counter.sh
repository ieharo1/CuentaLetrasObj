#!/bin/bash
WORKDIR="$(pwd)/text_lab"
mkdir -p "$WORKDIR"

echo "Linux es poderoso para texto." > "$WORKDIR/archivo.txt"
echo "Aprende wc, grep y awk." >> "$WORKDIR/archivo.txt"

echo "Contenido:"
cat "$WORKDIR/archivo.txt"

echo "Total de palabras:"
wc -w "$WORKDIR/archivo.txt"
