package Desafio_Combate;

public class Combatente {
    private String Nome;
    protected int Ataque;
    protected int Armadura;
    protected int Vida;

    public Combatente(String nome, int ataque, int armadura, int vida) {
        this.Nome = nome;
        this.Armadura = armadura;
        this.Ataque = ataque;
        this.Vida = vida;
    }

    public void atacar(Combatente2 campeao) {
        campeao.setVida(this.Ataque);
    }

    public void setVida(int ataque) {
        this.Vida += this.Armadura;
        this.Vida -= ataque;
    }
    public String status() {
        return "Dados do Combatente 01: " + "nome: " + this.Nome + "Armadura: " + this.Armadura + "Vida:" + this.Vida;
    }
}
