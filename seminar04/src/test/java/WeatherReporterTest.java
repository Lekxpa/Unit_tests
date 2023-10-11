import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherReporterTest {
    /*
    Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
обращающийся к внешнему API для получения информации о текущей температуре.
Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
Создайте мок-объект для WeatherService с использованием Mockito.

     */
    @Test
    public void weatherReporterClass() {
        WeatherService weatherServiceMock = mock(WeatherService.class);

        int temperature = 22 + new Random().nextInt(9);
//        when(weatherServiceMock.getCurrentTemperature()).thenReturn(26);
        when(weatherServiceMock.getCurrentTemperature()).thenReturn(temperature);

        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);
        assertThat(weatherReporter.generateReport())
                .isEqualTo("Текущая температура: " + temperature + " градусов.");
    }
}
