package Fracciones;

import java.util.Scanner;

public class FraccionesContinuas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer el valor de N
        int N = sc.nextInt();
        
        // Inicializar los valores de la fracción
        int numerador = 1;
        int denominador = 1;
        
        // Construir la fracción de nivel N
        for (int i = 2; i <= N; i++) {
            int temp = numerador;
            numerador = numerador + denominador;
            denominador = temp;
        }
        
        // Imprimir solo el numerador
        System.out.println(numerador);
        
        sc.close();
    }
}
