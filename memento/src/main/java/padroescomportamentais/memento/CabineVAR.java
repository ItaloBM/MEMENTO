package padroescomportamentais.memento;
import java.util.Stack;

public class CabineVAR {
    // Guarda o histórico de lances
    private Stack<PlacarMemento> historico = new Stack<>();

    public void registrarLance(PlacarJogo placar) {
        historico.push(placar.salvarEstado());
    }

    public void anularUltimoLance(PlacarJogo placar) {
        if (!historico.isEmpty()) {
            placar.restaurarEstado(historico.pop());
        }
    }
}