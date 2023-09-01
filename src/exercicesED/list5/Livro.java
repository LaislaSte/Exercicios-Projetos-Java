package exercicesED.list5;

public class Livro {
	private String titulo;
	private int quantExemplares;
	
	public Livro(String titulo, int quantExemplares) {
		super();
		this.titulo = titulo;
		this.quantExemplares = quantExemplares;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQuantExemplares() {
		return quantExemplares;
	}
	public void setQuantExemplares(int quantExemplares) {
		this.quantExemplares = quantExemplares;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", quantExemplares=" + quantExemplares + "]";
	}
	

}
