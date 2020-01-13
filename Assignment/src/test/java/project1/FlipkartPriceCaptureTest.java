package project1;

import org.testng.annotations.Test;

import com.project.commonLib.BaseClass;

import objectRepo.FlipkartPage;


public class FlipkartPriceCaptureTest extends BaseClass {
	@Test
	public void priceCAptureTest() throws Throwable {
		FlipkartPage flp = new FlipkartPage(driver);
		flp.flipkartPriceCount();

	}
}
