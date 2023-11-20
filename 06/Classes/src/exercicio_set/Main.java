package exercicio_set;

import exercicio_set.services.Aluno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Aluno> alunoSet = new HashSet<>();
        System.out.println("Quantos alunos tem no curso A?");
        int quntAlunos = sc.nextInt();
        for (int i = 0; i < quntAlunos; i++) {
            System.out.println("Digite o código do aluno: ");
            int codigoAluno = sc.nextInt();
            alunoSet.add(new Aluno(codigoAluno));
        }
        System.out.println("Quantos alunos tem no curso B?");
        int quntAlunos2 = sc.nextInt();
        for (int i = 0; i < quntAlunos2; i++) {
            System.out.println("Digite o código do aluno: ");
            int codigoAluno = sc.nextInt();
            alunoSet.add(new Aluno(codigoAluno));
        }
        System.out.println("Quantos alunos tem no curso C?");
        int quntAlunos3 = sc.nextInt();
        for (int i = 0; i < quntAlunos3; i++) {
            System.out.println("Digite o código do aluno: ");
            int codigoAluno = sc.nextInt();
            alunoSet.add(new Aluno(codigoAluno));
        }
        System.out.println(alunoSet.size());
        for (Aluno s :
                alunoSet) {
            System.out.println(s);
        }
    }
}
