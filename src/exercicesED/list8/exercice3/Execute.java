package exercicesED.list8.exercice3;

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
                        " 3 - add a person at the anywhere \n" + //
                        " 4 - remove a person at the end \n" + //
                        " 5 - remove a person at the beginning \n" + //
                        " 6 - remove a person at the anywhere \n" + //
                        " 7 - list \n" + //
                        " 0 - quit"));

        while (option != 0) {
            switch (option) {
                case 1:
                    person = new Aluno(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "ID")),
                            JOptionPane.showInputDialog(null, "NOME"),
                            JOptionPane.showInputDialog(null, "TURMA"),
                            JOptionPane.showInputDialog(null, "SEMESTRE"));
                    lp.addEnd(person);
                    break;
                case 2:
                    person = new Aluno(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "ID")),
                            JOptionPane.showInputDialog(null, "NOME"),
                            JOptionPane.showInputDialog(null, "TURMA"),
                            JOptionPane.showInputDialog(null, "SEMESTRE"));
                    lp.addBegin(person);
                    break;
                case 3:
                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a position"));
                    person = new Aluno(
                            Integer.parseInt(JOptionPane.showInputDialog(null, "ID")),
                            JOptionPane.showInputDialog(null, "NOME"),
                            JOptionPane.showInputDialog(null, "TURMA"),
                            JOptionPane.showInputDialog(null, "SEMESTRE"));
                    lp.addAnywhere(person, pos);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Removed item: " + lp.removeEnd());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Removed item: " + lp.removeBegin());
                    break;
                case 6:
                    pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a position"));
                    JOptionPane.showMessageDialog(null, "Removed item: " + lp.removeAnywhere(pos));
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Removed item: " + lp.list());
                    break;
                default:
                    throw new Error("invalid option", null);
            }

            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Choose a options: \n" + //
                            " 1 - add a person at the end \n" + //
                            " 2 - add a person at the beginning \n" + //
                            " 3 - add a person at the anywhere \n" + //
                            " 4 - remove a person at the end \n" + //
                            " 5 - remove a person at the beginning \n" + //
                            " 6 - remove a person at the anywhere \n" + //
                            " 7 - list \n" + //
                            " 0 - quit"));
        }

    }
}
