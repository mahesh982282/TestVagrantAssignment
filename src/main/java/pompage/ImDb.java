package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class ImDb {
	WebDriver driver;
	String actualdateimdb;
	String actualcountryimdb;
	
		public  ImDb(WebDriver driver){
			this.driver=driver;
			driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
			
		WebElement releasedateimdb=driver.findElement(By.xpath("(//*[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[24]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", releasedateimdb);
	
	 actualdateimdb=releasedateimdb.getText();
	//System.out.println(actualdateimdb);
	 
	WebElement countryimdb=driver.findElement(By.xpath("//a[text()='India']"));
	actualcountryimdb=countryimdb.getText();
	//System.out.println(actualcountryimdb);
	
	}
	public boolean releaseimdb() {
		if(actualdateimdb.contains("January 7, 2022"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
    public boolean countryimdb() {
    	if(actualcountryimdb.contains("India"))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
	

}
