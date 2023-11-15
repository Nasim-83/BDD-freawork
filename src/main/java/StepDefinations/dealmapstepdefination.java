//package StepDefinations;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
////data table with maps for parameterization of test cases
//public class dealmapstepdefination {
//	WebDriver driver1;
//	@Given("User is already on Login Page")
//	
//	public void user_is_already_on_login_page() {
//	   
//		driver1=new ChromeDriver();
//	    driver1.get("https://classic.crmpro.com/");
//	}
//	@When("^title of login page is free CRM$")
//	public void title_of_login_page_is_free_crm() {
//	  String titile=  driver1.getTitle();
//	  System.out.println(titile );
//		  Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.", titile);
//	}
//	
//	@Then("user enters username and password")
//	public void user_enters_username_and_password(DataTable dataTable) {
//		for( Map<String, String> data : dataTable.asMaps(String.class,String.class))
//		{
//	
//		driver1.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("username"));
//		  driver1.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
//	}
//	}
//	
//	@Then("user move to deal page")
//	public void user_move_to_deal_page() {
//		driver1.switchTo().frame("mainpanel");
//		Actions action=new Actions(driver1);
//		action.moveToElement(driver1.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		driver1.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	}
//	@Then("user click on New deal")
//	public void user_click_on_new_deal() {
//	   
//	}
//	@Then("user enters deal deatils")
//	public void user_enters_deal_deatils(DataTable dataTable) {
//		for( Map<String, String> data : dataTable.asMaps(String.class,String.class))
//		{
//	  driver1.findElement(By.id("title")).sendKeys(data.get("title"));
//	  driver1.findElement(By.name("client_lookup")).sendKeys(data.get("company"));
//	  driver1.findElement(By.name("contact_lookup")).sendKeys(data.get("contact"));
//	  driver1.findElement(By.name("amount")).sendKeys(data.get("amount"));
//	  driver1.findElement(By.xpath("//input[@name='addmore']")).click();
//		} 
//	}
////	@Then("save details")
////	public void save_details() {
////	  
////	}
//	@Then("close crowser")
//	public void close_crowser() {
//		
//		driver1.quit();	   
//	}
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	 WebElement login=  driver1.findElement(By.xpath("//input[@type='submit']"));
//	 JavascriptExecutor js= (JavascriptExecutor)driver1;
//	 js.executeScript("arguments[0].click();", login);
//	}
//	
//	@Then("^verify user is on Home page$")
//	public void verify_user_is_on_home_page() {
//	 String hometitile=  driver1.getTitle();
//	 System.out.println(hometitile);
//	 Assert.assertEquals("CRMPRO", hometitile);
//	
//	}
//
//
//
//}
