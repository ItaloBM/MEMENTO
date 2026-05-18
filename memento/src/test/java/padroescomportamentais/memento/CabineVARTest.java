package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CabineVARTest {
    @Test
    void deveAnularGolEVoltarPlacarAoNormal() {
        PlacarJogo placar = new PlacarJogo();
        CabineVAR var = new CabineVAR();

        // Placar inicial 0x0. O VAR tira a fotografia antes do lance perigoso.
        var.registrarLance(placar);

        // Time da casa marca gol (Fica 1x0)
        placar.marcarGolCasa();
        assertEquals("Casa 1 x 0 Fora", placar.getPlacarFormatado());

        // O juiz vai ao VAR e anula o gol! Restauramos a fotografia!
        var.anularUltimoLance(placar);
        assertEquals("Casa 0 x 0 Fora", placar.getPlacarFormatado()); // Voltou para 0x0
    }
}