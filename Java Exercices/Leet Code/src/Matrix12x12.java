import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix12x12 {
    public int matriz[][] = new int[12][12];

    public static void main(String[] args) {
        Matrix12x12 m = new Matrix12x12();
        m.doThis();
    }

    public void doThis() {

        for (int i = 0; i < 12; i++) {
            for (int a = 0; a < 12; a++) {
                double doubleRandomNumber = Math.random() * 100;
                int randomNumber = (int) doubleRandomNumber;
                matriz[i][a] = randomNumber;
            }
        }

        Integer lessThan18[] = {};
        Integer between18and59[] = {};
        Integer greaterThan59[] = {};
        // create a new ArrayList
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(lessThan18));
        List<Integer> arrlist2 = new ArrayList<Integer>(Arrays.asList(between18and59));
        List<Integer> arrlist3 = new ArrayList<Integer>(Arrays.asList(greaterThan59));

        for (int i = 0; i < 12; i++) {
            for (int a = 0; a < 12; a++) {
                if (matriz[i][a] < 18) {
                    // Add the new element
                    arrlist.add(matriz[i][a]);
                } else if (matriz[i][a] > 18 && matriz[i][a] < 59) {
                    arrlist2.add(matriz[i][a]);
                } else if (matriz[i][a] > 59) {
                    arrlist3.add(matriz[i][a]);
                }
            }
        }

        // Convert the Arraylist to array
        lessThan18 = arrlist.toArray(lessThan18);
        between18and59 = arrlist2.toArray(between18and59);
        greaterThan59 = arrlist3.toArray(greaterThan59);
        System.out.println("Menores q 18 => " + lessThan18.length);
        System.out.println("Entre 18 e 59 => " + between18and59.length);
        System.out.println("Maiores que 59 => " + greaterThan59.length);

    }
}
