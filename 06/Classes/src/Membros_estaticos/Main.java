package Membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        System.out.println("Circunferência: " + String.format("%.2f", circumferencia(raio)));
        System.out.println("Volume: " + String.format("%.2f", volume(raio)));
    }

    public static double circumferencia(double raio) {
        return 2.0 * Math.PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * Math.PI * Math.pow(raio, 3) / 3.0;
    }
}
