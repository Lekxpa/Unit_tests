import java.util.List;

import static org.mockito.Mockito.*;
public class Mockito {
    public static void main(String[] args) {
// Создание mock
        List mockedList = mock(List.class);
// Использование
        mockedList.add("one");
        mockedList.clear();
    }
}

