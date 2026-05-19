package sempadrao.memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CabineVARTest {

    @Test
    void deveAnularGolManualmente() {
        PlacarJogo placar = new PlacarJogo();

        // O PROBLEMA: O cliente (VAR) tem que gerenciar as variáveis de estado manualmente
        int backupGolsCasa = placar.getGolsTimeCasa();
        int backupGolsFora = placar.getGolsTimeFora();

        // Gol!
        placar.marcarGolCasa();
        assertEquals("Casa 1 x 0 Fora", placar.getPlacarFormatado());

        // Anulou! O cliente tem que "injetar" os valores de volta manualmente
        placar.setGolsTimeCasa(backupGolsCasa);
        placar.setGolsTimeFora(backupGolsFora);

        assertEquals("Casa 0 x 0 Fora", placar.getPlacarFormatado());
    }
}