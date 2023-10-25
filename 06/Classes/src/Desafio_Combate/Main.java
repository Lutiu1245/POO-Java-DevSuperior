package Desafio_Combate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o nome combatente 01: ");
        String nome01 = sc.nextLine();
        System.out.println("Entre com o valor de ataque do combatente 01: ");
        int ataque01 = sc.nextInt();
        System.out.println("Entre com o valor da armadura do combatente 01: ");
        int armadura01 = sc.nextInt();
        System.out.println("Entre com o valor da vida do combatente 01: ");
        int vida01 = sc.nextInt();
        Combatente combatente1 = new Combatente(nome01, ataque01, armadura01, vida01);
        sc.nextLine();
        combatente1.status();

        System.out.println("Entre com o nome combatente 02: ");
        String nome02 = sc.nextLine();
        System.out.println("Entre com o valor de ataque do combatente 02: ");
        int ataque02 = sc.nextInt();
        System.out.println("Entre com o valor da armadura do combatente 02: ");
        int armadura02 = sc.nextInt();
        System.out.println("Entre com o valor da vida do combatente 02: ");
        int vida02 = sc.nextInt();
        Combatente2 combatente2 = new Combatente2(nome02, ataque02, armadura02, vida02);
        combatente1.atacar(combatente2);
        System.out.println(combatente2.status());

        System.out.println("Quantos turnos você quer exercutar: ");
    }
}
