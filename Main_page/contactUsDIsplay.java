package Auto_projects.com.DemoblazeVersionTwo.Main_page;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactUsDIsplay extends BaseClass {
    public void contactpopUp() throws InterruptedException {
        setUp();

        WebElement contatButton = driver.findElement(By.cssSelector("a[data-target='#exampleModal']"));
        contatButton.click();
        Thread.sleep(500);
        WebElement eamilBox = driver.findElement(By.cssSelector("#recipient-email"));
        WebElement nameBox = driver.findElement(By.cssSelector("#recipient-name"));
        WebElement messageBox = driver.findElement(By.cssSelector("#message-text"));
        boolean displayed = eamilBox.isDisplayed();
        boolean namedisplayed = nameBox.isDisplayed();
        boolean messagedisplayed = messageBox.isDisplayed();
        if(displayed && namedisplayed && messagedisplayed){
            System.out.println("passed");
        }else{
            System.out.println("no go");
        }

        ending();
    }
}
