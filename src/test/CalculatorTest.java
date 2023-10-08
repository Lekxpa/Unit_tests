//Задание 1. ** В классе Calculator создайте метод calculateDiscount,
// который принимает сумму покупки и процент скидки и возвращает сумму
// с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
// Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать
// исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.


import org.assertj.core.api.Assertions;
import org.assertj.core.util.VisibleForTesting;
import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
//    public static void main(String[] args) {
//
//        Assertions.assertThat(Calculator.calculateDiscount(100, 5)).isEqualTo(95);
//
//        assertThatThrownBy(() -> Calculator.calculateDiscount(0, 5))
//                .isInstanceOf(ArithmeticException.class);
//        assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 5))
//                .isInstanceOf(ArithmeticException.class);
//        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -5))
//                .isInstanceOf(ArithmeticException.class);
//        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 105))
//                .isInstanceOf(ArithmeticException.class);
//
//
//// Проверка базового функционала с целыми числами:
////        if (8 != Calculator.calculation(2, 6, '+')) {
////            throw new AssertionError("Ошибка в методе");
////        }
////        if (0 != Calculator.calculation(2, 2, '-')) {
////            throw new AssertionError("Ошибка в методе");
////        }
////        if (14 != Calculator.calculation(2, 7, '*')) {
////            throw new AssertionError("Ошибка в методе");
////        }
////        if (2 != Calculator.calculation(100, 50, '/')) {
////            throw new AssertionError("Ошибка в методе");
////        }
//
////        assert 8 == Calculator.calculation(2, 6, '+');
////        assert 0 == Calculator.calculation(2, 2, '-');
////        assert 10 == Calculator.calculation(2, 7, '*');
////        assert 2 == Calculator.calculation(100, 50, '/');
//
//
//        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
//
//
//        assertThatThrownBy( () -> Calculator.calculation(8, 4, '_'))
//                .isInstanceOf(IllegalStateException.class);
//
//
//// Случаи с неправильными аргументами
//// аргумент operator типа char, должен вызывать  исключение, если он получает не базовые символы(+- * /)
////        try {
////            Calculator.calculation(8, 4, '_');
////        } catch (IllegalStateException e) {
////            if (!e.getMessage().equals("Unexpected value operator: _")) {
////                throw new AssertionError("Ошибка в методе");
////            }
////        }
//    }
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 6, '+')).isEqualTo(8);
    }
    @Test
    public void substractionExpression(){
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 2, '-')).isEqualTo(0);
    }

    @Test
    public void multiplicationExpression(){
        Calculator calculator = new Calculator();
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
    }

    @Test
    public void divisionExpression(){
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(100, 50, '/')).isEqualTo(2);
    }

    @Test
    public void expectedIllegalStateExceptionOnInvalidOperatorSymbol(){
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    public void getOperandCompletesCorrectlyWithNumbers() {
        String testedValue = "9"; // Значение для тестов
        ByteArrayInputStream in = new
                ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in; // Сохраняем ссылку на ввод с клавиатуры
        System.setIn(in); // Подменяем ввод
        Calculator.getOperand(); // Вызываем метод
        System.out.println(testedValue); // Для наглядности вывода
        System.setIn(inputStream); // Подменяем обратно
    }
    @Test
    public void getOperandCompletesCorrectlyWithNotNumbers() {
        String testedValue = "k";
        ByteArrayInputStream in = new
                ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));
        assertThatThrownBy(() -> Calculator.getOperand())
                .isInstanceOf(IllegalStateException.class).describedAs("Ошибка в вводимых данных");
                        System.setIn(inputStream);
        System.setOut(null);
    }
}