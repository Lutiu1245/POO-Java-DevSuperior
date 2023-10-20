package exercicio_funcionarios;

public class Funcionarios {
    public String nome;
    public double SalarioBruto;
    public double Imposto;

    public double SalarioLiquido() {
        return SalarioBruto - Imposto;
    }

    public void AumentarSalario(double porcentagem) {
        SalarioBruto += SalarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", SalarioLiquido());
    }
}
