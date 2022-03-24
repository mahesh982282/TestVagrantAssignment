package pomtest;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pompage.ImDb;
import pompage.WiKi;



public class BaseTest {
	static WebDriver driver;
	ImDb im;
	WiKi wi;
	@BeforeSuite
	public void initBrowser() {
	//System.setProperty("webdriver.chrome.driver","E:\\download\\selenium\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notification");
	option.addArguments("--start-maximize");
	driver = new ChromeDriver(option);
	
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
   

   }
	@BeforeClass
	public void createObject() throws IOException {
		
		im =new ImDb(driver);
		wi= new WiKi(driver);
	}
	
}
