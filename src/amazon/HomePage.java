package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver; //Create a ref. variable on top of the class--> can use it on all bellow methods
    String amazonUrl = "https://www.amazon.com/";
    String productName = "Flower";
    String searchBoxLocator = "twotabsearchtextbox";
    String searchBoxButton = "nav-search-submit-button";


    /**
     * This method will set up our connection to the driver, open and maximize the browser window
     * and navigate to the page by the path
     */
    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    //Action Method
    public void checkSearchBox() {
        //step1- Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        //step2- Click on search button
        driver.findElement(By.id(searchBoxButton)).click();
    }

    public void selectYourAddressLink() {
        driver.findElement(By.id("glow-ingress-line2")).click();
    }

    public void selectYourAddressLink2() {
        driver.findElement(By.id("glow-ingress-line2")).click();
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdateInput\"]")).sendKeys("92602");
        driver.findElement(By.xpath("//*[@id=\"GLUXZipUpdate\"]/span/input")).click();
//        driver.findElement(By.xpath("//*[@id=\"a-popover-3\"]/div/div[2]/span/span/span/button")).click();
    }

    public void checkLogo() {
        driver.findElement(By.id("nav-logo-sprites")).click();
    }

    public void checkAllDropDown() {
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
    }

    public void changeLanguage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"icp-btn-save\"]/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
        Thread.sleep(1000);
//         driver.findElement(By.xpath("//*[@id=\"icp-btn-save\"]/span/input")).click();

    }

    public void checkBestSellersLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"zg_left_col1\"]/div[2]/div[2]/div/div[2]/a/div[2]")).click();
    }

    public void checkTodayDealLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
    }

    public void checkNewReleaseLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
    }

    public void checkBooksLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
    }

    public void checkBooksLink2() {
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.id(searchBoxLocator)).sendKeys("coding interview");
        driver.findElement(By.id(searchBoxButton)).click();
    }

    public void checkFashionLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"sobe_d_b_4_1\"]/a")).click();
    }

    public void checkKindleBook() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
    }

    public void giftCardsLink() {
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[33]")).click();  //???? disappear ???
        driver.findElement(By.id(searchBoxLocator)).sendKeys("Amazon gift cards");
        driver.findElement(By.id(searchBoxButton)).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/h2/a/span")).click();
    }

    @Test
    public void checkFindAGiftLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
        driver.findElement(By.xpath("//*[@id=\"notification-provider\"]/div/div/div[2]/h2")).click();
    }

    @Test
    public void checkToysAndGamesLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[11]")).click();
        driver.findElement(By.id(searchBoxLocator)).sendKeys("cards against humanity");
        driver.findElement(By.id(searchBoxButton)).click();
//        driver.findElement(By.xpath("//*[@id=\"carousel_584292\"]/h2/span")).click();
    }

    public void checkAmazonHome() {
        driver.findElement(By.linkText("Amazon Home")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[1]/span")).click();
        driver.findElement(By.id(searchBoxLocator)).sendKeys("Modern office desk");
        driver.findElement(By.id(searchBoxButton)).click();
    }

    public void GiftCardsLink2() {
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[33]")).click();
        driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[2]/a/span/span[2]")).click();  //???? disappear ???
    }

    public void checkPrimeLink() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span[1]")).click();
    }

    public void checkCustomerService() {
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
    }

    public void checkPharmacy() {
        driver.findElement(By.linkText("Pharmacy")).click();
        driver.findElement(By.xpath("//*[@id=\"usState-availability-check\"]/option[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"lookup-eligible-button\"]/button")).click();
    }

    public void checkComputers() {
        driver.findElement(By.xpath("//*[@id=\"gw-card-layout\"]/hr[1]")).click();
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[3]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[4]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[7]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[8]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[9]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[1]/span")).click();
    }

    public void checkSellLink() {
        driver.findElement(By.xpath("//*[@id=\"gw-card-layout\"]/hr[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[15]")).click();
        driver.findElement(By.xpath("//*[@id=\"rp_cta_n\"]/div/a")).click();
    }


//                  ****************** Hamburger Menu *****************

    public void checkPrime() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/i")).click();
    }

    public void checkPrimVideo() throws InterruptedException {
        checkPrime();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a")).click();
        driver.findElement(By.id(searchBoxLocator)).sendKeys("Coming 2 America");
        Thread.sleep(1000);
        driver.findElement(By.id(searchBoxButton)).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"dv-action-box\"]/div/div/div/div[2]/div/div/span/span/a")).click();
//        driver.navigate().back();
    }

    public void checkPrimVideo2() throws InterruptedException {
        checkPrime();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/ul[1]/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/ul[1]/li[4]/ul/div/div[1]/div/ul/li[2]/a")).click();
    }

    public void checkPrimVideo3() throws InterruptedException {
        checkPrime();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"aiv-cl-main-middle\"]/div/div[3]/div/div[3]/div/div[1]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"aiv-cl-main-middle\"]/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"aiv-cl-main-middle\"]/div/div[3]/div/div[1]/div/div[1]/div[1]/div[2]/a")).click();
    }

    public void checkAmazonMusic() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[3]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"dmusicLandingButton\"]/span/a")).click();
    }


    public void checkEchoAndAlexa() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[4]/li[3]/a")).click();
    }

    public void checkFireTablets() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[10]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[3]/a")).click();
    }

    public void checkFireTv() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[6]/li[3]/a")).click();

    }

    public void checkKindleEReaders() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[7]/li[3]/a")).click();
    }

    public void checkAudibleBooks() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[13]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[3]/a")).click();
    }

    public void checkAppstoreForAndroid() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[14]/a/i")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")).click();
        driver.findElement(By.id(searchBoxLocator)).sendKeys("NBC");
        Thread.sleep(1000);
        driver.findElement(By.id(searchBoxButton)).click();
    }


//    ********************* Footer **************************

    public void checkCareersLink() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
    }

    @Test
    public void checkCareersLink2() throws InterruptedException {
        checkCareersLink();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[1]/div/div/div/div/form/div[1]/div[1]/div/span/input")).sendKeys("Software Development Engineer in Test");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[1]/div/div/div/div/form/div[1]/div[2]/div/span/input")).sendKeys("Southern California");
        driver.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
        Thread.sleep(5000);
    }

    public void checkBlogLink(){
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click();
    }




    @AfterMethod
    public void tearDown () throws InterruptedException {
//        driver.close();  //close one window
        Thread.sleep(5000);  //Wait purpose
        driver.quit();  //close all open ones - better to use this
    }

}



//driver.navigate().back();
