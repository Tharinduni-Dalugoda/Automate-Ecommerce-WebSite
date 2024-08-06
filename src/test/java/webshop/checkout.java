package webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class checkout {
    WebDriver driver;
    @BeforeTest
    public void OpenFlicker() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void checkoutItem(){
        WebElement book = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a"));
        book.click();

        WebElement bookadd = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input"));
        bookadd.click();

        WebElement gopath = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
        gopath.click();

        WebElement checkItem = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input"));
        checkItem.click();

        WebElement agree = driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
        agree.click();

        WebElement checkBtn = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkBtn.click();

    }
}
