package Desafio_Combate;

public class Combatente2 {
    private String Nome;
    protected int Ataque;
    protected int Armadura;

    protected int Vida;

    public Combatente2(String nome, int ataque, int armadura, int vida) {
        this.Nome = nome;
        this.Armadura = armadura;
        this.Ataque = ataque;
        this.Vida += vida;
    }

    public void atacar(Combatente campeao) {
        campeao.setVida(this.Ataque);
    }

    public void setVida(int ataque) {
        this.Vida += this.Armadura;
        this.Vida -= ataque;
    }


    public String status() {
        return "Dados do Combatente 02: " + "nome: " + this.Nome + "Armadura: " + this.Armadura + "Vida:" + this.Vida;
    }
}
