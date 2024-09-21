package Matrices;
import java.util.Scanner;

public class JoyeroNlogonia {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer el tamaño de la caja N
        int N = sc.nextInt();
        int[][] joyero = new int[N][N];
        int[][] original = new int[N][N];
        
        // Leer la disposición inicial del joyero
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                joyero[i][j] = sc.nextInt();
                original[i][j] = joyero[i][j];
            }
        }

        // Probar cuántas rotaciones son necesarias para volver al estado original
        for (int r = 0; r < 4; r++) {
            if (isOriginal(joyero, original)) {
                System.out.println(r);
                return;
            }
            joyero = rotarAntihorario(joyero);
        }

        sc.close();
    }

    // Verificar si dos matrices son iguales
    public static boolean isOriginal(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Rotar la matriz 90 grados en sentido antihorario
    public static int[][] rotarAntihorario(int[][] matriz) {
        int N = matriz.length;
        int[][] nuevaMatriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                nuevaMatriz[i][j] = matriz[j][N - 1 - i];
            }
        }
        return nuevaMatriz;
    }
}
