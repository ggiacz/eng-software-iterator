package iterator;

public class Episodio {

    private String titulo;
    private int duracaoMinutos;
    private boolean assistido;

    public Episodio(String titulo, int duracaoMinutos, boolean assistido) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
        this.assistido = assistido;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public boolean isAssistido() {
        return assistido;
    }
}
