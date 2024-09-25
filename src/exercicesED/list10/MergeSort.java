package exercicesED.list10;

import java.util.Random;

public class MergeSort {
	/**
	 * Merge Sort Recursivo
	 * 
	 * @param origem array a ordenar
	 */
	public static void mergeSortRecursivo(int lista[], int inicio, int fim) {

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(lista, inicio, meio);
			mergeSortRecursivo(lista, meio + 1, fim);
			mesclar(lista, inicio, meio, meio + 1, fim);
		}
	}

	/**
	 * Junta dois arrays
	 * 
	 * @param lista1   lista
	 * @param inicioA  In�cio da 1a. subdivis�o
	 * @param fimLeft  Final da 1a. subdivis�o
	 * @param inicioB  In�cio da 2a. subdivis�o
	 * @param fimRigth Final da 2a. subdivis�o
	 */
	public static void mesclar(int lista[], int inicioA, int fimLeft, int inicioB, int fimRigth) {
		int inicioIndLeft = inicioA;
		int inicioIndRigth = inicioB;
		int iaux = inicioA;
		int auxList[] = new int[lista.length];

		// enquanto as pilhas nao estiverem vazias
		while (inicioIndLeft <= fimLeft && inicioIndRigth <= fimRigth) {
			// compara as pilhas, com o topo da direita e o topo da esquerda
			if (lista[inicioIndLeft] <= lista[inicioIndRigth])
				// se o topo da esquerda for menor ou igual ao topo da direita, adiciona o topo
				// da esquerda ao array auxiliar
				auxList[iaux++] = lista[inicioIndLeft++];
			else
				// se o topo da direita for menor ou igual ao topo da esquerda, adiciona o topo
				// da direita ao array auxiliar
				auxList[iaux++] = lista[inicioIndRigth++];
		}

		// vai fazer uma juncao das subdivisoes separadas
		// percorre o array esquerdo adicionando os elementos a lista auxiliar
		while (inicioIndLeft <= fimLeft)
			auxList[iaux++] = lista[inicioIndLeft++];
		// percorre o array direito adicionando os elementos a lista auxiliar
		while (inicioIndRigth <= fimRigth)
			auxList[iaux++] = lista[inicioIndRigth++];
		// copia os elementos da lista auxiliar para o array principal
		for (int i = inicioA; i <= fimRigth; i++)
			lista[i] = auxList[i];
	}

	public static void main(String args[]) {
		Random r = new Random();
		int lista[] = new int[20];
		int i;

		// montando lista nao ordenada
		System.out.println("Lista nao ordenada: \n ");
		for (i = 0; i < lista.length; i++) {
			lista[i] = r.nextInt(90);
			System.out.print(lista[i] + "  ");
		}

		// MergeSort Recursivo
		System.out.println("\nAlgoritmo MergeSort Recursivo\nLista Ordenada");
		mergeSortRecursivo(lista, 0, (lista.length) - 1);
		for (i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + "  ");
		}

	}
}
