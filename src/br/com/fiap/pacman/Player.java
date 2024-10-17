package br.com.fiap.pacman;

public class Player extends GameObject {
    private int life;
    private int direction;
    private boolean invencivel;



    public Player(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
        this.life = 3;
        this.invencivel = false;
    }


    public void setDirection(int direction) {
        this.direction = direction;
    }


    public int getLife() {
        return life;
    }

    public void setLife(int vidas) {
        this.life = vidas;
    }


    public void perderVida() {
        if (!invencivel) {
            this.life--;
        }
    }

    public void move() {
        switch (direction) {
            case 0:
                if (y > 0) {
                    y -= 50;
                } else {
                    y = ScreenSize - 50;
                }
                break;
            case 90:
                if (x < ScreenSize - 50) {
                    x += 50;
                } else {
                    x = 0;
                }
                break;
            case 180:
                if (y < ScreenSize - 50) {
                    y += 50;
                } else {
                    y = 0;
                }
                break;
            case 270:
                if (x > 0) {
                    x -= 50;
                } else {
                    x = ScreenSize - 50;
                }
                break;
        }
    }



    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }
}
