package sempadrao.memento;

public class PlacarJogo {
    // O PROBLEMA: Para o cliente conseguir salvar o estado, as variáveis precisam
    // estar expostas (ter getters e setters para tudo), quebrando o encapsulamento.
    private int golsTimeCasa = 0;
    private int golsTimeFora = 0;

    public void marcarGolCasa() { golsTimeCasa++; }
    public void marcarGolFora() { golsTimeFora++; }

    public int getGolsTimeCasa() { return golsTimeCasa; }
    public void setGolsTimeCasa(int golsTimeCasa) { this.golsTimeCasa = golsTimeCasa; }

    public int getGolsTimeFora() { return golsTimeFora; }
    public void setGolsTimeFora(int golsTimeFora) { this.golsTimeFora = golsTimeFora; }

    public String getPlacarFormatado() {
        return "Casa " + golsTimeCasa + " x " + golsTimeFora + " Fora";
    }
}