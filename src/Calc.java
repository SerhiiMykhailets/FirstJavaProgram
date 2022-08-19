public class Calc {


    static void checkCommission(boolean isMarried, boolean isStudent, int age) {
        if (isMarried && isStudent && age > 21) {
            System.out.println("Поздравляем, вы получили скидку 30% !");
        } else if (!isMarried && isStudent && age > 21) {
            System.out.println("Отлично! Вы получили скидку 20%");
        } else if (!isMarried && !isStudent && age > 21) {
            System.out.println("Неплохо, у вас скидка 10%");
        } else {
            System.out.println("Попробуйте в следубщий раз");
        }
    }

    public static void main(String[] args) {
        checkCommission(true, true, 22);
        checkCommission(false, true, 22);
        checkCommission(false, false, 22);
        checkCommission(false, true, 18);
    }
}




