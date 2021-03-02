package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
    public static void main(String[] args) {

        //Chrome code
        String chromeDriverPath= "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath); //need to set it (key , value), System is a class
        WebDriver driver= new ChromeDriver();   //Selenium webDriver is an interface-make a constructor to automate chrome
        driver.get("https://www.amazon.com/");  //get the url you want to automate

        //Firefox code
        String geckodriverPath= "BrowserDriver/windows/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",geckodriverPath);
        WebDriver driver1= new FirefoxDriver();
        driver1.get("https://www.amazon.com/"); // must have https

        //Edge code
        String edgeDriverPath= "BrowserDriver/windows/msedgedriver.exe";
        System.setProperty("webdriver.edge.driver",edgeDriverPath);
        WebDriver driver2= new EdgeDriver();
        driver2.get("https://www.amazon.com/");



    }
}
