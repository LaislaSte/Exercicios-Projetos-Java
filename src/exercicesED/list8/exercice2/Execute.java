package exercicesED.list8.exercice2;

import javax.swing.JOptionPane;

public class Execute {

    public static void main(String[] args) {

        ListTempeture lista = new ListTempeture();
        int element = 0;
        int pos;
        int option = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Choose a options: \n" + //
                        " 1 - add a tempeture at the end \n" + //
                        " 2 - add a tempeture at the beginning \n" + //
                        " 3 - add a tempeture at the anywhere \n" + //
                        " 4 - remove a tempeture at the end \n" + //
                        " 5 - remove a tempeture at the beginning \n" + //
                        " 6 - remove a tempeture from anywhere \n" + //
                        " 7 - list \n" + //
                        " 0 - quit"));

        while (option != 0) {
            switch (option) {
                case 1:
                    element = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a tempeture"));
                    lista.addEnd(element);
                    break;
                case 2:
                    element = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a tempeture"));
                    lista.addBegin(element);
                    break;
                case 3:
                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a position"));
                    element = Integer.parseInt(JOptionPane.showInputDialog(null, "Write a tempeture"));
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
                            " 1 - add a tempeture at the end \n" + //
                            " 2 - add a tempeture at the beginning \n" + //
                            " 3 - add a tempeture at the anywhere \n" + //
                            " 4 - remove a tempeture at the end \n" + //
                            " 5 - remove a tempeture at the beginning \n" + //
                            " 6 - remove a tempeture from anywhere \n" + //
                            " 7 - list \n" + //
                            " 0 - quit"));
        }
    }
}
