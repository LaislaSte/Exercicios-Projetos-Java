package methods;

public class Calculator {
        public Double sum(Double num1, Double num2) {
            return num1 + num2;
        }
        public Double sub(Double num1, Double num2) {
            return num1 - num2;
        }
        public Double div(Double num1, Double num2) {
            return num1 / num2;
        }
        public Double mult(Double num1, Double num2) {
            return num1 * num2;
        }
        public int fat(int num){
            int result = 1;
            for (int i = 1; i <= num; i++){
                result *= i;
            }
            return result;
        }
}
