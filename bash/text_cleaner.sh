#!/bin/bash
WORKDIR="$(pwd)/text_lab"
mkdir -p "$WORKDIR"

cat <<EOF > "$WORKDIR/datos.csv"
id,nombre,estado
1,ana,ok
2,juan,error
3,zoe,ok
EOF

echo "Columna nombre en mayusculas y ordenada:"
cut -d, -f2 "$WORKDIR/datos.csv" | tr 'a-z' 'A-Z' | sort
