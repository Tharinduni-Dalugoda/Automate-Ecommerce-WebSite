package webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCart {
    WebDriver driver;

    @BeforeTest
    public void OpenFlicker() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void addcart() throws InterruptedException {
        WebElement computers = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
        computers.click();

        WebElement notebook = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img"));
        notebook.click();

        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
        Select select = new Select(dropdown);
        select.selectByIndex(3);

        WebElement addcart = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input"));
        addcart.click();



    }
}
