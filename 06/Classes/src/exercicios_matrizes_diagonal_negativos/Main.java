package exercicios_matrizes_diagonal_negativos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o tamanho da matriz: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // Mostra a diagonal principal
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][i]);
        }

        List<Integer> contador = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0) {
                    contador.add(mat[i][j]);
                }
            }
        }

        System.out.println("Numero negativo:" + contador);
        System.out.println("Quantidade de numeros negativos: " + contador.size());
    }

}
