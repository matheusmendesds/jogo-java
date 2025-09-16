package classes;

public class Lutador extends Personagem{
    private int forca;

    public Lutador(String nome, int vida, int stamina, int forca) {
        super(nome, vida, stamina);
        this.forca = forca;
    }

}
