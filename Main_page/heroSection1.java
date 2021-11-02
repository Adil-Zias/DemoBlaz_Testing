package Auto_projects.com.DemoblazeVersionTwo.Main_page;

import Auto_projects.com.DemoblazeVersionTwo.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class heroSection1 extends BaseClass {
    public void imageSilde() throws InterruptedException {
        setUp();

        WebElement activeImage1 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src1 = activeImage1.getAttribute("src");
        System.out.println(src1);

        Thread.sleep(6000);

        WebElement activeImage2 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src2 = activeImage2.getAttribute("src");
        System.out.println(src2);

        Thread.sleep(6000);

        WebElement activeImage3 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src3 = activeImage3.getAttribute("src");
        System.out.println(src3);

        if (!Objects.equals(src1, src2) && !Objects.equals(src2, src3) && !Objects.equals(src1, src3)) {
            System.out.println("test passed");
        }

        ending();
    }
}
