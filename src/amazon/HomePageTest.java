package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage{

    //Test case 1- Verify the page title
    @Test  //(priority = 1)
    public void testPageTitle(){
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Page title does not match");
    }

    //Test case 2- Verify Amazon Logo
    @Test
    public void testAmazonLogoLink(){
        checkLogo();
        String expectResult = "";
        String actualResult = driver.findElement(By.id("nav-logo-sprites")).getText();
        Assert.assertEquals(actualResult, expectResult, "Test Fail");
    }

    //Test case 3- Verify "Select your address" Link functionality as expected
    @Test
    public void testSelectYourAddressLink(){
        selectYourAddressLink();
        String expectedText="Choose your location";
        String actualText=driver.findElement(By.id("a-popover-header-3")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 4- Verify drop down menu functionality as expected
    @Test
    public void testAllDropDown(){
        checkAllDropDown();
        String expectedResult="All Departments";
        String actualResult= driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[1]")).getText();
        Assert.assertEquals(expectedResult,actualResult,"Test Fail");
    }

    // Test case 5- Verify that the search box functionality as expected
    // Enter a valid product name and click on the search icon. It should show the result with the given product name.
    @Test  //(priority = 2)
    public void testCheckSearchBox(){
        checkSearchBox();
        String expectedText="\"Flower\"";
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail-product does not match");
    }

   //Test Case 6- Verify language setting drop down works as expected
    @Test
    public void testLanguageSetting() throws InterruptedException {
        changeLanguage();
        String expectedText= "Language Settings";
        String actualText= driver.findElement(By.xpath("//*[@id=\"lop-heading\"]")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test case 7- Verify BestSellers Link functionality as expected
    @Test
    public void testBestSellersLink(){
        checkBestSellersLink();
        String expectedResult = "Best Sellers in Gift Cards";
        String actualResult= driver.findElement(By.id("zg_banner_text_wrapper")).getText();
        Assert.assertEquals(expectedResult, expectedResult, "Page title does not match");
    }

    //Test case 8- Verify today's Deal Link functionality as expected
    @Test
    public void testTodayDealLink(){
        checkTodayDealLink();
        String expectedText="Today's Deals";
        String actualText=driver.findElement(By.linkText("Today's Deals")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 9- Verify Prime Link functionality as expected
    @Test
    public void testPrimeLink(){
        checkPrimeLink();
        String expectedText="Prime";
        String actualText=driver.findElement(By.xpath("//*[@id=\"prime-top-nav\"]/span[1]/a")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 10- Verify Customer Service Link functionality as expected
    @Test
    public void testCustomerServiceLink(){
        checkCustomerService();
        String expectedText="Hello. What can we help you with?";
        String actualText=driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 11- Verify NewRelease Link functionality as expected
    @Test
    public void testNewReleaseLink(){
        checkNewReleaseLink();
        String expectedText="Amazon Hot New Releases";
        String actualText=driver.findElement(By.id("zg_banner_text_wrapper")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 12- Verify Books Link functionality as expected
    @Test
    public void testBooksLink(){
        checkBooksLink();
        String expectedText="Shop by Category";
        String actualText=driver.findElement(By.className("a-size-large")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    @Test
    public void testBooksLink2(){
        checkBooksLink2();
        String expectResult = "Cracking the Coding Interview: 189 Programming Questions and Solutions";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).getText();
        Assert.assertEquals(actualResult, expectResult, "Test Fail");
    }

    //Test case 13- Verify Fashion Link functionality as expected
    @Test
    public void testFashionLink(){
        checkFashionLink();
        String expectedText="WOMEN'S CLOTHING";
        String actualText=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[1]/div/h1/span")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 14- Verify Kindle Books Link functionality as expected
    @Test
    public void testKindleBooksLink() {
        checkKindleBook();
        String expectedText="Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText, expectedText,"Test Fail");
    }

    //Test case 15- Verify Gift Cards Link functionality as expected
    @Test
    public void testGiftCardsLink(){    //challenge
        giftCardsLink();
        String expectedText="Amazon.com eGift Card";
        String actualText=driver.findElement(By.id("gc-asin-title")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test case 16- Verify Find A Gift Link functionality as expected
    @Test
    public void testFindAGiftLink(){
        checkFindAGiftLink();
        String expectedText="Gifts for Everyone";
        String actualText=driver.findElement(By.xpath("//*[@id=\"notification-provider\"]/div/div/div[2]/h2")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 17- Verify Toys Games Link functionality as expected
    @Test
    public void testToysGamesLink(){
        checkToysAndGamesLink();
        String expectedText="\"cards against humanity\"";
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test case 18- Verify Amazon Home Link functionality as expected
    @Test
    public void testAmazonHomeLink(){
        checkAmazonHome();
        String expectedText="\"Modern office desk\"";
        String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail");
    }

    //Test case 19- Verify "Amazon Pharmacy" Link functionality as expected
    @Test
    public void testPharmacyLink(){
        checkPharmacy();
        String expectedText="Sign-In";
        String actualText=driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test case 20- Verify Computers Link functionality as expected
    @Test
    public void testComputersLink() throws InterruptedException {
        checkComputers();
        String expectedText="Computers & Accessories | Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 21- Verify "Sell" Link functionality as expected
    @Test
    public void testSellLink(){
        checkSellLink();
        String expectedText="Get started selling on Amazon";
        String actualText=driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }



// ******************************* Test Cases For Hamburger Menu **************************


    //Test Case 22- Navigate to Prime Video -->  1-1-  Prime Video
    @Test
    public void testPrimeVideoPV() throws InterruptedException {
        checkPrimVideo();
        String expectedText= "Watch Coming 2 America | Prime Video";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 23- Navigate to Prime Video -->  1-2-  Included with Prime "check categories"
    @Test
    public void testPrimeVideoPV2() throws InterruptedException {
        checkPrimVideo2();
        String expectedText= "Amazon Originals";
        String actualText= driver.findElement(By.xpath("//*[@id=\"aiv-cl-main-middle\"]/div/div[3]/div/div[1]/div/div[1]/div[1]/div[2]/h2")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 24- Navigate to Amazon Music -->  2-1-  Amazon Music Unlimited
    @Test
    public void testAmazonMusic() throws InterruptedException {
        checkAmazonMusic();
        String expectedText= "Sign-In";
        String actualText= driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 25- Navigate to Echo & Alexa --> Echo Show 5
    @Test
    public void testEchoAndAlexa() throws InterruptedException {
        checkEchoAndAlexa();
        String expectedText= "Echo Show 5 -- Smart display with Alexa – stay connected with video calling - Charcoal";
        String actualText= driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 25- Navigate to Fire Tablets --> Fire 7
    @Test
    public void testFireTablets() throws InterruptedException {
        checkFireTablets();
        String expectedText= "Amazon.com: Fire 7 tablet (7\" display, 16 GB) - Black: Kindle Store";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 26- Navigate to Fire TV --> Fire TV Stick Lite
    @Test
    public void testFireTv() throws InterruptedException {
        checkFireTv();
        String expectedText= "Fire TV Stick Lite with Alexa Voice Remote Lite (no TV controls) | HD streaming device | 2020 release";
        String actualText= driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 27- Navigate to Kindle E-readers & Books --> Kindle Kids Edition
    @Test
    public void testKindleEReaders() throws InterruptedException {
        checkKindleEReaders();
        String expectedText= "Kindle Kids Edition, a Kindle designed for kids, with parental controls - Rainbow Birds Cover";
        String actualText= driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 28- Navigate to Audible Books & Originals -->
    @Test
    public void testAudibleBooks() throws InterruptedException {
        checkAudibleBooks();
        String expectedText= "Audible Membership Plans - Compare | Amazon.com";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 29- Navigate to Appstore for Android --> NBC
    @Test
    public void testAppstoreForAndroid() throws InterruptedException {
        checkAppstoreForAndroid();
        String expectedText= "Amazon.com : NBC";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }



// ********************************* Test Cases For Footer ***********************************


    //Test Case 30- Navigate to "Careers" Link
    @Test
    public void testCareersLink() throws InterruptedException {
        checkCareersLink();
        String expectedText= "Find jobs";
        String actualText= driver.findElement(By.xpath("//*[@id=\"home-search\"]/h1")).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }


    //Test Case 31- Navigate to "Careers" Link
    @Test
    public void testCareersLink2() throws InterruptedException {
        checkCareersLink2();
        String expectedText= "Job search | Amazon.jobs";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }

    //Test Case 32- Navigate to "Blog" Link
    @Test
    public void testBlogLink() throws InterruptedException {
        checkBlogLink();
        String expectedText= "About Amazon";
        String actualText= driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }





}




















//    @Test
//    public void testSelectYourAddressLink2(){  //???
//        selectYourAddressLink2();
//        String expectedText="92602";
//        String actualText=driver.findElement(By.xpath("//*[@id=\"GLUXZipConfirmationValue\"]")).getText();
//        Assert.assertEquals(actualText,expectedText,"Test fail");
//    }


//    @Test
//    public void testPrimeVideoPV3() throws InterruptedException {
//        checkPrimVideo3();
//        String expectedText= "Movies - HBO";
//        String actualText= driver.findElement(By.xpath("//*[@id=\"av-search\"]/section/div/div[1]/span")).getText();
//        Assert.assertEquals(actualText,expectedText,"Test Fail");
//
//    }
