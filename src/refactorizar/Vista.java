package refactorizar;

import java.util.Scanner;

public class Vista {

    public static int entradadato() {
        int cantidadDigitos;
        System.out.println("lololo");
        Scanner dato = new Scanner(System.in);
        cantidadDigitos = dato.nextInt();
        return cantidadDigitos;
    }

    public static void imprimirInt(int entero) {
        System.out.println(entero);
    }

    public static void imprimirString(String cadena) {
        System.out.println(cadena);
    }

}
