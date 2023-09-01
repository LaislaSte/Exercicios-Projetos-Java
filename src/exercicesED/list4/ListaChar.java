package exercicesED.list4;

import javax.swing.JOptionPane;

public class ListaChar{

	char[] dados = new char[5];

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

	public void adicionarInicio(char c) {
		if (tamanho > 0) {
			for (int i = tamanho; i == 0; i--) {
				this.dados[i] = dados[i - 1];
			}
		}
		this.dados[0] = c;
		this.tamanho++;
	}

	public void adicionarFinal(char c) {
		if (tamanho > 0) {
			this.dados[tamanho] = c;
			this.tamanho++;
		} else {
			this.dados[0] = c;
			this.tamanho++;
		}
	}

	public void adicionarQualquerPosicao(char e, int pos) {
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

	public char removerInicio() {
		char retorno = 0;
		retorno = dados[0];
		for (int i = 1; i < tamanho; i++) {
			this.dados[i - 1] = dados[i];
		}
		this.tamanho--;
		return retorno;
	}

	public char removerFinal() {
		char retorno = 0;
		retorno = dados[tamanho - 1];
		this.tamanho--;
		return retorno;
	}

	public char removerQualquerPosicao(int pos) {
		int i;
		char retorno = 0;
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
		ListaChar lc = new ListaChar();
		int option = 99, pos;
		char e;

		while (option != 0) {
			option = lc.callMenu();
			switch (option) {
			case 1: {
				if (!lc.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira o caracter desejado").charAt(0);
					lc.adicionarInicio(e);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 2: {
				if (!lc.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira o caracter desejado").charAt(0);
					lc.adicionarFinal(e);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 3: {
				if (!lc.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira a o caracter desejado").charAt(0);
					pos = Integer.parseInt(JOptionPane.showInputDialog("insira a posicao desejada"));
					lc.adicionarQualquerPosicao(e, pos);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 4: {
				if (!lc.estaVazio()) {
					JOptionPane.showMessageDialog(null, lc.removerInicio());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 5: {
				if (!lc.estaVazio()) {
					JOptionPane.showMessageDialog(null, lc.removerFinal());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 6: {
				if (!lc.estaVazio()) {
					pos = Integer.parseInt(JOptionPane.showInputDialog("insira a posicao desejada"));
					JOptionPane.showMessageDialog(null, lc.removerQualquerPosicao(pos));
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 7: {
				if (!lc.estaVazio()) {
					JOptionPane.showMessageDialog(null, lc.percorrer());
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