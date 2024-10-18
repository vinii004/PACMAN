package br.com.fiap.pacman;

public class Booster extends Item {
    private int duration;


    public Booster(int x, int y, int duration) {
        super(x, y);
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }

    public void aplicarEfeito(Player jogador) {
        jogador.setInvencivel(true);
        System.out.println("Booster aplicado. Duração: " + getDuration() + " turnos.");
    }


    public void reduzirDuracao() {
        if (duration > 0) {
            duration--;
            System.out.println("Duração restante do booster: " + getDuration() + " turnos.");
        }
    }

    public boolean isEfeitoAtivo() {
        return duration <= 0;
    }
}
