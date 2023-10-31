package exercicio_vetores_mediaProdutos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n]; // criamos um vetor com n posições que contém nome e preco em cada posição
        for (int i = 0; i < n; i++) { //  para colocar dentro do vetor, é necessario que seja do tipo Produto
            // para ser do tipo produto, é necessario que tenha nome e preco, então vamos pegar os valores aqui
            sc.nextLine();
            String name = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(name, preco);
        }
            // precisamo pegar os valores dos precos para somar, pegamos os valores com o getPrice
        double contador = 0.0;
        for (int i = 0; i < n; i++) {
            contador += vect[i].getPreco();
        }
        double media = contador / n;
        System.out.println(media);
        sc.close();
    }

}
