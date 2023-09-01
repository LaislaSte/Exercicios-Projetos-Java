package exercicesED.list5;

import javax.swing.JOptionPane;

/*
 * Implemente uma Pilha para o problema apresentado no Exercício 1. 
 * 
 * Implemente também uma classe de teste que possui uma instância da classe Fila e uma 
 * instância da classe Pilha. 
 * 
 * Cada elemento removido da Fila deve ser adicionado 
 * no topo da Pilha. Cada elemento removido da Pilha deve ser adicionado no final 
 * da Fila
 * */

public class Teste {
	
	public static void main(String[] args) {
		Fila f = new Fila();
		Pilha p = new Pilha();

		int option = 99;
		char e;

		while (option != 0) {
			option =  Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao desejada: \n" + "1 - adicionar na fila \n"
					+ "2 - remover da fila \n" + "3 - percorrer a fila \n" + "4 - adicionar na pilha \n"
					+ "5 - remover da pilha \n" + "6 - percorrer a pilha \n" + "0 - encerrar"));
			
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
					e = f.removerInicio();
					p.adicionarFinal(e);
					JOptionPane.showMessageDialog(null, e);
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
			
			case 4: {
				if (!p.estaCheio()) {
					e = JOptionPane.showInputDialog(null, "insira o caracter desejado").charAt(0);
					p.adicionarFinal(e);
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 5: {
				if (!p.estaVazio()) {
					e = p.removerFinal();
					f.adicionarFinal(e);
					JOptionPane.showMessageDialog(null, e);
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 6: {
				if (!p.estaVazio()) {
					JOptionPane.showMessageDialog(null, p.percorrer());
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
