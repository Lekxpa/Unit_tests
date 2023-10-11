import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainTest {
    public static void main(String[] args) {
// Создание mock
        List mockedList = mock(List.class);
// Использование
        mockedList.add("one");
        mockedList.clear();
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
    @Test
    public void iteratorWillReturnHelloWorld(){


        // Arrange
        Iterator iteratorMock = mock(Iterator.class);
//        when(iteratorMock.next()).thenReturn("Hello", "World").thenReturn("Hello", "World");
        when(iteratorMock.next()).thenReturn("Hello", "World");
        String result = iteratorMock.next() + " " + iteratorMock.next();
        assertEquals("Hello World", result);
    }
}


