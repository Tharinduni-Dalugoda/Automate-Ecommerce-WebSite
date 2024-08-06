package webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register {
    WebDriver driver;

    @BeforeTest
    public void OpenFlicker() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }


        @Test
        public void register() throws InterruptedException {
            WebElement logo = driver.findElement(By.linkText("Register"));
            logo.click();

            WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
            gender.click();

            WebElement firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
            firstName.sendKeys("Tharinduni");

            WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
            lastName.sendKeys("Dalugoda");

            WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
            email.sendKeys("tharindunilakshani.9887@gmail.com");

            WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
            password.sendKeys("123456");

            WebElement passwordComfirm = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
            passwordComfirm.sendKeys("123456");

            String expectedPassword = driver.findElement(By.xpath("//*[@id=\"Password\"]")).getText();
            String actualPassword = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).getText();

            if(expectedPassword.equals(actualPassword)){
                System.out.println("these are same");
                WebElement registerBtn = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
                registerBtn.click();

            }else{
                System.out.println("It is not match");
            }
//            Assert.assertEquals(passwordComfirm,password, "miss match");

            driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
        }

//
    }

