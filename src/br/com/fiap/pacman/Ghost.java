package br.com.fiap.pacman;

import java.util.Random;

public class Ghost extends GameObject {
    private Random random = new Random(); // Instância de Random para movimento aleatório
    private int direcao; // Direção atual do fantasma

    // Construtor que inicializa a posição e a direção do fantasma
    public Ghost(int x, int y, int direction) {
        super(x, y);
        this.direcao = direction;
    }

    // Método para mover o fantasma de forma aleatória
    public void moveRandomly() {
        direcao = random.nextInt(4) * 90; // Gera uma direção aleatória (0, 90, 180, 270 graus)
        move(); // Chama o método move para aplicar a nova direção
    }

    // Método para mover o fantasma baseado na direção
    public void move() {
        switch (direcao) {
            case 0: // Move para cima
                if (y > 0) y -= 50;
                break;
            case 90: // Move para a direita
                if (x < ScreenSize - 50) x += 50;
                break;
            case 180: // Move para baixo
                if (y < ScreenSize - 50) y += 50;
                break;
            case 270: // Move para a esquerda
                if (x > 0) x -= 50;
                break;
        }
    }
}
