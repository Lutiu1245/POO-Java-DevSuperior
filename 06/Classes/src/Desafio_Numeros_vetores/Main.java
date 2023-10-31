package Desafio_Numeros_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você irá digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            int numeros = sc.nextInt();
            vect[i] = numeros;
        }
        for (int i = 0; i < vect.length; i++) {
            int negativo = 0;
            if(vect[i] < negativo) { System.out.println("Numeros negativos: " + vect[i]);}
        }
        sc.close();
    }
}
