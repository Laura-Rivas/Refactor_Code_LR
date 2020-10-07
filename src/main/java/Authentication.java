import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class Authentication {


        public static void Authentication (String email, String password)
        {
            /*Se inicia sesión en la aplicación con email y password*/
            WebDriver driver = getChromeDriver();
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("passwd")).sendKeys(password);
            driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        }
}
