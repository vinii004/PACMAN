package br.com.fiap.pacman;

public class Item extends GameObject {
    private boolean visible; // Visibilidade do item

    // Construtor que inicializa a posição e define o item como visível
    public Item(int x, int y) {
        super(x, y);
        this.visible = true;
    }

    // Método que retorna se o item está visível
    public boolean isVisible() {
        return visible;
    }

    // Método que define a visibilidade do item
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    // Método para coletar o item, definindo-o como não visível
    public void coletar() {
        this.visible = false;
    }

    // Método que verifica se o item foi coletado
    public boolean foiColetado() {
        return !this.visible;
    }
}
