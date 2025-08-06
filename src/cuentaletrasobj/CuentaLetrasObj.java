/*
 * CuentaLetrasObj.java
   INGRESA UNA SECUENCIA DE CADENA DE CARACTERES, HASTA LA PALABRA "FIN" ESCRITO EN DIFERENTES FORMAS.
   SI LA CADENA ES DIFERENTE DE "FIN", CALCULA Y DESPLIEGA EL NUMERO DE CONSONANTES, VOCALES, DIGITOS DECIMALES
   , ESPACIOS EN BLANCO U OTROS UTILIZANDO UN ARREGLO DE OBJETOS.
 */
package cuentaletrasobj;

import java.util.Scanner;

/**
 *
 * @author Scrappy Doo Coco
 */
public class CuentaLetrasObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion de variables:
        final String alf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String termina = "FIN";
        Item [] frq = new Item [alf.length()];
        int i, j, cuenta = 0, nl, pos;
        Scanner sc = new Scanner(System.in);
        String [] texto = new String[60];
        // Lectura del texto:
        System.out.println("INGRESAR UN TEXTO, FINALIZAR (" + termina + "): ");
        for (nl = 0; nl < 60; nl ++) {
            texto[nl] = sc.nextLine();
            if (texto[nl].equalsIgnoreCase(termina)) break;
        }
        // Inicializar el arreglo de objetos:
        for (i = 0; i < alf.length(); i ++) {
            frq[i] = new Item();
            frq[i].setCuenta(0);
            frq[i].setLetra(alf.charAt(i));
        }
        // Analizar el texto:
        for (i = 0; i < nl; i ++)
            for (j = 0; j < texto[i].length(); j ++) {
                pos = alf.indexOf(texto[i].toUpperCase().charAt(j));
                if (pos >= 0) { // Es una letra
                   frq[pos].setCuenta(frq[pos].getCuenta() + 1);
                   cuenta ++;
                }

            }
        // Desplegar resultados:
        System.out.println("FRECUENCIA DE LETRAS DEL TEXTO INGRESADO");
        System.out.println("LETRA FRECUENCIA");
        for (i = 0; i < alf.length(); i ++)
            if (frq[i].getCuenta() > 0)
              System.out.println(frq[i].getLetra() + "      " + frq[i].getCuenta() + "/" + cuenta);
    }   
}
class Item {
    // Atributos:
    private char letra;
    private int cuenta;
    
    // Metodos:
    public char getLetra() {
        return letra;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
}
