package Saraswathi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class TestScript2 {
    public static void main(String[] args)
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();

        //locating gmail hypertext/link
        WebElement gmail = driver.findElement(By.linkText("Gmail"));

        //click on gmail link

        gmail.click();
    }
}
