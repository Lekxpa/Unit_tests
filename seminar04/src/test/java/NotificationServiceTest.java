//import org.junit.Test;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

public class NotificationServiceTest {
    /*
    Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String
recipient), который отправляет сообщение получателю.
Вам необходимо проверить правильность работы класса NotificationService, который использует
MessageService для отправки уведомлений.

     */

    @Test
    public void messageDelinateTest(){
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);

        String stringMessage = "String message";
        notificationService.sendNotification(stringMessage, "String recipient");

        verify(messageServiceMock, times(1)).sendMessage("String message", "String recipient");

    }
}
