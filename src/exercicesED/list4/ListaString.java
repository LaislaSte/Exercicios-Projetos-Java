package exercicesED.list4;

import javax.swing.JOptionPane;

public class ListaString {

	String[] dados = new String[5];

	int tamanho = 0;

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

	public void adicionarInicio(String c) {
		if (tamanho > 0) {
			for (int i = tamanho; i == 0; i--) {
				this.dados[i] = dados[i - 1];
			}
		}
		this.dados[0] = c;
		this.tamanho++;
	}

	public void adicionarFinal(String c) {
		if (tamanho > 0) {
			this.dados[tamanho] = c;
			this.tamanho++;
		} else {
			this.dados[0] = c;
			this.tamanho++;
		}
	}

	public void adicionarQualquerPosicao(String e, int pos) {
		int i;
		if (pos < tamanho + 1 && pos >= 0) {
			for (i = tamanho; i != pos; i--) {
				if (i != 0) {
					this.dados[i] = dados[i - 1];
				}
			}
			this.dados[i] = e;
			this.tamanho++;
		}

	}

	public String removerInicio() {
		String retorno = "";
		retorno = dados[0];
		for (int i = 1; i < tamanho; i++) {
			this.dados[i - 1] = dados[i];
		}
		this.tamanho--;
		return retorno;
	}

	public String removerFinal() {
		String retorno = "";
		retorno = dados[tamanho - 1];
		this.tamanho--;
		return retorno;
	}

	public String removerQualquerPosicao(int pos) {
		int i;
		String retorno = "";
		if (pos < tamanho && pos >= 0) {
			retorno = dados[pos];
			for (i = pos; i < tamanho - 1; i++) {
				this.dados[i] = dados[i + 1];
			}
			this.tamanho--;
		}
		return retorno;
	}

	public String percorrer() {
		String msg = "";
		for (int i = 0; i < tamanho; i++) {
			msg = msg + dados[i] + "\n";
		}
		return msg;
	}

	public int callMenu() {
		return Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao desejada: \n" + "1 - adicionar no comeco \n"
				+ "2 - adicionar no final \n" + "3 - adicionar em qualquer posicao \n" + "4 - remover no comeco \n"
				+ "5 - remover no final \n" + "6 - remover qualquer posicao \n" + "7 - percorrer \n" + "0 - encerrar"));

	}

	public static void main(String[] args) {
		ListaString ls = new ListaString();
		int option = 99, pos;
		String e;

		while (option != 0) {
			option = ls.callMenu();
			switch (option) {
			case 1: {
				if (!ls.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira a palavra a ser adicionada");
					ls.adicionarInicio(e);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 2: {
				if (!ls.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira a palavra a ser adicionada");
					ls.adicionarFinal(e);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 3: {
				if (!ls.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira a palavra a ser adicionada");
					pos = Integer.parseInt(JOptionPane.showInputDialog("insira a posicao desejada"));
					ls.adicionarQualquerPosicao(e, pos);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 4: {
				if (!ls.estaVazio()) {
					JOptionPane.showMessageDialog(null, ls.removerInicio());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 5: {
				if (!ls.estaVazio()) {
					JOptionPane.showMessageDialog(null, ls.removerFinal());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 6: {
				if (!ls.estaVazio()) {
					pos = Integer.parseInt(JOptionPane.showInputDialog("insira a posicao desejada"));
					JOptionPane.showMessageDialog(null, ls.removerQualquerPosicao(pos));
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 7: {
				if (!ls.estaVazio()) {
					JOptionPane.showMessageDialog(null, ls.percorrer());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 0: {
				option = 0;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);

			}

		}

	}

}