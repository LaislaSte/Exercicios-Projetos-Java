package exercicesED.list5;

import javax.swing.JOptionPane;

public class Fila {
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

	public void adicionarFinal(char c) {
		if (tamanho > 0) {
			this.dados[tamanho] = c;
			this.tamanho++;
		} else {
			this.dados[0] = c;
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


	public String percorrer() {
		String msg = "";
		for (int i = 0; i < tamanho; i++) {
			msg = msg + dados[i] + "\n";
		}
		return msg;
	}

	public void menu(String[] args) {
		Fila f = new Fila();
		int option = 99;
		char e;

		while (option != 0) {
			option = Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao desejada: \n" + "1 - adicionar no final \n"
					+ "2 - remover no final \n" + "3 - percorrer \n" + "0 - encerrar"));
			
			switch (option) {
			case 1: {
				if (!f.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira o caracter desejado").charAt(0);
					f.adicionarFinal(e);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 2: {
				if (!f.estaVazio()) {
					JOptionPane.showMessageDialog(null, f.removerInicio());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 3: {
				if (!f.estaVazio()) {
					JOptionPane.showMessageDialog(null, f.percorrer());
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
