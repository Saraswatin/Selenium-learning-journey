package Saraswathi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement mail = driver.findElement(By.className("gb_Z"));

        Actions act = new Actions(driver);

        act.moveToElement(mail).perform();
    }
}
