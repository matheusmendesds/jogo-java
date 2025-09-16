package classes;

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
}
