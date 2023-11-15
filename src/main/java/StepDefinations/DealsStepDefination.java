//package StepDefinations;
//
//import java.util.List;
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
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DealsStepDefination {
//	
//
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
//	public static WebDriver driver;
//	@Then("user enters username and password")
//	public void user_enters_username_and_password(DataTable dataTable) {
//		List<List<String>> data =  dataTable.row();
//	
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
//		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
//	}
//	@Then("user move to deal page")
//	public void user_move_to_deal_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("driver"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	}
//	@Then("user click on New deal")
//	public void user_click_on_new_deal() {
//	   
//	}
//	@Then("user enters deal deatils")
//	public void user_enters_deal_deatils(DataTable dataTable) {
//	  List<List<String>> data= dataTable.row();
//	  driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
//	  driver.findElement(By.name("client_lookup")).sendKeys(data.get(0).get(1));
//	  driver.findElement(By.name("contact_lookup")).sendKeys(data.get(0).get(2));
//	  driver.findElement(By.name("amount")).sendKeys(data.get(0).get(3));
//	  
//	}
//	@Then("save details")
//	public void save_details() {
//	    driver.findElement(By.xpath("//input[@name='addmore']")).click();
//	}
//	@Then("close crowser")
//	public void close_crowser() {
//		
//		driver.quit();	   
//	}
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//	 WebElement login=  driver.findElement(By.xpath("//input[@type='submit']"));
//	 JavascriptExecutor js= (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", login);
//	}
//	
//	@Then("^verify user is on Home page$")
//	public void verify_user_is_on_home_page() {
//	 String hometitile=  driver.getTitle();
//	 System.out.println(hometitile);
//	 Assert.assertEquals("CRMPRO", hometitile);
//	
//	}
//
//
//}
