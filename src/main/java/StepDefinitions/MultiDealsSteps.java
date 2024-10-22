package StepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiDealsSteps {

	WebDriver driver;

	@Before
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@After
	public void closeBrowser() {
			driver.quit();
	}
	
	@Before("@smoke")
	public void beforeSmoke() {
		System.out.println("I am before Smoke Test");
	}
	
	@After	("@smoke")
	public void afterSmoke() {
		System.out.println("I am after Smoke Test");
	}
	
	@Given("^user is on application home page$")
	public void user_is_on_application_home_page() {
		

		driver.get("https://freecrm.com/");

	}

	@When("^application page title is FREE CRM$")
	public void application_page_title_is_FREE_CRM() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "#1 Free CRM Software Power Up your Entire Business Free Forever";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Then("^user clicks START HERE button$")
	public void user_clicks_START_HERE_button() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/a")).click();

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
//		List<List<String>> testData = credentials.asLists();
		for (Map<String, String> mapData : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.name("email")).sendKeys(mapData.get("userName"));
			driver.findElement(By.name("password")).sendKeys(mapData.get("password"));
		}

	}

	@Then("^user clicks Login button$")
	public void user_clicks_Login_button() {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

	}

	@And("^navigates to user profile page$")
	public void navigates_to_user_profile_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/a/i")).isDisplayed();
		Thread.sleep(3000);

	}

	@Then("^go to deals$")
	public void go_to_deals() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[5]/a/i"))).build().perform();

	}

	@Then("^click on create$")
	public void click_on_create() {
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[5]/button/i")).click();
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable data) throws InterruptedException {
		for (Map<String, String> dealData : data.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@autocomplete='new-password' and @name='title']")).sendKeys(dealData.get("Title"));
			driver.findElement(By.name("description")).sendKeys(dealData.get("Description"));
			driver.findElement(By.name("amount")).sendKeys(dealData.get("Amount"));
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input"))
					.sendKeys(dealData.get("Company"));
			driver.findElement(By.name("probability")).sendKeys(dealData.get("Probability"));
			
			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[5]/a/i"))).build().perform();
			driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[5]/button/i")).click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[5]/a/i")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Pipeline')]"))).build().perform();
		Thread.sleep(3000);

	}

//	@Then("^click on save$")
//	public void click_on_save() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
//		Thread.sleep(3000);
//	}

//	@And("^close the browser$")
//	public void close_the_browser() {
//		driver.close();
//
//	}
	
	

}
