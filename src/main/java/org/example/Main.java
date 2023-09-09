package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Add WebDriverManager - download chromedriver exe file
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();

        //go to website
        driver.get("file:///C:/java/webpage/Index.html");

        driver.findElement( By.id("fname")).sendKeys("Joe"); //to find web element we use driver.findElement
        Thread.sleep(2000); //to pause the running website for 2 seconds use thread.sleep

        driver.findElement( By.id("lname")).sendKeys("West");
        Thread.sleep(2000);

        driver.findElement( By.id("pnumber")).sendKeys("12345");
        Thread.sleep(2000);

        driver.findElement( By.name("email")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);

        //to find by className
        //driver.findElement( By.className("adress")).sendKeys("123 Test Drive");

        // to find the same thing with Xpath
        driver.findElement( By.xpath("//input[@class='adress']")).sendKeys("123 Test Drive");
        Thread.sleep(2000);

        //to print image (not available in this project)
       // String s = driver.findElement(By.tagName("img")).getTagName();
       // System.out.println("This tag name is" + s);

        //to select yes and then unselect
        driver.findElement(By.id("scales")).click();
        driver.findElement(By.id("scales")).click();
        Thread.sleep(2000);

        //to select no and then unselect
        driver.findElement(By.id("horns")).click();
        driver.findElement(By.id("horns")).click();
        Thread.sleep(2000);

        //radio button (did you want to start Selenium?) //use Xpath coz there is no unique locators like class or id
        driver.findElement(By.xpath("//input[@value='Yes']")).click();
        Thread.sleep(2000);


        //dropdown
        driver.findElement(By.cssSelector("select")).click();
        driver.findElement(By.xpath("//option[@value='valor3'][4]")).click();
        Thread.sleep(2000);

        driver.findElement( By.linkText("Click here to visit USA")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        String text = driver.findElement( By.tagName("a")).getText();
        System.out.println("Text is" + text);
        Thread.sleep(2000);

        driver.findElement( By.partialLinkText("Bangladesh")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        //to submit
        driver.findElement(By.className("submit-btn")). click();

        //verify after submit
        String t= driver.findElement(By.id("success")).getText();
        Thread.sleep(2000);
        if(t.contains("Submited"))
            System.out.println("Passed");
        else
            System.out.println("Failed");


        //close website automatically
        driver.close();







        //By.id()
        //By.name()
        //By.tagName()
        //By.className()
        //By.linkText()
        //By.partialLinkText()


    }
}