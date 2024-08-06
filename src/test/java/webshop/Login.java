package webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
    WebDriver driver;

    @BeforeTest
    public void OpenFlicker() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void Login(){

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

        WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        inputEmail.sendKeys("tharindunilakshani.9887@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        inputPassword.sendKeys("123456");

        WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        loginBtn.click();
    }
}
