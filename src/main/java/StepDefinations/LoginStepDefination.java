//package StepDefinations;
//
//import java.sql.Driver;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.FindBy;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefination {
//
//	public static WebDriver driver;
//
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_login_page() {
//	    //System.setProperty("webbdriver.Chrome.driver", "C:/Users/TiaaUser/Documents/chromedriver_win32 (3)/chromedriver.exe");
//		//WebDriver driver=new ChromeDriver();
//		ChromeOptions chromeOptions = new ChromeOptions();
//
//		//chromeOptions.setBrowserVersion(browserVersion);
//		driver=new ChromeDriver(chromeOptions);
//		//driver=new EdgeDriver();
//	    driver.get("https://classic.crmpro.com/");
//	}
//	@When("^title of login page is free CRM$")
//	public void title_of_login_page_is_free_crm() {
//	  String titile=  driver.getTitle();
//	  System.out.println(titile );
//		  Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.", titile);
//	}
//	@Then("^user enters \"(.*)\" and \\\"(.*)\\\"$")
//	public void user_enters_username_and_password(String un,String pwd) {
//	
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
//	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
//	  
//	}
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	 WebElement login=  driver.findElement(By.xpath("//input[@type='submit']"));
//	 JavascriptExecutor js= (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", login);
//	}
//	@Then("^verify user is on Home page$")
//	public void verify_user_is_on_home_page() {
//	 String hometitile=  driver.getTitle();
//	 System.out.println(hometitile);
//	 Assert.assertEquals("CRMPRO", hometitile);
//	
//	}
//
//
//
//
//}
