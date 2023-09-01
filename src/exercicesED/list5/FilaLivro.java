package exercicesED.list5;

public class FilaLivro {
	
	private Livro dados[];
	private int tamanho;


	public FilaLivro(int n){
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
	
	public void enqueue(Livro livro) {
		if (tamanho > 0) {
			this.dados[tamanho] = livro;
			this.tamanho++;
		} else {
			this.dados[0] = livro;
			this.tamanho++;
		}
	}

	public Livro dequeue() {
		Livro retorno = null;
		retorno = dados[0];
		for (int i = 1; i < tamanho; i++) {
			this.dados[i - 1] = dados[i];
		}
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
