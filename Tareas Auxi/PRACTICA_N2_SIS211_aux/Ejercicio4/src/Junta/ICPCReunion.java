package Junta;

import java.util.Scanner;

public class ICPCReunion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int N = sc.nextInt();  // Número de directores
        int K = sc.nextInt();  // Duración máxima de la reunión
        
        // Calcular el tiempo máximo de discurso para cada director
        int maxDiscurso = (K - (N - 1)) / N;
        
        // Imprimir el resultado
        System.out.println(maxDiscurso);
        
        sc.close();
    }
}
