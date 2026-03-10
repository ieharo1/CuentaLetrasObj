#!/bin/bash
WORKDIR="$(pwd)/text_lab"
mkdir -p "$WORKDIR"

cat <<EOF > "$WORKDIR/log.txt"
[INFO] Inicio del sistema
[ERROR] Conexion fallida
[INFO] Reintento
[ERROR] Timeout
EOF

echo "Errores detectados:"
grep "ERROR" "$WORKDIR/log.txt"

echo "Total de errores:"
grep "ERROR" "$WORKDIR/log.txt" | wc -l
