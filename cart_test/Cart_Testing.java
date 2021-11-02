package Auto_projects.com.DemoblazeVersionTwo.cart_test;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_Testing extends BaseClass {
    public void shoppingCartLoead() throws InterruptedException {
        setUp();

        oneSecondWait();
        WebElement first_item = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > a > img"));
        first_item.click();
        oneSecondWait();


        WebElement addCartButton = driver.findElement(By.cssSelector("a[onclick='addToCart(1)']"));
        addCartButton.click();
        oneSecondWait();
        driver.switchTo().alert().accept();
        oneSecondWait();


        WebElement cartButton = driver.findElement(By.cssSelector("#cartur"));
        cartButton.click();
        Thread.sleep(2000);


        WebElement trElement = driver.findElement(By.cssSelector("tbody>tr"));
        String result = trElement.isDisplayed() ? "Test passed" : "test failed";
        System.out.println(result);

        ending();
    }
}
