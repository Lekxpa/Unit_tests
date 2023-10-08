public class Main {
    public static void main (String[] args) {
        System.out.println(evenOddNumber(4));
        System.out.println(evenOddNumber(5));
        System.out.println(numberInInterval(15));
        System.out.println(numberInInterval(55));
        System.out.println(numberInInterval(105));
    }
        // HW 3.1. Нужно покрыть тестами метод на 100%
        // Метод проверяет, является ли целое число записанное в переменную n,
    // чётным (true) либо нечётным (false).

    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число
    // в интервал (25;100) и возвращает true, если попадает и false - если нет,
        // покрыть тестами метод на 100%
    public static boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}