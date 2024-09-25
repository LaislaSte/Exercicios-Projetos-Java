package exercicesED.list9.exercice3;

import util.NoDuplo;

public class ListaDuplamenteEncadeada {
	private NoDuplo<Integer> inicio;

	public ListaDuplamenteEncadeada() {
		inicio = null;
	}

	public void addBegin(int e) {
		NoDuplo<Integer> n = new NoDuplo<Integer>(e);
		if (inicio != null) {
			n.setNext(inicio);
			inicio.setBefore(n);
		}
		inicio = n;
	}

	// verifica se a lista nao está
	public void addFinal(int e) {
		NoDuplo<Integer> n = new NoDuplo<Integer>(e);
		if (inicio == null) {
			inicio = n;
			n.setBefore(null);
			n.setNext(null);
		} else {
			NoDuplo<Integer> aux = inicio;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(n);
			n.setBefore(aux);
			n.setNext(null);
		}
	}

	public int removeBegin() {
		int r = -1;
		if (inicio == null) {
			System.out.println("Lista v�zia");
		} else {
			r = inicio.getBegin();
			inicio = inicio.getNext();
			if (inicio != null) {
				inicio.setBefore(null);
			}
		}
		return r;
	}

	public int removeFinal() {
		int r = -1;
		if (inicio == null) {
			System.out.println("Lista v�zia");
		} else if (inicio.getNext() == null) {
			r = inicio.getBegin();
			inicio = null;
		} else {
			NoDuplo<Integer> aux1 = inicio;
			NoDuplo<Integer> aux2 = inicio;
			while (aux1.getNext() != null) {
				aux2 = aux1;
				aux1 = aux1.getNext();
			}
			r = aux1.getBegin();
			aux1.setBefore(null);
			aux2.setNext(null);
		}
		return r;
	}

	public String list() {
		String r = " ";
		NoDuplo<Integer> aux = inicio;
		while (aux != null) {
			r = r + "\n" + aux.getBegin();
			aux = aux.getNext();
		}
		return r;
	}
}
