import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTest {

    @Test
    public void evenNumberTest() {
        int num = 4;

        assertTrue(Main.evenOddNumber(num));
    }

    @Test
    public void oddNumberTest() {
        int num = 5;

        assertFalse(Main.evenOddNumber(num));
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число
    // в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    @Test
    public void numberLessIntervalTest() {
        assertFalse(Main.numberInInterval(5));
    }

    @Test
    public void numberMoreIntervalTest() {
        assertFalse(Main.numberInInterval(105));
    }

    @Test
    public void numberInIntervalTest() {
        assertTrue(Main.numberInInterval(55));
    }
}
