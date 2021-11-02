package Auto_projects.com.DemoblazeVersionTwo.Main_page;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aboutUs extends BaseClass {
    public void aboutUsLink() throws InterruptedException {
        setUp();


        WebElement aboutButton = driver.findElement(By.cssSelector("a[data-target='#videoModal']"));
        WebElement playBUtton = driver.findElement(By.cssSelector("div.vjs-poster"));
        aboutButton.click();
        oneSecondWait();
        playBUtton.click();
        Thread.sleep(2000);

        String result = playBUtton.isEnabled() ? "main page aboutUs button is enable" : "main page aboutUs button is not enable";
        System.out.println(result);
        WebElement sloseButton = driver.findElement(By.cssSelector("#videoModal > div > div > div.modal-footer > button"));
        sloseButton.click();

        ending();


    }
}
