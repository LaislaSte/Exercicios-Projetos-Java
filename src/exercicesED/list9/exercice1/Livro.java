package exercicesED.list9.exercice1;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private int quantidade;

    public Livro(String titulo, int quantidade) {
        this.titulo = titulo;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int compareTo(Livro livro) {
        return this.titulo.compareTo(livro.titulo);
    }
}
