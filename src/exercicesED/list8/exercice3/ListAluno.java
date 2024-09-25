/*
3. A classe  Aluno possui atributos  que  são  criados  na  classe  concreta e  acessados  por meio  dos  métodos  públicos  da  classe  (getters  e  setters).  Dado  o  cenário  implemente uma Lista Encadeadaque utilize pelo menos ummétodo recursivo.•Sejam criados  em uma  classe os atributos RA de tipo de dado inteiro, nome de tipo  de  dado  String,  turma  do  tipo  de  dado  String  e  semestre  do  tipo  de  dado String.  Estes  atributos  devem  ser  acessados  por  meio  de  seus  métodos  públicos (getters e setters). 
•Implemente um método que adicione um aluno no final da lista
•Implemente um método que adicione um  aluno no início da lista
•Implemente um método que adicione um aluno no meio da lista
 •Implemente um método que remova um aluno no final da lista
 •Implemente um método que remova um aluno no início da lista
 •Implemente um método que remova um aluno no meio da lista
 •Implemente um método que apresente cada um dos elementos da lista
 •Explique como a recursividade foi aplicada em cada um dos métodos, detalhando se foi aplicada recursividade direta ou indireta.
 */

package exercicesED.list8.exercice3;

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

    // Recursividade direta. Aqui ira ocorrer uma chamada recursiva ao metodo que
    // verifica se seu no dado como parametro, tem seu ponteiro apontado para o
    // nulo, que significa que se estiver apontado para null este e o ultimo no,
    // então, esse no e retornado; caso nao for o ultimo no, o metodo recursivo ira
    // chamar a si mesmo passando como parametro o proximo no do no dado por
    // parametro, percorrendo assim a lista
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
            // recursividade direta para achar o no final
            this.topNode = findFinalNode(topNode);
            this.topNode.setNext(no);
        }
    }

    public void addAnywhere(Aluno p, int pos) {
        No<Aluno> no = new No<>(p);
        if (pos == 1) {
            addBegin(p);
        } else {
            No<Aluno> aux = this.begin;
            int count = 1;
            // recursividade indireta. Enquanto nao for o final da lista e o contador (que
            // parte da primeira posicao) for menor que a posicao indicada pelo usuario, o
            // loop vai passando de no em no para encontrar a posicao indicada, pois o loop
            // só parara quando o auxiliar count chegar a posicao desejada. Nao ha nenhuma
            // chamada de uma funcao para si mesma
            while (aux.getNext() != null && count < pos - 1) {
                aux = aux.getNext();
                count++;
            }
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
                No<Aluno> current = begin;

                // recursividade direta para achar o ultimo no:
                current = findBeforeLast(topNode);
                // recursividade direta para achar o penultimo no:
                topNode = findFinalNode(topNode);

                current.setNext(null);
                result = topNode.getBegin();

            }
        }
        return result;
    }

    // Recursividade direta:
    // Aqui ira ocorrer uma chamada recursiva ao metodo que verifica se seu no dado
    // como parametro tem o ponteiro do seu no posterior apontado para o nulo, que
    // significa que se
    // estiver apontado para null este e o penultimo no, então, esse no e retornado;
    // caso nao for o penultimo no, o metodo recursivo ira chamar a si mesmo
    // passando como parametro o proximo no do no dado por parametro, percorrendo
    // assim a lista
    public No<Aluno> findBeforeLast(No<Aluno> node) {
        if (node.getNext().getNext() != null) {
            return findBeforeLast(node.getNext());
        }
        return node;
    }

    public Aluno removeAnywhere(int pos) {
        Aluno personRemoved = null;
        int i = 1;
        No<Aluno> aux = begin;

        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Empty List");
            return personRemoved;
        }
        if (pos == 1) {
            personRemoved = removeBegin();
            return personRemoved;
        } else {
            while (aux.getNext() != null) {
                aux = aux.getNext();
                i++;
            }
            if (pos > i || pos <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid Position!");
                return personRemoved;
            } else if (pos == i) {
                personRemoved = removeEnd();
                return personRemoved;
            } else {
                aux = begin;
                No<Aluno> aux2 = aux;

                // Recursividade indireta:
                // enquanto a posicao indicada pelo usuario nao chegar a primeira, um aulixiliar
                // ira receber o proximo no, partindo do no inicial e o outro auxiliar gurdara o
                // anterior a este, significa que o loop só parara quando o numero de posicoes
                // total dado pelo usuario for percorrida, assim, achando a posicao indicada
                while (pos > 1) {
                    aux2 = aux;
                    aux = aux.getNext();
                    pos--;
                }
                personRemoved = aux.getBegin();
                aux2.setNext(aux.getNext());
                return personRemoved;
            }
        }
    }

}
