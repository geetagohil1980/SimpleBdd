package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NopRegister {

WebDriver driver;
    @Given("^user able to open browser$")
    public void user_able_to_open_browser() {
        WebDriverManager.chromedriver ().setup ();
       driver=new ChromeDriver ();
        driver.manage ().window ().maximize ();;}


    @Given("^enter url$")
    public void enter_url() {
        driver.get ( "https://demo.nopcommerce.com/ " );

    }

    @When("^user click on register link$")
    public void user_click_on_register_link() {
        driver.findElement ( By.className ( "ico-register" ) ).click ();
    }

    @Then("^close browser$")
    public void close_browser() throws InterruptedException {
        Thread.sleep ( 2000 );
        driver.close ();
    }


    @Then("^VERIFY register page title$")
    public void verify_register_page_title()  {
     String TITLE = driver.getTitle ();
     System.out.println (TITLE);
        Assert.assertEquals ( "nopCommerce demo store. Register",TITLE );
    }

    @Then("^click on gender$")
    public void click_on_gender()  {
        driver.findElement ( By.id ( "gender-female" ) ).click ();

    }

    @Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_and(String FIRSTNAME, String LASTNAME ){
        driver.findElement ( By.id ( "FirstName" ) ).sendKeys ( FIRSTNAME );
driver.findElement ( By.id ( "LastName" ) ).sendKeys ( LASTNAME );
    }


    @Then("^select \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void select(String birthday, String birthmonth, String birthyear) throws InterruptedException {
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]" ) ).sendKeys ( birthday );
driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]" ) ).sendKeys (birthmonth);
driver.findElement ( By.xpath ( "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]" ) ).sendKeys ( birthyear );
    }


    @Then("^USER ENTER valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void user_ENTER_valid(String EMAIL, String PASSWORD, String CONFIRMPASSWORD) throws InterruptedException {
        Thread.sleep ( 2000 );
driver.findElement ( By.id ( "Email" ) ).sendKeys ( EMAIL );
        driver.findElement ( By.id ( "Password" ) ).sendKeys (PASSWORD );
        driver.findElement ( By.id ( "ConfirmPassword" ) ).sendKeys ( CONFIRMPASSWORD );}

    @Then("^click on register button$")
    public void click_on_register_button() {
        driver.findElement ( By.xpath("//*[@id=\"register-button\"]")).click() ;

    }


}
