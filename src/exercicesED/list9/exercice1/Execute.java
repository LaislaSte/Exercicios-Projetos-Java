package exercicesED.list9.exercice1;

import javax.swing.JOptionPane;

public class Execute {
    public static void main(String[] args) {

        ListaLivro lista = new ListaLivro();
        Livro element;
        int pos;
        String name;
        int option = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Choose a options: \n" + //
                        " 1 - add a book at the end \n" + //
                        " 2 - add a book at the beginning \n" + //
                        " 3 - add a book at the anywhere \n" + //
                        " 4 - remove a book at the end \n" + //
                        " 5 - remove a book at the beginning \n" + //
                        " 6 - remove a book from anywhere \n" + //
                        " 7 - remove a book by title \n" + //
                        " 8 - bubble sort \n" + //
                        " 9 - list \n" + //
                        " 0 - quit"));

        while (option != 0) {
            switch (option) {
                case 1:
                    element = new Livro(
                            JOptionPane.showInputDialog(null, "TITULO"),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTIDADE")));
                    lista.addEnd(element);
                    break;
                case 2:
                    element = new Livro(
                            JOptionPane.showInputDialog(null, "TITULO"),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTIDADE")));
                    lista.addBegin(element);
                    break;
                case 3:
                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a position"));
                    element = new Livro(
                            JOptionPane.showInputDialog(null, "TITULO"),
                            Integer.parseInt(JOptionPane.showInputDialog(null, "QUANTIDADE")));
                    lista.addAnywhere(element, pos);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Removed item: " + lista.removeEnd());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Removed item: " + lista.removeBegin());
                    break;
                case 6:
                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a position"));
                    JOptionPane.showMessageDialog(null, "Removed item: " + lista.removeAnywhere(pos));
                    break;
                case 7:
                    name = JOptionPane.showInputDialog(null, "Choose a title to remove");
                    JOptionPane.showMessageDialog(null, "Removed: " + lista.removeByTitle(name));
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Order Array list: " + lista.bubbleSortInterativo());
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Lista: " + lista.list());
                    break;
                default:
                    throw new Error("invalid option", null);
            }

            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Choose a options: \n" + //
                            " 1 - add a book at the end \n" + //
                            " 2 - add a book at the beginning \n" + //
                            " 3 - add a book at the anywhere \n" + //
                            " 4 - remove a book at the end \n" + //
                            " 5 - remove a book at the beginning \n" + //
                            " 6 - remove a book from anywhere \n" + //
                            " 7 - remove a book by name \n" + //
                            " 8 - bubble sort \n" + //
                            " 9 - list \n" + //
                            " 0 - quit"));
        }
    }

}
