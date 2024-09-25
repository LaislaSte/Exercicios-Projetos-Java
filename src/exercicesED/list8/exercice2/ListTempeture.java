/* 2. Implemente uma Lista de temperaturas em alocação dinâmicacom todas as operações indicadas a seguire que utilize pelo menos um método recursivo.
•verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
•adicionar uma temperatura no início da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
•adicionar uma temperatura no final da lista, caso a operação não possa ser realizada, mostre mensagemavisando;
•adicionar uma temperatura em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagemavisando;•remover a temperatura do início da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagemavisando;
•remover a temperatura do final da lista, retornando o valor que foi removido, caso a operação não  possa ser realizada, mostre mensagem avisando;
•remover a temperatura de determinada posição da lista, retornando o valor que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
•percorrer e apresentar cada um dos elementos da lista.
•Explique como a recursividade foi aplicada em cada um dos métodos, detalhando se foi aplicada recursividade direta ou indireta.
*/

package exercicesED.list8.exercice2;

import javax.swing.JOptionPane;
import util.No;

public class ListTempeture {

    private No<Integer> begin;
    private No<Integer> topNode;
    private Integer tempetureInteger;

    public boolean isEmpty() {
        if (this.begin == null) {
            return true;
        } else {
            return false;
        }
    }

    public String list() {
        No<Integer> aux = begin;
        String r = " ";
        // Recursividade indireta
        while (aux != null) {
            r = r + "\n" + aux.getBegin() + " C˚";
            aux = aux.getNext();
        }
        return r;
    }

    public void addBegin(Integer p) {
        No<Integer> no = new No<>(p);
        if (isEmpty()) {
            begin = no;
        } else {
            no.setNext(this.begin);
            this.begin = no;
        }
    }

    public void addEnd(Integer p) {
        No<Integer> no = new No<>(p);
        if (isEmpty()) {
            begin = no;
        } else {
            this.topNode = this.begin;
            // recursividade direta para achar o no final
            this.topNode = findFinalNode(topNode);
            this.topNode.setNext(no);
        }
    }

    // Recursividade direta:
    // Aqui ira ocorrer uma chamada recursiva ao metodo que verifica se seu no dado
    // como parametro, tem seu ponteiro apontado para o nulo, que significa que se
    // estiver apontado para null este e o ultimo no, então, esse no e retornado;
    // caso nao for o ultimo no, o metodo recursivo ira chamar a si mesmo passando
    // como parametro o proximo no do no dado por parametro, percorrendo assim a
    // lista
    public No<Integer> findFinalNode(No<Integer> node) {
        if (node.getNext() != null) {
            return findFinalNode(node.getNext());
        }
        return node;
    }

    public void addAnywhere(Integer p, int pos) {
        No<Integer> no = new No<>(p);
        if (pos == 1) {
            addBegin(p);
        } else {
            No<Integer> aux = this.begin;
            int count = 1;
            // recursividade indireta:
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

    public Integer removeBegin() {
        tempetureInteger = null;
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty List");
        } else {
            tempetureInteger = begin.getBegin();
            this.begin = begin.getNext();
        }
        return tempetureInteger;
    }

    public Integer removeEnd() {
        Integer result = null;
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Empty list");
        } else {
            if (begin.getNext() == null) {
                result = begin.getBegin();
                begin = null;
            } else {
                this.topNode = begin;
                No<Integer> current = begin;

                // recursividade indireta
                // este metodo tambem serve para achar o ultimo no desta lista encadeada, porem,
                // ele tambem armazena o penultimo valor que ira auxiliar na hora de remover o
                // apontamento do ponteiro deste do ultimo e passara apontar para nulo
                // while (topNode.getNext() != null) {
                // current = topNode;
                // topNode = topNode.getNext();
                // }

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
    public No<Integer> findBeforeLast(No<Integer> node) {
        if (node.getNext().getNext() != null) {
            return findBeforeLast(node.getNext());
        }
        return node;
    }

    public Integer removeAnywhere(int pos) {
        Integer personRemoved = null;
        int i = 1;
        No<Integer> aux = begin;

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
                No<Integer> aux2 = aux;

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
