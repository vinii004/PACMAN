package br.com.fiap.pacman;

public class Booster extends Item {
    private int duration; // Duração do efeito do booster

    // Construtor que inicializa a posição e a duração do booster
    public Booster(int x, int y, int duration) {
        super(x, y);
        this.duration = duration;
    }

    // Método que retorna a duração do efeito
    public int getDuration() {
        return duration;
    }

    // Aplica o efeito do booster ao jogador
    public void aplicarEfeito(Player jogador) {
        jogador.setInvencivel(true);
        System.out.println("Booster aplicado. Duração: " + getDuration() + " turnos.");
    }

    // Reduz a duração do efeito do booster
    public void reduzirDuracao() {
        if (duration > 0) {
            duration--;
            System.out.println("Duração restante do booster: " + getDuration() + " turnos.");
        }
    }

    // Verifica se o efeito do booster ainda está ativo
    public boolean isEfeitoAtivo() {
        return duration > 0;
    }
}
