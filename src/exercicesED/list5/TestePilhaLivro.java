package exercicesED.list5;

import javax.swing.JOptionPane;

public class TestePilhaLivro {
	
	public static void main(String[]args){
		PilhaLivro pl = new PilhaLivro(5);
		
		String titulo;
		int qtdExem, option=99;
		
		while (option != 0) {
			option = Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao desejada: \n" + "1 - empilhar \n"
					+ "2 - desempilhar \n" + "3 - percorrer \n" + "0 - encerrar"));
			
			switch (option) {
			case 1: {
				if (!pl.estaCheio()) {
					titulo = JOptionPane.showInputDialog(null, "insira o titulo do livro");
					qtdExem = Integer.parseInt(JOptionPane.showInputDialog(null, "insira a quantidade de exemplares"));
					pl.push(new Livro(titulo, qtdExem));
				} else {
					JOptionPane.showMessageDialog(null, "Lista cheia!");
				}
				break;
			}
			case 2: {
				if (!pl.estaVazio()) {
					JOptionPane.showMessageDialog(null, "Livro removido: \n" + pl.pop());
				} else {
					JOptionPane.showMessageDialog(null, "Lista está vazia!");
				}
				break;
			}
			case 3: {
				if (!pl.estaVazio()) {
					JOptionPane.showMessageDialog(null, pl.percorrer());
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
