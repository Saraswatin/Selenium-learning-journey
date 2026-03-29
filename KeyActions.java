package Saraswathi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class KeyActions {
    public static void main(String[] args) {

        // Launch the browser
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        // Maximize the browser
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.name("q"));

      //  search.sendKeys("SeleniuM");

        Actions act = new Actions(driver);

        act.moveToElement(search).keyDown(Keys.SHIFT).sendKeys("codenest").keyUp(Keys.SHIFT).sendKeys(".com").build()
                .perform();

    }
}