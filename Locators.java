package Saraswathi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // 1. NAME LOCATOR — Username field
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("username")));
        username.sendKeys("Admin");
        System.out.println("1. NAME  — Username typed: "
                + username.getAttribute("value"));

        //  2. NAME LOCATOR — Password field
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.name("password")));
        password.sendKeys("admin123");
        System.out.println("2. NAME  — Password typed!");

        //  3. CLASSNAME LOCATOR — Login button
        WebElement loginBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.className("orangehrm-login-button")));
        loginBtn.click();
        System.out.println("3. CLASSNAME  — Login button clicked!");
        Thread.sleep(3000);

        //  4. LINKTEXT LOCATOR
        // After login → Dashboard page has "Admin" link in top menu
        WebElement adminLink = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.linkText("Admin")));
        System.out.println("4. LINKTEXT  — Link found: "
                + adminLink.getText());
        adminLink.click();
        Thread.sleep(2000);

        // 5. PARTIALLINKTEXT LOCATOR
        // "PIM" menu → pass partial text "PI"
        WebElement pimLink = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.partialLinkText("PI")));
        System.out.println("5. PARTIALLINKTEXT  — Partial match: "
                + pimLink.getText());
        pimLink.click();
        Thread.sleep(2000);

        driver.quit();
        System.out.println("\n All locators completed!");
    }
}
