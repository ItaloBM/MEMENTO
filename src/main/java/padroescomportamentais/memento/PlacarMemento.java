package padroescomportamentais.memento;

public class PlacarMemento {
    private final int golsTimeCasa;
    private final int golsTimeFora;

    public PlacarMemento(int golsTimeCasa, int golsTimeFora) {
        this.golsTimeCasa = golsTimeCasa;
        this.golsTimeFora = golsTimeFora;
    }

    public int getGolsTimeCasa() { return golsTimeCasa; }
    public int getGolsTimeFora() { return golsTimeFora; }
}