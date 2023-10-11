import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DataProcessorTest {
    @BeforeEach
    void setUp() {
    }

    /*
    Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
Условие: У вас есть класс Database с методом public List<String> query(String sql), который выполняет SQLзапрос и возвращает результат.
Вам необходимо проверить правильность работы класса DataProcessor, который использует Database для
выполнения запроса и обработки результатов.
     */

    @Test
    public void dataProcessorClassTest(){
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);

        List<String> expectedResult = new ArrayList<>(Arrays.asList("res1", "res2"));

        String query = "SELECT * FROM mytable";

        when(database.query(query)).thenReturn(expectedResult);

        List<String> actualResult = dataProcessor.processData(query);

        verify(database).query(query);

        assertEquals(actualResult, expectedResult);
    }
}
