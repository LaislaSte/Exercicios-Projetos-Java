package exercicesED.list2;

import javax.swing.JOptionPane;

public class ChangeVariable {
    public int a;
    public int b;
    public ChangeVariable(int a, int b) {
        this.a = a^b;
        this.b = b^this.a;
        this.a = this.a^this.b;

    }

    @Override
    public String toString() {
        return "ChangeVariable{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args){
        ChangeVariable cv = new ChangeVariable(2, 4);
        JOptionPane.showMessageDialog(null, cv.toString());
    }
}
