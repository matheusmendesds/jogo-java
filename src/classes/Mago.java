package classes;

public class Mago extends Personagem {
    private int magia;
    private String tipoPerson;

    public Mago(String nome, int vida, int stamina, int magia, String tipoPerson) {
        super(nome, vida, stamina);
        this.magia = magia;
        this.tipoPerson = tipoPerson;
    }
}
