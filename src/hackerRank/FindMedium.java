package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class FindMedium {

	public static void main(String[] args) {
		/*
		 * findMediu List<Integer> lista = new ArrayList<>(); lista.add(1);
		 * lista.add(3); lista.add(4); lista.add(6); lista.add(5); lista.add(2);
		 * lista.add(0); lista.add(7); lista.add(8); System.out.println("Deser." +
		 * lista); lista = lista.stream().sorted().toList();
		 * System.out.println("Organi." + lista); int idx = 0;
		 * 
		 * if(!(lista.size() % 2 == 0)) { idx = lista.size() /2;
		 * System.out.println(lista.get(idx)); }
		 */

		// guardar o valor do indice e o indice;
		// remover esse valor do array com o indice
		// comparar no array se existe um numero == a esse valor removido
		// se nao houver um numero igua a esse valor no arr
		// adicione ao resultado o valor desse indice

		int result = 0;
		int idxA = 0;
		int auxValue = 0;
		List<Integer> lista = new ArrayList<>(); lista.add(1);
		 lista.add(1); lista.add(2);
		 
		 
		 
		final List<Integer> auxList = lista;

		if (auxList.size() > 1) {

			for (int i = 0; i < lista.size(); i++) {
				idxA = i;
				auxValue = lista.get(i);
				auxList.remove(i);
				
				if (!(lista.contains(auxValue))) {
					result = auxValue;
				}
			}

		} else {
			result = 1;
		}
		




	}

}
