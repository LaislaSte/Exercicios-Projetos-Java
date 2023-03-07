import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prefix {

    public static void main(String[] args) {
        Prefix test = new Prefix();

        String forTest[] = { "Flowerf", "Flowef", "Flowef" };

        String me = test.returnAprashe(forTest);
        System.out.println(me);

    }

    public String returnAprashe(String[] strg) {

        char strig[] = new char[strg.length];
        char coring = strg[0].charAt(0);

        for (int i = 0; i < strg.length; i++) {
            char oneLetterOfElement = strg[i].charAt(i);

            // if (oneLetterOfElement == coring) {
            // strig[i] = oneLetterOfElement;
            // } else {
            // break;
            // }

            char[] chars = {'T', 'e', 'c', 'h', 'i', 'e', ' ',
                        'D', 'e', 'l', 'i', 'g', 'h', 't'};
 
        StringBuilder sb = new StringBuilder();
        for (char ch: chars) {
            sb.append(ch);
        }
 
        String string = sb.toString();
        System.out.println(string);

            System.out.println(oneLetterOfElement);
            // F l o apenas

            // coring = strg[0].charAt(i + 1);
        }

        return "testanfo";
        // String result = new String(strig);
        // if (result.length() > 0) {
        // // System.out.println(result);
        // return result;
        // } else {
        // // System.out.println("There is no prefixes in commom");
        // return result;
        // }
    }

}

/**
 * receber um strings[]
 * percorrer o string[]
 * guardar a primeira letra do primeiro elemento num var
 * verificar a primeira letra dos elementos
 * sefor == então
 * loop continua
 * gurda a letra vigente numa lista
 * muda a var para gurdar o valor da segunda letra do primeiro elemento
 * sefor != então
 * encerra o loop
 * 
 * verifique se na lista de letras parecidas existe algo
 * sefor !null então
 * exiba as letras como uma string
 * sefor null então
 * exiba a mensagem "there is no prefixes in commom"
 */
