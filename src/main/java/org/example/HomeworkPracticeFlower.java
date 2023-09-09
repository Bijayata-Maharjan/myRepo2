package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class HomeworkPracticeFlower {
    public static void main(String[] args) throws InterruptedException {
        //Add WebDriver Manager- dowload the chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();

        //go to the website
        driver.get("file:///C:/java/Selenium/sit.skyschooling/index.html");

        //first name
        driver.findElement(By.id("fname")).sendKeys("Bijayata");
        Thread.sleep(2000);

        // last name by id
        driver.findElement(By.id("lname")).sendKeys("Maharjan");
        Thread.sleep(2000);

        //phone number by id
        driver.findElement(By.id("pnumber")).sendKeys("667554");
        Thread.sleep(2000);

        //email by name
        driver.findElement(By.name("email")).sendKeys("mb12@gmail.com");
        Thread.sleep(2000);

        //address by class
        driver.findElement(By.className("adress")).sendKeys("123 Test Drive");
        Thread.sleep(2000);

        //image
        String s= driver.findElement(By.tagName("img")).getTagName();
        System.out.println("This tagName is" + s );
        Thread.sleep(2000);

        //to click on link
        driver.findElement(By.linkText("for help click here")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        //select and unselect yes
        driver.findElement(By.id("scales")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("scales")).click();
        Thread.sleep(2000);

        //select /unselect no
        driver.findElement(By.id("horns")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("horns")).click();
        Thread.sleep(2000);

        //selct radio button
        driver.findElement(By.xpath("//input[@value='Yes']")).click();
        Thread.sleep(2000);

        //select one from dropdown
        driver.findElement(By.xpath("//option[@value='valor3'][4]")).click();
        Thread.sleep(2000);

//        //Submit
//        driver.findElement(By.id("submited")).click();
//
//        //verify after submission
//        //verify after submit
//        String t= driver.findElement(By.id("success")).getText();
//        Thread.sleep(2000);
//       if(t.contains("submited"))
//           System.out.println("Pass");
//       else
//        System.out.println("Fail");

        //to submit
        driver.findElement(By.className("submit-btn")). click();

        //verify after submit
        String t= driver.findElement(By.id("success")).getText();
        Thread.sleep(2000);
        if(t.contains("Submited"))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        //to close website auto
        driver.close();








    }
    


}
