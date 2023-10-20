package Alunos;

public class Alunos {
    public String nome;
    public int contador = 0;

    public int media(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            this.contador += notas[i];
        }
        return this.contador;
    }

    public String situacao() {
        if (this.contador >= 60) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
