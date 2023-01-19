import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
    public static void main(String[] args) {
        //определение пути до драйвера и его настройка
        System.setProperty("Webdriver.chrome.driver", "C:\\Stepik\\Auto\\chromedriver");
        //создание экземпляра драйвера
        WebDriver driver = new ChromeDriver();
        //открываем страницу.
        driver.get("http://u920152e.beget.tech/");
        //находим элемент Логин.
        WebElement input1 = driver.findElement(By.xpath("//input[contains(@name, 'auth_email') and @required]"));
        input1.sendKeys("epihove@gmail.com");
        //находим элемент Пароль.
        WebElement input2 = driver.findElement(By.xpath("//input[contains(@name, 'auth_pass') and @required]"));
        input2.sendKeys("1234567890");
        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        //закрываем браузер.
        driver.quit();
    }
}