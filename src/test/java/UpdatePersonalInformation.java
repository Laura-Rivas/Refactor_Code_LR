import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void adasd() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Authentication.Authentication("laucari84@hotmail.com","123456");
        String updateMessage= Personalnformation.UpdatePersonalInformation("Laura","Rivas","laucari84@hotmail.com","123456","admin123456","admin123456");
        /*Se valida el mensaje del sistema luego de guardar los cambios*/
        assertEquals(PersonalInformationPage.updateMessage, updateMessage);
    }
}
