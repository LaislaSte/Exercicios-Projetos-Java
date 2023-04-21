package exercice.list2;


public class Temperature {
    /*
    * 12) Inicialize 3 temperaturas e apresente em console se alguma delas é negativa
    */
    public int a;
    public int b;
    public int c;
    public Temperature(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void compare() {
        if(a < 0){
            System.out.println("first temperature it's negative: "+a);
        }
        if (b < 0) {
            System.out.println("second temperature it's negative: "+b);
        }
        if(c < 0){
            System.out.println("third temperature it's negative: "+c);
        }
    }

    public static void main(String[] args){
        Temperature t = new Temperature(-12, 10, -3);
        t.compare();
    }
}
