public class Calc2 {

static void calc2(double number1, double number2, char operation) {
    switch (operation) {
        case '+' -> System.out.println(number1 + number2);
        case '-' -> System.out.println(number1 - number2);
        case '*' -> System.out.println(number1 * number2);
        case '/' -> System.out.println(number1 / number2);
    }
}

        public static void main(String[] args) {
        calc2(3, 4, '-' );
        calc2(6, 2, '+' );
}
}
