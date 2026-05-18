package padroescomportamentais.memento;

public class PlacarJogo {
    private int golsTimeCasa = 0;
    private int golsTimeFora = 0;

    public void marcarGolCasa() { golsTimeCasa++; }
    public void marcarGolFora() { golsTimeFora++; }

    public String getPlacarFormatado() {
        return "Casa " + golsTimeCasa + " x " + golsTimeFora + " Fora";
    }

    // Tira a fotografia
    public PlacarMemento salvarEstado() {
        return new PlacarMemento(golsTimeCasa, golsTimeFora);
    }

    // Restaura a fotografia
    public void restaurarEstado(PlacarMemento memento) {
        this.golsTimeCasa = memento.getGolsTimeCasa();
        this.golsTimeFora = memento.getGolsTimeFora();
    }
}