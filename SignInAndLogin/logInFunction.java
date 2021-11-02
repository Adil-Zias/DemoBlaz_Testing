package Auto_projects.com.DemoblazeVersionTwo.SignInAndLogin;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logInFunction extends BaseClass {
    public void Loginwithvalid() throws InterruptedException {
        setUp();

        WebElement loginButton = driver.findElement(By.cssSelector("#login2"));
        loginButton.click();
        oneSecondWait();
        login("adiladil", "123456");
        oneSecondWait();

        WebElement welcomeMassge = driver.findElement(By.cssSelector("#logout2"));
        String welcome = welcomeMassge.isEnabled() ? "your loged in successfully" : "log in not successfully";
        System.out.println(welcome);
        oneSecondWait();

        driver.quit();

    }

    public void loginWithInvalid() throws InterruptedException {

        setUp();

        WebElement loginButton = driver.findElement(By.cssSelector("#login2"));
        loginButton.click();
        oneSecondWait();
        login("55336628", "huh27845");
        oneSecondWait();

        String alertMassege = driver.switchTo().alert().getText();

        System.out.println(alertMassege);
        String alertRusult = alertMassege.equals("User does not exist.") ? "Invalid login test passed" : "Ivalid login test failed";
        System.out.println(alertRusult);

        ending();



    }

    public void loginCloseButton() throws InterruptedException {
        setUp();
        WebElement loginButton = driver.findElement(By.cssSelector("#login2"));
        loginButton.click();
        Thread.sleep(500);

        WebElement closrbutton = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-secondary"));
        closrbutton.click();
        oneSecondWait();

        String displayResult = closrbutton.isDisplayed() ? "login close button test passed" : "login close button test failed";
        System.out.println(displayResult);

        ending();

    }
}
