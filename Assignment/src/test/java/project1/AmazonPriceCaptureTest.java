package project1;

import org.testng.annotations.Test;

import com.project.commonLib.BaseClass;

import objectRepo.AmazonPage;

public class AmazonPriceCaptureTest extends BaseClass {
	@Test
	public void priceCAptureTest() throws Throwable
	{
AmazonPage amz=new AmazonPage(driver);
amz.amazonPriceCount();
}}
