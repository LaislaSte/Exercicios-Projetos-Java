package exercicesED.list11;

import javax.swing.JOptionPane;

public class Execute {
    public static void main(String[] args) {
        ListAluno lp = new ListAluno();
        Aluno person = null;
        int pos;

        int option = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Choose a options: \n" + //
                        " 1 - add a person at the end \n" + //
                        " 2 - add a person at the beginning \n" + //
                        " 3 - remove a person at the end \n" + //
                        " 4 - remove a person at the beginning \n" + //
                        " 5 - list \n" + //
                        " 0 - quit"));

        while (option != 0) {
            switch (option) {
                case 1:
                    person = new Aluno(Integer.parseInt(JOptionPane.showInputDialog(null, "ID")),
                            JOptionPane.showInputDialog(null, "NOME"), JOptionPane.showInputDialog(null, "CURSO"));
                    lp.addEnd(person);
                    break;
                case 2:
                    person = new Aluno(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "ID")),
                            JOptionPane.showInputDialog(null, "NOME"),
                            JOptionPane.showInputDialog(null, "CURSO"));
                    lp.addBegin(person);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Removed item: " + lp.removeEnd());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Removed item: " + lp.removeBegin());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Items: " + lp.list());
                    break;
                default:
                    throw new Error("invalid option", null);
            }

            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Choose a options: \n" + //
                            " 1 - add a person at the end \n" + //
                            " 2 - add a person at the beginning \n" + //
                            " 3 - remove a person at the end \n" + //
                            " 4 - remove a person at the beginning \n" + //
                            " 5 - list \n" + //
                            " 0 - quit"));
        }

    }
}
