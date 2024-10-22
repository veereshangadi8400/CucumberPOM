package StepDefinitions;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class LoginSteps {

//	WebDriver driver;
//
//	@Given("^user is on application home page$")
//	public void user_is_on_application_home_page() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		driver.get("https://freecrm.com/");
//
//	}
//
//	@When("^application page title is FREE CRM$")
//	public void application_page_title_is_FREE_CRM() {
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "#1 Free CRM Software Power Up your Entire Business Free Forever";
//		Assert.assertEquals(expectedTitle, actualTitle);
//
//	}
//
//	@Then("^user clicks START HERE button$")
//	public void user_clicks_START_HERE_button() {
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/a")).click();
//
//	}
//
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String userName, String password) {
//		driver.findElement(By.name("email")).sendKeys(userName);
//		driver.findElement(By.name("password")).sendKeys(password);
//
//	}
//
//	@Then("^user clicks Login button$")
//	public void user_clicks_Login_button() {
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
//		
//	}
//
//	@Then("^navigates to user profile page$")
//	public void navigates_to_user_profile_page() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i")).isDisplayed();
//		Thread.sleep(3000);
//		
//	}
//	
//	@Then("^go to contacts$")
//	public void go_to_contacts() throws InterruptedException {
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i"))).build().perform();
//		
//	}
//	
//	@Then("^click on create$")
//	public void click_on_create() {
//		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/button/i")).click();
//	}
//	
//	@Then("^user enters details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_details_and_and(String firstName, String lastName, String company) throws InterruptedException {
//		driver.findElement(By.name("first_name")).click();
//		driver.findElement(By.name("first_name")).sendKeys(firstName);
//		driver.findElement(By.name("last_name")).sendKeys(lastName);
//		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input")).sendKeys(company);
//		Thread.sleep(3000);
//	}
//	
//	@Then("^click on save$")
//	public void click_on_save() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
//		Thread.sleep(3000);
//	}
//	
//	@And("^verify new contact$")
//	public void  verify_new_contact() throws InterruptedException {
//
//		driver.findElement(By.xpath("//*[@id=\'main-nav\']/div[3]/a/i")).click();
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/div[1]"))).build().perform();
//		driver.findElement(By.xpath("//*[@id=\'dashboard-toolbar\']/div[2]/div/div[1]")).isDisplayed();
//		Thread.sleep(3000);
//		
//	}
//	
//	@And("^close the browser$")
//	public void close_the_browser() {
//		driver.close();
//
//	}
	
	
	
	
}
