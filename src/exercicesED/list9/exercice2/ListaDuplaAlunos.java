package exercicesED.list9.exercice2;

import javax.swing.JOptionPane;

import util.NoDuplo;

// Lista duplamente encadeada com metodos recursivos add e remove anywhere 
public class ListaDuplaAlunos {
    private NoDuplo<Aluno> begin;
    private NoDuplo<Aluno> topNode;
    private Aluno aluno;
    private int i;

    public boolean isEmpty() {
        if (this.begin == null) {
            return true;
        } else {
            return false;
        }
    }

    public String list() {
        NoDuplo<Aluno> aux = begin;
        String r = " ";
        r = recursiveList(r, aux);
        r += "\n" + findFinalNode(aux).getBegin();
        return r;
    }

    public void addEnd(Aluno p) {
        NoDuplo<Aluno> no = new NoDuplo<>(p);
        if (isEmpty()) {
            begin = no;
        } else {
            this.topNode = begin;
            // recursividade direta para achar o no final
            this.topNode = findFinalNode(topNode);
            this.topNode.setNext(no);
        }
    }

    public void addBegin(Aluno p) {
        NoDuplo<Aluno> no = new NoDuplo<>(p);
        if (isEmpty()) {
            begin = no;
        } else {
            no.setNext(this.begin);
            this.begin = no;
        }
    }

    public void addAnywhere(Aluno p, int pos) {
        NoDuplo<Aluno> no = new NoDuplo<>(p);
        if (pos == 1) {
            addBegin(p);
        } else {
            NoDuplo<Aluno> aux = this.begin;
            int count = 1;
            aux = recursiveAddAnywhere(aux, count, pos);
            if (count == pos - 1) {
                no.setNext(aux.getNext());
                aux.setNext(no);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid position");
            }
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
                NoDuplo<Aluno> current = begin;

                current = findBeforeLast(topNode);
                topNode = findFinalNode(topNode);

                current.setNext(null);
                result = topNode.getBegin();

            }
        }
        return result;
    }

    public Aluno removeAnywhere(int pos) {
        Aluno personRemoved = null;
        NoDuplo<Aluno> aux = begin;

        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Empty List");
            return personRemoved;
        }
        if (pos == 1) {
            personRemoved = removeBegin();
            return personRemoved;
        } else {
            this.i = 0;
            aux = findFinalNode(aux);
            if (pos > i || pos <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid Position!");
                return personRemoved;
            } else if (pos == i) {
                personRemoved = removeEnd();
                return personRemoved;
            } else {
                aux = begin;
                NoDuplo<Aluno> aux2 = aux;

                aux = recursiveRemoveAnywhere(aux2, pos);
                aux2 = recursiveRemoveAnywhereBefore(aux2, pos);

                // ultimo recebe o proximo do penultimo e o penultimo recebe o proximo do ultimo
                personRemoved = aux.getBegin();
                aux2.setNext(aux.getNext());
                return personRemoved;
            }
        }
    }

    // RECURSIVE METHODS
    private String recursiveList(String str, NoDuplo<Aluno> aux) {
        if (aux.getNext() != null)
            return recursiveList(str + aux.getBegin() + "\n", aux.getNext());
        return str;
    }

    public NoDuplo<Aluno> findFinalNode(NoDuplo<Aluno> node) {
        if (node.getNext() != null) {
            this.i++;
            return findFinalNode(node.getNext());
        }
        return node;
    }

    public NoDuplo<Aluno> findBeforeLast(NoDuplo<Aluno> node) {
        if (node.getNext().getNext() != null)
            return findBeforeLast(node.getNext());
        return node;
    }

    private NoDuplo<Aluno> recursiveAddAnywhere(NoDuplo<Aluno> aux, int count, int pos) {
        if (aux.getNext() != null && count < pos - 1)
            recursiveAddAnywhere(aux.getNext(), count++, pos);
        return aux;
    }

    private NoDuplo<Aluno> recursiveRemoveAnywhere(NoDuplo<Aluno> aux, int pos) {
        if (pos > 1)
            return recursiveRemoveAnywhere(aux.getNext(), pos--);
        return aux;
    }

    private NoDuplo<Aluno> recursiveRemoveAnywhereBefore(NoDuplo<Aluno> aux, int pos) {
        if (pos > 1)
            return recursiveRemoveAnywhereBefore(aux.getNext().getNext(), pos--);
        return aux;
    }

}