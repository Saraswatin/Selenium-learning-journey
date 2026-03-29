package Saraswathi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript4 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(5000);

        driver.findElement(By.name("firstname")).sendKeys("Saraswathi");
    }
}
