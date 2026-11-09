package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstatisticasTemporadaTest {

    @Test
    void deveContarEpisodiosAssistidos() {
        Temporada temporada = new Temporada(
                new Episodio("Piloto", 52, true),
                new Episodio("Episodio 2", 47, false),
                new Episodio("Episodio 3", 44, true),
                new Episodio("Episodio 4", 61, false),
                new Episodio("Episodio 5", 49, true)
        );

        assertEquals(3, EstatisticasTemporada.contarAssistidos(temporada));
    }

    @Test
    void deveCalcularDuracaoTotal() {
        Temporada temporada = new Temporada(
                new Episodio("Piloto", 52, true),
                new Episodio("Episodio 2", 47, false),
                new Episodio("Episodio 3", 44, true),
                new Episodio("Episodio 4", 61, false),
                new Episodio("Episodio 5", 49, true)
        );

        assertEquals(253, EstatisticasTemporada.calcularDuracaoTotal(temporada));
    }
}
