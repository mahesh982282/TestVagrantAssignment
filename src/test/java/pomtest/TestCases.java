package pomtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseTest {
	

	@Test(priority=1)
	public void comparedate() {
    boolean releasewiki=	wi.releasewiki();
    	boolean releaseimdb=im.releaseimdb();
		
		Assert.assertEquals(releasewiki, releaseimdb);
	}
    
    @Test(priority=2)
	public void comparecountry() {
    	boolean countrywiki=wi.countrywiki();
    	boolean countryimdb=im.countryimdb();
		Assert.assertEquals(countrywiki,countryimdb );
	}
	
	
}
