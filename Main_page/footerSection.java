package Auto_projects.com.DemoblazeVersionTwo.Main_page;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerSection extends BaseClass {
    public void footer1() throws InterruptedException {
        setUp();

        WebElement footer = driver.findElement(By.cssSelector("#footc"));
        WebElement aboutUsinFoot = driver.findElement(By.cssSelector("h4.grrrr"));
        boolean displayed = footer.isDisplayed();
        boolean aboutUsDisplay = aboutUsinFoot.isDisplayed();

        if (displayed && aboutUsDisplay){
            System.out.println("it did");
        }else{
            System.out.println("not display");
        }
        oneSecondWait();
        WebElement item1 = driver.findElement(By.cssSelector("img[src='imgs/galaxy_s6.jpg']"));
        item1.click();
        if (displayed && aboutUsDisplay){
            System.out.println("product page footer is here");
        }else{
            System.out.println("pruduct page footer is not here");
        }

        ending();


    }
}
