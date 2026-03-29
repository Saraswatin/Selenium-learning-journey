package Saraswathi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

        public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                Thread.sleep(3000);

                // ✅ 1. NAME LOCATOR — Username field
                WebElement username = driver.findElement(By.name("username"));
                username.sendKeys("Admin");
                System.out.println("1. NAME ✅ — Username typed: "
                                + username.getAttribute("value"));

                // ✅ 2. NAME LOCATOR — Password field
                WebElement password = driver.findElement(By.name("password"));
                password.sendKeys("admin123");
                System.out.println("2. NAME ✅ — Password typed!");

                // ✅ 3. CLASSNAME LOCATOR — Login button
                WebElement loginBtn = driver.findElement(
                                By.className("orangehrm-login-button"));
                loginBtn.click();
                System.out.println("3. CLASSNAME ✅ — Login button clicked!");
                Thread.sleep(4000);

                // ✅ 4. LINKTEXT LOCATOR — Admin menu
                WebElement adminLink = driver.findElement(By.linkText("Admin"));
                System.out.println("4. LINKTEXT ✅ — Link found: "
                                + adminLink.getText());
                adminLink.click();
                Thread.sleep(2000);

                // ✅ 5. PARTIALLINKTEXT LOCATOR — Leave menu
                WebElement leaveLink = driver.findElement(
                                By.partialLinkText("Leav"));
                System.out.println("5. PARTIALLINKTEXT ✅ — Partial match: "
                                + leaveLink.getText());
                leaveLink.click();
                Thread.sleep(2000);

                driver.quit();
                System.out.println("\n✅ All locators completed!");
        }
}
