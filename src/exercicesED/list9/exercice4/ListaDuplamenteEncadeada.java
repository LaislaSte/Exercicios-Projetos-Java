package exercicesED.list9.exercice4;

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

	public void addFinal(int e) {
		NoDuplo<Integer> n = new NoDuplo<Integer>(e);
		if (inicio == null) {
			inicio = n;
			n.setBefore(null);
			n.setNext(null);
		} else {
			NoDuplo<Integer> aux = findFinalNode(inicio);
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
			NoDuplo<Integer> aux = findElementToRemove(inicio, inicio);
			r = aux.getNext().getBegin();
			aux.setNext(null);
		}
		return r;
	}

	private NoDuplo<Integer> findFinalNode(NoDuplo<Integer> node) {
		if (node.getNext() != null) {
			return findFinalNode(node.getNext());
		}
		return node;
	}

	private NoDuplo<Integer> findElementToRemove(NoDuplo<Integer> node, NoDuplo<Integer> aux) {
		if (node.getNext() != null) {
			return findElementToRemove(node.getNext(), aux);
		}
		return aux;
	}

	public String list() {
		NoDuplo<Integer> aux = inicio;
		String r = " ";
		r = concat(aux, r);
		r += "\n" + findFinalNode(aux).getBegin();
		return r;
	}

	private String concat(NoDuplo<Integer> node, String str) {
		if (node.getNext() != null) {
			return concat(node.getNext(), str + "\n" + node.getBegin());
		}
		return str;
	}
}
