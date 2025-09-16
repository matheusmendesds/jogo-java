package classes;

import java.util.Scanner;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int stamina;

    public Personagem(String nome, int vida, int stamina) {
        this.nome = nome;
        this.vida = vida;
        this.stamina = stamina;
    }

    public void mostrarPersonagens() {
        System.out.println("Nome:" + nome);
        System.out.println("Vida:" + vida);
        System.out.println("Stamina:" + stamina);
    }

    public static void lutar(Personagem pers1, Personagem pers2) {
        if (pers1.stamina > pers2.stamina) {
            System.out.println(pers1.nome + " Ganhou a luta");
        } else {
            System.out.println(pers2.nome + " Ganhou a luta");

        }
    }

    public static void start(Personagem pers1){
        Scanner scanner = new Scanner(System.in);
        System.out.println(pers1.nome + " , escolha o que fazer:");

        System.out.println("1-Andar para frente 2-Ir à esquerda 3-Ir à direito");
        int esc = scanner.nextInt();
        switch (esc) {
            case 1:
                System.out.println("Foi pra frente");
                break;
            case 2:
                System.out.println("Foi pra esquerda");
                break;
            case 3:
                System.out.println("Foi pra direita");
                break;
        }
    }
}
