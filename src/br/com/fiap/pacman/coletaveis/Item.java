package br.com.fiap.pacman.coletaveis;

import br.com.fiap.pacman.Objetos.GameObject;

public class Item extends GameObject {
    private boolean visible; 

    public Item(int x, int y) {
        super(x, y);
        this.visible = true;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void coletar() {
        this.visible = false;
    }

    public boolean foiColetado() {
        return !this.visible;
    }
}
