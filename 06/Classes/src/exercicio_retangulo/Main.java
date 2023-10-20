package exercicio_retangulo;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura do retângulo: ");
        double width = sc.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double heigth = sc.nextDouble();
        System.out.println("OS valores do retangulo são: ");
        Retangulo retangulo = new Retangulo();
        retangulo.width = width;
        retangulo.heigth = heigth;
        retangulo.Area();
        retangulo.Perimetro();
        retangulo.Diagonal();
        System.out.println(retangulo);
    }
}
