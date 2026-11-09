package iterator;

import java.util.Iterator;

public class EstatisticasTemporada {

    public static int contarAssistidos(Temporada temporada) {
        int quantidade = 0;

        for (Episodio episodio : temporada) {
            if (episodio.isAssistido()) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static int calcularDuracaoTotal(Temporada temporada) {
        int duracaoTotal = 0;

        for (Iterator<Episodio> iterator = temporada.iterator(); iterator.hasNext();) {
            Episodio episodio = iterator.next();
            duracaoTotal += episodio.getDuracaoMinutos();
        }

        return duracaoTotal;
    }
}
