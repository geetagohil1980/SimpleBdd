//package StepDefinitions;
//
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//public class Register {
//WebDriver driver;
//
//    @Given("^User able to Open Browser$")
//    public void user_able_to_Open_Browser()  {
//        WebDriverManager.chromedriver ().setup ();
//        driver=new ChromeDriver ();
//        driver.manage ().window ().maximize ();;
//    }
//
//    @Then("^Enter URL$")
//    public void enter_URL()  {
//driver.get ( "https://demo.nopcommerce.com/ " );
//    }
//
//    @When("^User click on register link$")
//    public void user_click_on_register_link(){
//        driver.findElement ( By.className ( "ico-register" ) ).click ();
//
//    }
//
//
//    @Then("^User is on register page and  verify  register  page title$")
//    public void user_is_on_register_page_and_verify_register_page_title()  {
//String title = driver.getTitle ();
//System.out.println (title);
//Assert.assertEquals ( "nopCommerce demo store.Register",title );
//    }
//
//    @Then("^user able to click on gender and select gender$")
//    public void user_able_to_click_on_gender_and_select_gender()  {
//driver.findElement ( By.id ( "gender-female" ) ).click ();
//    }
//
//    @Then("^user Enter \"([^\"]*)\" and  \"([^\"]*)\"$")
//    public void user_Enter_and(String arg1, String arg2)  {
//driver.findElement ( By.id ( "FirstName" ) ).sendKeys ( "Geeta" );
//driver.findElement ( By.id ( "LastName" ) ).sendKeys ( "Gohil" );
//    }
//
//
//    @Then("^user Enter valid \"([^\"]*)\"$")
//    public void user_Enter_valid(String arg1) {
//driver.findElement ( By.id ( "Email" ) ).sendKeys ( "sid123@yahoo.com" );
//    }
//
//    @Then("^user click on newsletter link$")
//    public void user_click_on_newsletter_link() {
//driver.findElement ( By.xpath ( "//*[@id=\"Newsletter\"]" ) ).click ();
//    }
//
//    @Then("^user enters  \"([^\"]*)\"$")
//    public void user_enter(String arg1) {
//driver.findElement ( By.id ( "Password" ) ).sendKeys ( "Ab123@" );
//    }
//
//    @Then("^USER Click on  register  link$")
//    public void user_Click_on_register_link() {
//driver.findElement ( By.id ( "ConfirmPassword" ) ).sendKeys ( "Ab123@" );
//    }
//
//    @Then("^user close browser$")
//    public void user_close_browser()  {
//        driver.close ();
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
