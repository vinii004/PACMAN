package br.com.fiap.pacman;

public class GameObject {
    protected int x; // Coordenada X do objeto
    protected int y; // Coordenada Y do objeto
    protected int ScreenSize; // Tamanho da tela

    // Construtor para inicializar a posição do objeto
    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getters e setters para coordenadas X e Y
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

    // Método setter para o tamanho da tela
    public void setScreenSize(int tamanhoTela) {
        this.ScreenSize = tamanhoTela;
    }

    // Método para verificar se há colisão com outro objeto
    public boolean colideCom(GameObject outro) {
        return this.x == outro.x && this.y == outro.y;
    }
}
