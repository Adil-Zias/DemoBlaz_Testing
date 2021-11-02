package Auto_projects.com.DemoblazeVersionTwo.Main_page;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class categoreSection extends BaseClass {
    public void categoreVisible() throws InterruptedException {
        setUp();

        List<WebElement> cateList = driver.findElements(By.cssSelector("div.list-group"));
        for (WebElement webElement : cateList) {
            System.out.println("cate section is visible");
            System.out.println(webElement.getText());
        }

        List<WebElement> container = driver.findElements(By.cssSelector("#tbodyid>div>div>a"));
        Thread.sleep(3000);
        String phoneResult = container.size() == 7 ? "phone Test passed" : "phone test is failed";
        System.out.println(phoneResult);


        WebElement moniterButton = driver.findElement(By.cssSelector("a[onclick=\"byCat('monitor')\"]"));
        moniterButton.click();
        Thread.sleep(3000);

        String result = container.size() == 2 ? "monitor test passed" : "monitor test failed";
        System.out.println(result);


        WebElement laptopButton = driver.findElement(By.cssSelector("a[onclick=\"byCat('notebook')\"]"));
        laptopButton.click();
        Thread.sleep(3000);
        String laptopResult = container.size() == 6 ? "laptop test passed" : "laptop test failed";
        System.out.println(laptopResult);



        ending();


        }





    }

