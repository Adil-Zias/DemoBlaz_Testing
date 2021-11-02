package Auto_projects.com.DemoblazeVersionTwo.SignInAndLogin;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUpFunction extends BaseClass {

    public void signupdisappears() throws InterruptedException {
        setUp();

        WebElement signinButton = driver.findElement(By.cssSelector("#signin2"));
        signinButton.click();
        oneSecondWait();

        WebElement nameBox = driver.findElement(By.cssSelector("#sign-username"));
        String nameBox_result = nameBox.isEnabled() ? "signin box is popped out" : "signin box is not popped out";
        System.out.println(nameBox_result);

        WebElement randomElement = driver.findElement(By.cssSelector("#logInModal"));
        randomElement.click();

        Thread.sleep(500);
        WebElement modalWindowAfterDisappear = driver.findElement(By.cssSelector("#logInModal > div > div"));
        String dispappear_result = modalWindowAfterDisappear.isDisplayed() ? "Test passed" : "test is not passed";
        System.out.println(dispappear_result);
        ending();

    }


    public void signupCloseButton() throws InterruptedException {

        setUp();

        WebElement signinButton = driver.findElement(By.cssSelector("#signin2"));
        signinButton.click();
        Thread.sleep(500);

        WebElement closrbutton = driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-secondary"));
        closrbutton.click();
        Thread.sleep(1000);
        String signUpCloseResult = closrbutton.isDisplayed() ? "sign up close button test passed" : "sign up close button test not passed";
        System.out.println(signUpCloseResult);

        ending();
    }
}
