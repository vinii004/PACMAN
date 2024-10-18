package br.com.fiap.pacman;
import java.util.Random;

public class Ghost extends GameObject {
    private Random random = new Random(); 
    private int direcao; 
    
    public Ghost(int x, int y, int direction) {
        super(x, y);
        this.direcao = direction;
    }

    public void moveRandomly() {
        direcao = random.nextInt(4) * 90; 
        move(); 
    }

    public void move() {
        switch (direcao) {
            case 0:
                if (y > 0) y -= 50;
                break;
            case 90:
                if (x < ScreenSize - 50) x += 50;
                break;
            case 180:
                if (y < ScreenSize - 50) y += 50;
                break;
            case 270:
                if (x > 0) x -= 50;
                break;
        }
    }
}
