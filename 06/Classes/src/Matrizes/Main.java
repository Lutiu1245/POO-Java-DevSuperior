package Matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor da matriz");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // Salva os itens negativos dentro da lista
        List<Integer> contador = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0) {
                    contador.add(mat[i][j]);
                }
            }
        }
        // Mostra os numeros na diagonal principal
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][i]);
        }
        // Printa os elementos negativos armazenados dentro da lista
        for (int obj :
                contador) {
            System.out.println("numero nagativo: " + obj);
        }

    }
}
