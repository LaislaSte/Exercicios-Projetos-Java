package exercicesED.list2;

public class Compare {
    public int a;
    public int b;
    public int c;

    public Compare(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void compare() {
        if(a > 1000 || a < 100){
            System.out.println("a it's in the range: "+a);
        }
        if (b > 1000 || b < 100) {
            System.out.println("b it's in the range: "+b);
        }
        if(c > 1000 || c < 100){
            System.out.println("c it's in the range: "+c);
        }
    }

    public static void main(String[] args){
        Compare c = new Compare(3, 200,1200);
        c.compare();
    }

    //Inicialize 3 variáveis de tipos de dados inteiros, compare se alguma delas
    // é maior do que 1000 ou menor do que 100. Exiba qual é a variável que está dentro do range.
}
