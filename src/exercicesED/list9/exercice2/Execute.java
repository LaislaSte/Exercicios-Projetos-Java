package exercicesED.list9.exercice2;

import javax.swing.JOptionPane;

public class Execute {
    public static void main(String[] args) {

        ListaDuplaAlunos lista = new ListaDuplaAlunos();
        Aluno element;
        int pos;
        int option = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Choose a options: \n" + //
                        " 1 - add a book at the end \n" + //
                        " 2 - add a book at the beginning \n" + //
                        " 3 - add a book at the anywhere \n" + //
                        " 4 - remove a book at the end \n" + //
                        " 5 - remove a book at the beginning \n" + //
                        " 6 - remove a book from anywhere \n" + //
                        " 7 - list \n" + //
                        " 0 - quit"));

        while (option != 0) {
            switch (option) {
                case 1:
                    element = new Aluno(
                            JOptionPane.showInputDialog(null, "ID"),
                            JOptionPane.showInputDialog(null, "NOME"),
                            JOptionPane.showInputDialog(null, "CURSO"));
                    lista.addEnd(element);
                    break;
                case 2:
                    element = new Aluno(
                            JOptionPane.showInputDialog(null, "ID"),
                            JOptionPane.showInputDialog(null, "NOME"),
                            JOptionPane.showInputDialog(null, "CURSO"));
                    lista.addBegin(element);
                    break;
                case 3:
                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a position"));
                    element = new Aluno(
                            JOptionPane.showInputDialog(null, "ID"),
                            JOptionPane.showInputDialog(null, "NOME"),
                            JOptionPane.showInputDialog(null, "CURSO"));
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
                            " 7 - list \n" + //
                            " 0 - quit"));
        }
    }
}
