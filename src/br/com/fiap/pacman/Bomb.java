package br.com.fiap.pacman;

public class Bomb extends Item {

    public Bomb(int x, int y) {
        super(x, y);
    }

    public void explodir(Player jogador) {
        jogador.perderVida();
    }
}