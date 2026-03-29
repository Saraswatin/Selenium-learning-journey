package Saraswathi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testscript5 {
    public static void main(String[] args) {

        // Launch the browser
        ChromeDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("https://jqueryui.com/droppable/");

        // Maximize the browser
        driver.manage().window().maximize();

        // locate the frame and switch to it
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);

        // Locate the element and perform the drag and drop action
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        // perform tha drag and drop
        Actions act = new Actions(driver);
        act.dragAndDrop(draggable, droppable).build().perform();

    }

}
