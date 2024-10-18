package br.com.fiap.pacman.Objetos;

public class GameObject {
    protected int x; 
    protected int y;
    protected int ScreenSize; 

  
    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void setScreenSize(int tamanhoTela) {
        this.ScreenSize = tamanhoTela;
    }

    public boolean colideCom(GameObject outro) {
        return this.x == outro.x && this.y == outro.y;
    }
/*no caso da bomba for coletada ela some*/
    public void setFoiColetado(boolean b) {
    }
}
