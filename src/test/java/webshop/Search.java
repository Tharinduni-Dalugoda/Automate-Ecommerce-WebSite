package webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search {
    WebDriver driver;

    @BeforeTest
    public void OpenFlicker() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void ser(){
        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        searchBar.sendKeys("laptop");

        WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
        searchBtn.click();
    }
}
