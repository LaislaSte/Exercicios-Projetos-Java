package exercicesED.list5;

import javax.swing.JOptionPane;

public class TesteFilaLivro {
	
	public static void main(String[]args){
		FilaLivro fl = new FilaLivro(5);
		
		String titulo;
		int qtdExem, option=99;
		
		while (option != 0) {
			option = Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao desejada: \n" + "1 - enqueue \n"
					+ "2 - dequeue \n" + "3 - percorrer \n" + "0 - encerrar"));
			
			switch (option) {
			case 1: {
				if (!fl.estaCheio()) {
					titulo = JOptionPane.showInputDialog(null, "insira o titulo do livro");
					qtdExem = Integer.parseInt(JOptionPane.showInputDialog(null, "insira a quantidade de exemplares"));
					fl.enqueue(new Livro(titulo, qtdExem));
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 2: {
				if (!fl.estaVazio()) {
					JOptionPane.showMessageDialog(null, "Livro removido: \n" + fl.dequeue());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 3: {
				if (!fl.estaVazio()) {
					JOptionPane.showMessageDialog(null, fl.percorrer());
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
