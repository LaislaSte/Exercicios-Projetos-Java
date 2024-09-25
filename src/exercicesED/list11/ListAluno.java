package exercicesED.list11;

import javax.swing.JOptionPane;

import util.No;

public class ListAluno {
    private No<Aluno> begin;
    private No<Aluno> topNode;
    private Aluno aluno;

    public boolean isEmpty() {
        if (this.begin == null) {
            return true;
        } else {
            return false;
        }
    }

    public String list() {
        No<Aluno> aux = begin;
        String r = " ";
        while (aux != null) {
            r = r + "\n" + aux.getBegin().toString();
            aux = aux.getNext();
        }
        return r;
    }

    public No<Aluno> findFinalNode(No<Aluno> node) {
        if (node.getNext() != null) {
            return findFinalNode(node.getNext());
        }
        return node;
    }

    public void addBegin(Aluno p) {
        No<Aluno> no = new No<>(p);
        if (isEmpty()) {
            begin = no;
        } else {
            no.setNext(this.begin);
            this.begin = no;
        }
    }

    public void addEnd(Aluno p) {
        No<Aluno> no = new No<>(p);
        if (isEmpty()) {
            begin = no;
        } else {
            this.topNode = this.begin;
            this.topNode = findFinalNode(topNode);
            this.topNode.setNext(no);
        }
    }

    public Aluno removeBegin() {
        aluno = null;
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty List");
        } else {
            aluno = begin.getBegin();
            this.begin = begin.getNext();
        }
        return aluno;
    }

    public Aluno removeEnd() {
        Aluno result = null;
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Empty list");
        } else {
            if (begin.getNext() == null) {
                result = begin.getBegin();
                begin = null;
            } else {
                this.topNode = begin;
                No<Aluno> current = begin;
                current = findBeforeLast(topNode);
                topNode = findFinalNode(topNode);

                current.setNext(null);
                result = topNode.getBegin();

            }
        }
        return result;
    }

    public No<Aluno> findBeforeLast(No<Aluno> node) {
        if (node.getNext().getNext() != null) {
            return findBeforeLast(node.getNext());
        }
        return node;
    }

}
