package Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] notas = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite as notas do aluno: ");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        // colocar as notas dentro do array de notas.
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        // printar os valores do array de notas
        Alunos aluno = new Alunos();
        aluno.nome = nome;
        aluno.media(notas);
        System.out.println("A média do aluno " + aluno.nome + " é: " + aluno.contador);
        System.out.println("O aluno " + aluno.nome + " está: " + aluno.situacao());
        sc.close();
    }
}
