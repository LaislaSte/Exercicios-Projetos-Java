package exercicesED.list9.exercice1;

import javax.swing.JOptionPane;
import exercicesED.util;

// Lista simplesmente encadeada com metodos recursivos add e remove anywhere 
public class ListaLivro {

    private No<Livro> begin;
    private No<Livro> topNode;
    private Livro livro;
    private int count;

    public boolean isEmpty() {
        if (this.begin == null) {
            return true;
        } else {
            return false;
        }
    }

    public String list() {
        No<Livro> aux = begin;
        String r = " ";
        r = recursiveList(r, aux);
        r += "\n" + findFinalNode(aux).getBegin();
        return r;
    }

    private String recursiveList(String str, No<Livro> aux) {
        if (aux.getNext() != null) {
            return recursiveList(str + "\n" + aux.getBegin(), aux.getNext());
        }
        return str;
    }

    public No<Livro> findFinalNode(No<Livro> node) {
        if (node.getNext() != null) {
            return findFinalNode(node.getNext());
        }
        return node;
    }

    public void addEnd(Livro p) {
        No<Livro> no = new No<>(p);
        if (isEmpty()) {
            this.begin = no;
        } else {
            this.topNode = this.begin;
            this.topNode = findFinalNode(topNode);
            this.topNode.setNext(no);
        }
    }

    public void addBegin(Livro p) {
        No<Livro> no = new No<>(p);
        if (isEmpty()) {
            begin = no;
        } else {
            no.setNext(this.begin);
            this.begin = no;
        }
    }

    public void addAnywhere(Livro p, int pos) {
        No<Livro> no = new No<>(p);
        if (pos == 1) {
            addBegin(p);
        } else {
            No<Livro> aux = this.begin;
            this.count = 1;
            findFinalNode(aux);
            int i = getSize(aux, 0);
            aux = recursiveAddAnywhere(aux, pos, i);
            if (count == pos - 1) {
                no.setNext(aux.getNext());
                aux.setNext(no);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid position");
            }

        }
    }

    private No<Livro> recursiveAddAnywhere(No<Livro> aux, int pos, int i) {
        if (count < i) {
            if (count < pos - 1) {
                this.count++;
                return recursiveAddAnywhere(aux.getNext(), pos, i);
            }
        }
        return aux;
    }

    public Livro removeBegin() {
        livro = null;
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty List");
        } else {
            livro = begin.getBegin();
            this.begin = begin.getNext();
        }
        return livro;
    }

    public Livro removeEnd() {
        Livro result = null;
        if (begin == null) {
            JOptionPane.showMessageDialog(null, "Empty list");
        } else {
            if (begin.getNext() == null) {
                result = begin.getBegin();
                begin = null;
            } else {

                No<Livro> current = findBeforeLast(begin, begin);
                result = current.getNext().getBegin();
                current.setNext(null);

            }
        }
        return result;
    }

    public No<Livro> findBeforeLast(No<Livro> node, No<Livro> aux) {
        if (node.getNext() != null) {
            return findBeforeLast(node.getNext(), node);
        }
        return aux;
    }

    public Livro removeAnywhere(int pos) {
        Livro livroRemoved = null;
        // int i = 1;
        No<Livro> aux = begin;
        int i = getSize(aux, 0);
        System.out.println(i);

        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty List");
        } else {

            if (pos == 1) {
                // livroRemoved = removeBegin();
                return removeBegin();
            } else {
                // para setar pegar o indice final
                // this.i = 1;

                // se pos for maior que o tamanho da lista ou menor que zero, isso é uma posicao
                // invalida
                if (pos > i || pos <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Position!");

                    // verifica se a posicao já nao é a ultima, se for, chame remover do final
                } else if (pos == i) {
                    livroRemoved = removeEnd();

                } else {
                    // se nao for nenhuma das opcoes, ache a posicao do incice indicado e substitua
                    // pelo proximo no
                    // No<Livro> aux2 = aux;
                    this.count = 0;
                    findFinalNode(aux);
                    System.out.println(aux);
                    No<Livro> aux2 = recursiveRemoveAnywhere(aux, pos, aux, i);

                    // livroRemoved = aux.getBegin();
                    // aux2.setNext(aux.getNext());

                    livroRemoved = aux2.getNext().getBegin();
                    aux2.setNext(aux2.getNext().getNext());

                }
            }

        }
        return livroRemoved;
    }

    private No<Livro> recursiveRemoveAnywhere(No<Livro> aux, int pos, No<Livro> aux2, int i) {
        if (count < i) {
            if (count < pos - 1) {
                this.count++;
                aux2 = aux;
                return recursiveRemoveAnywhere(aux.getNext(), pos, aux2, i);
            }
        }
        return aux2;
    }

    // Its not removing by the name
    // it just remove at the beggining
    public Livro removeByTitle(String name) {
        Livro productRemoved = null;
        No<Livro> aux = begin;
        No<Livro> aux2 = begin;
        this.topNode = begin;

        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty List!");
            return productRemoved;
        } else {

            aux = recursiveRemoveByTitle(aux2, name);
            aux2 = topNode;

            productRemoved = aux.getBegin();

            if (!aux.getBegin().getTitulo().equals(name)) {
                JOptionPane.showMessageDialog(null, "Not Found!");
                productRemoved = null;
                return productRemoved;
            } else if (productRemoved == begin.getBegin()) {
                return removeBegin();
            } else if (aux.getBegin().getTitulo().equals(name)) {
                aux2.setNext(aux.getNext());
                return productRemoved;
            } else {
                return productRemoved;
            }

        }
    }

    private No<Livro> recursiveRemoveByTitle(No<Livro> node, String title) {
        if (node.getNext() != null) {
            if (node.getBegin().getTitulo().equals(title)) {
                return node;
            } else {
                this.topNode = node;
                return recursiveRemoveByTitle(node.getNext(), title);
            }
        }
        return node;
    }

    // BUBBLE SORT METHOD
    // this method does not make sense

    // public class BubbleSort {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // public static void main(String[] args) {
    // String[] arr = {"banana", "apple", "cherry", "date"};

    // System.out.println("Unsorted Array:");
    // for (String s : arr) {
    // System.out.print(s + " ");
    // }

    // bubbleSort(arr);

    // System.out.println("\nSorted Array:");
    // for (String s : arr) {
    // System.out.print(s + " ");
    // }
    // }
    // }

    public String bubbleSortInterativo() {
        int tam = 0;
        int ind = 0;
        tam = getSize(begin, tam);
        System.out.println(tam);
        Livro[] arrLivro = new Livro[tam];
        arrLivro = convNoVetor(arrLivro, tam, ind, begin);

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (arrLivro[i].compareTo(arrLivro[j]) > 0) {
                    Livro aux = arrLivro[i];
                    arrLivro[i] = arrLivro[j];
                    arrLivro[j] = aux;
                }
            }
        }

        String s = " ";
        s = listArrBubble(s, arrLivro, tam, 0);
        s += "\n" + arrLivro[tam - 1];
        return s;
    }

    private int getSize(No<Livro> node, int i) {
        if (node.getNext() != null) {
            i += 1;
            return getSize(node.getNext(), i);
        }
        return i;
    }

    private Livro[] convNoVetor(Livro[] arrLiv, int tam, int i, No<Livro> node) {
        // if (node.getNext() != null && i < tam) {
        // if (node.getNext() != null) {
        if (i < tam) {
            arrLiv[i] = node.getBegin();
            i++;
            return convNoVetor(arrLiv, tam, i, node.getNext());
            // }
        }
        return arrLiv;
    }

    private String listArrBubble(String str, Livro[] arrLivros, int tam, int i) {
        if (i < tam) {
            str += "\n" + arrLivros[i];
            i++;
            return listArrBubble(str, arrLivros, tam, i);
        }
        return str;
    }

}