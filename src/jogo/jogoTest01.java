package jogo;

import classes.Lutador;
import classes.Mago;
import classes.Personagem;

public class jogoTest01 {
    public static void main(String[] args) {
        Mago mago1 = new Mago("Walter",100,65,92,"Mago");
        Lutador lut1 = new Lutador("Kevin",100,80,95);

        //lut1.mostrarPersonagens();
        //mago1.mostrarPersonagens();

        //Personagem.lutar(lut1,mago1);
        Personagem.start(lut1);

    }
}
