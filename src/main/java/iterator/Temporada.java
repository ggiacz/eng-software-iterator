package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Temporada implements Iterable<Episodio> {

    private List<Episodio> episodios;

    public Temporada(Episodio... episodios) {
        this.episodios = Arrays.asList(episodios);
    }

    @Override
    public Iterator<Episodio> iterator() {
        return episodios.iterator();
    }
}
