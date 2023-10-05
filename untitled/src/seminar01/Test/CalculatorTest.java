package seminar01.Test;

//Задание 1. ** В классе Calculator создайте метод calculateDiscount,
// который принимает сумму покупки и процент скидки и возвращает сумму
// с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать
// исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.


import org.assertj.core.api.Assertions;
import seminar01.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        Assertions.assertThat(Calculator.calculateDiscount(100, 5)).isEqualTo(95);

        assertThatThrownBy( () -> Calculator.calculateDiscount(0, 5))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(-100, 5))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(100, -5))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(100, 105))
                .isInstanceOf(ArithmeticException.class);




// Проверка базового функционала с целыми числами:
//        if (8 != Calculator.calculation(2, 6, '+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (0 != Calculator.calculation(2, 2, '-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (14 != Calculator.calculation(2, 7, '*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (2 != Calculator.calculation(100, 50, '/')) {
//            throw new AssertionError("Ошибка в методе");
//        }

//        assert 8 == Calculator.calculation(2, 6, '+');
//        assert 0 == Calculator.calculation(2, 2, '-');
//        assert 10 == Calculator.calculation(2, 7, '*');
//        assert 2 == Calculator.calculation(100, 50, '/');


        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);


        assertThatThrownBy( () -> Calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);


// Случаи с неправильными аргументами
// аргумент operator типа char, должен вызывать  исключение, если он получает не базовые символы(+- * /)
//        try {
//            Calculator.calculation(8, 4, '_');
//        } catch (IllegalStateException e) {
//            if (!e.getMessage().equals("Unexpected value operator: _")) {
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
    }
}
