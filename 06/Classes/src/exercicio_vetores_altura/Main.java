package exercicio_vetores_altura;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero =  sc.nextInt();
        double[] vect = new double[numero]; // vect que recebe o valor 3
        for (int i = 0; i < numero; i++) { // irá percorrer o vetor 3 vezes
            vect[i] = sc.nextDouble(); // irá pedir o valor 3 vezes
        }
        double contador = 0;
        for (int i = 0; i < numero; i++) { // calcular a media dos numeros dentro do vetor
            // calcular a media -> soma dos elementos divididos pela quantidade dentro do vetor
           // tem 3 valores dentro do vetor
            contador += vect[i];
        }
        double media = contador / numero;
        System.out.println(media);
        sc.close();
    }
}
