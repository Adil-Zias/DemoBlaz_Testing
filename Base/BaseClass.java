package Auto_projects.com.DemoblazeVersionTwo.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {

    String URL = "https://www.demoblaze.com/index.html";
    String chromePath = "C:\\Users\\alxe8\\Downloads\\chromedriver.exe";
    public WebDriver driver;

    By userNameLocator = By.cssSelector("#loginusername");
    By passwprdLocator = By.cssSelector("#loginpassword");
    By loginButtonLocator = By.cssSelector("button[onclick='logIn()']");

    By signupNamelocator = By.cssSelector("#sign-username");
    By signuppasswordlocator = By.cssSelector("#sign-password");
    By signupButtonlocator = By.cssSelector("button[onclick='register()']");



    public void setUp(){
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    public void ending() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
    public void oneSecondWait() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void login(String username, String password) throws InterruptedException {
        WebElement userNameBox = driver.findElement(userNameLocator);
        WebElement passWordBox = driver.findElement(passwprdLocator);
        WebElement loginBut = driver.findElement(loginButtonLocator);

        userNameBox.sendKeys(username);
        passWordBox.sendKeys(password);
        loginBut.click();

        Thread.sleep(500);
    }
    public void signup(String userName, String Password) throws InterruptedException {
        WebElement signUpNamebox = driver.findElement(signupNamelocator);
        WebElement signUpPasswordbox = driver.findElement(signuppasswordlocator);
        WebElement signUpButtonbox = driver.findElement(signupButtonlocator);
        signUpNamebox.sendKeys(userName);
        signUpPasswordbox.sendKeys(Password);
        signUpButtonbox.click();
        Thread.sleep(1000);

    }

}
