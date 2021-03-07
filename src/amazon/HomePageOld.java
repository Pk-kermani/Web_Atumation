package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageOld {
    public static void main(String[] args) throws InterruptedException {
//        More dynamic by defining variable
        String productName= "mask";
        String searchBoxLocator= "twotabsearchtextbox";
        String searchBoxButton = "nav-search-submit-button";

//        //Firefox code
//        String geckodriverPath= "BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",geckodriverPath);
//        WebDriver driver1= new FirefoxDriver();
//        driver1.get("https://www.amazon.com/"); // must have https
//
//        //Edge code
//        String edgeDriverPath= "BrowserDriver/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver",edgeDriverPath);
//        WebDriver driver2= new EdgeDriver();
//        driver2.get("https://www.amazon.com/");

        //Chrome code
        String amazonUrl= "https://www.amazon.com/";
        String chromeDriverPath= "BrowserDriver/windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",chromeDriverPath); //need to set it (key , value), System is a class
        WebDriver driver= new ChromeDriver();   //Selenium webDriver is an interface-make a constructor to automate chrome
        driver.get(amazonUrl);  //get the url you want to automate
        driver.manage().window().maximize();    //make full screen .maximize()
//        driver.manage().deleteAllCookies();   //delete all cookies on browser

//        LOCATORS TO IDENTIFY: ----------Main Part is to Locate a Value--------
//        1-Try to automate by using -id- and must be unique inorder to use it

//        .findElement(By.id()).sendKeys()  --> NOT .findElements()
//        .sendKeys()- For enter value
//        .click()- To check clickable
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mask");


        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(searchBoxButton)).click();                   //1- id
//        driver.findElement(By.name("")).click();                            //2- name
//        driver.findElement(By.className("")).click();                       //3- className
//        driver.findElement(By.tagName("")).click();                         //4- tagName
//        driver.findElement(By.linkText("")).click();                        //5- linkText
//        driver.findElement(By.partialLinkText("")).click();                 //6- partialLinkText
//        driver.findElement(By.cssSelector("")).click();                     //7- cssSelector
//        driver.findElement(By.xpath("")).click();                           //8- xpath


        Thread.sleep(5000); //Wait purpose
        driver.close();




    }
}
