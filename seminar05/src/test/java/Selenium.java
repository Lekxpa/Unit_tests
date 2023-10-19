
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import java.util.List;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class SeleniumTest {
//// Напишите автоматизированный тест, который выполнит следующие шаги:
//// 1. Открывает главную страницу Google.
//// 2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//// 3. В результатах поиска ищет ссылку на официальный сайт Selenium
//// (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
//// результатов поиска.
//
//    @Test
//    public <WebDriver> void checkBrowserTest() {
//// System.setProperty("webdriver.edge.driver", "C:/Users/Artur Kalimullin/IdeaProjects/Testing/msedgedriver.exe");
//        boolean a = false;
//        WebDriver driver = new EdgeDriver();
//        driver.get("http://www.google.com/");
//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("Selenium"); // как ввод в поисковую строку значения
//        searchBox.submit(); // как нажатие кнопки - поиск
//        List<WebElement> seleniumLink = driver.findElements(By.cssSelector("div"));// список
//        for (WebElement webElement : seleniumLink) {
//            if (webElement.getText().contains("https://www.selenium.dev")) {
//                a = true;
//                break;
//            }
//        }
//        assertTrue(a);
//        driver.quit();
//    }
//}