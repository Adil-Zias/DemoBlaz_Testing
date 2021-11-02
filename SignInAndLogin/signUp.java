package Auto_projects.com.DemoblazeVersionTwo.SignInAndLogin;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUp extends BaseClass {

    public void signUpWithValid() throws InterruptedException {
        setUp();

        WebElement loginButton = driver.findElement(By.cssSelector("#signin2"));
        loginButton.click();
        oneSecondWait();
        signup("kirakira", "5533553");
        String alertMassge = driver.switchTo().alert().getText();
        String signUpResult = alertMassge.equals("Sign up successful.") ? "Sign up successful." : "Sign up not successful.";
        System.out.println(signUpResult);

        ending();


    }

    public void signUpWithempty() throws InterruptedException {

        setUp();

        WebElement loginButton = driver.findElement(By.cssSelector("#signin2"));
        loginButton.click();
        oneSecondWait();
        login("", "");
        String alertMassge = driver.switchTo().alert().getText();
        String signUpEmptyResult = alertMassge.equals("Please fill out Username and Password.") ? "empty sign up test passed" :
                "empty sign up test not passed";
        System.out.println(signUpEmptyResult);

        ending();
    }
}
