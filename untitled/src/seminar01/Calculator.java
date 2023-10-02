package seminar01;

import java.sql.SQLOutput;

//Задание 1. ** В классе Calculator создайте метод calculateDiscount,
// который принимает сумму покупки и процент скидки и возвращает сумму
// с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать
// исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

public class Calculator {

    public static void main(String[] args) {
//        System.out.printf("результат операции: %s\n", calculation(2, 2, '+'));
//        System.out.printf("результат операции: %s\n", calculation(4, 2, '-'));
//        System.out.printf("результат операции: %s\n", calculation(3, 2, '*'));
//        System.out.printf("результат операции: %s\n", calculation(8, 2, '/'));
        calculateDiscount(0, 5);
    }

    public static int calculation(int firstOperand, int
            secondOperand, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double calculateDiscount(double purchaseSum, double discount) {
        if (purchaseSum <= 0)
            throw new ArithmeticException("Сумма покупки должна быть больше 0");
        if (discount < 0 || discount >= 100)
            throw new ArithmeticException("Сумма скидки должна быть между 0 и 100");
        double result = purchaseSum - (purchaseSum * discount / 100);
        return result;
    }
}