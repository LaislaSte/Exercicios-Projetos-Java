package exercicesED.list5;

public class PilhaLivro {
	
	private Livro dados[];
	private int tamanho;


	public PilhaLivro(int n){
		dados=new Livro[n];
		tamanho=0;
	}
	
	public boolean estaCheio() {
		boolean retorno = false;
		if (tamanho == dados.length) {
			retorno = true;
		}
		return retorno;
	}

	public boolean estaVazio() {
		boolean retorno = false;
		if (tamanho == 0) {
			retorno = true;
		}
		return retorno;
	}
	
	public void push(Livro livro) {
		if (tamanho > 0) {
			this.dados[tamanho] = livro;
			this.tamanho++;
		} else {
			this.dados[0] = livro;
			this.tamanho++;
		}
	}

	public Livro pop() {
		Livro retorno = null;
		retorno = dados[tamanho - 1];
		this.tamanho--;
		return retorno;
	}

	public String percorrer() {
		String msg = "";
		for (int i = 0; i < tamanho; i++) {
			msg = msg + dados[i].toString() + "\n";
		}
		return msg;
	}

}
