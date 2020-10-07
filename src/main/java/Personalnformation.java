import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class Personalnformation {

    public static String UpdatePersonalInformation(String firstname,String lastname, String email,String oldpass, String pass, String confirmation)
    {
        WebDriver driver = getChromeDriver();
        /*Se accede a la vista 'My personal information' realizando clic en la tarjeta*/
        driver.get(PersonalInformationPage.url);
        /*Se actualizan los datos personales del usuario*/
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("old_passwd")).sendKeys(oldpass);
        driver.findElement(By.id("passwd")).sendKeys(pass);
        driver.findElement(By.id("confirmation")).sendKeys(confirmation);
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.cssSelector(".button-medium:nth-child(1) > span")).click();
        driver.findElement(By.cssSelector(".columns-container")).click();
        return driver.findElement(By.cssSelector(".alert")).getText();
    }
}
