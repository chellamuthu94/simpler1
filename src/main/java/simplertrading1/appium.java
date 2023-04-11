package simplertrading1;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;

public class appium {

	public static AndroidDriver driver;
	@Test(priority = 0)
	public void test() throws InterruptedException, IOException, AWTException {
			org.openqa.selenium.remote.DesiredCapabilities de= new org.openqa.selenium.remote.DesiredCapabilities();
		
		  
	de.setCapability("platformName", "ANDROID");
		de.setCapability("platformVersion", "13");
		   de.setCapability("udid", "192.168.0.132:5555");
		    de.setCapability("deviceName", "Galaxy S20 FE 5G");      
			//de.setCapability("platformName", "ANDROID");
			//de.setCapability("platformVersion", "13");
		   // de.setCapability("udid", "192.168.1.19:5555");
		    //de.setCapability("deviceName", "Galaxy S20 FE 5G");
			de.setCapability("appPackage", "com.bellesoft.stprotradingroom");
			de.setCapability("appActivity", "com.bellesoft.stprotradingroom.MainActivity");
			de.setCapability("databaseEnabled", false);
		    URL url = new java.net.URL("http://0.0.0.0:4723/wd/hub");
			driver= new io.appium.java_client.android.AndroidDriver(url,de);
			PageFactory.initElements(driver, demo1.class);
			
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			demo1.username.sendKeys("roomtest1@simplertrading.com");
		
			demo1.password.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
			demo1.login.click();
			Thread.sleep(10000);
			/*demo1.tradingroom.click(); 
			Thread.sleep(2000);
			demo1.option1.click();
			Thread.sleep(2000);
			demo1.enterroom.click();
			Thread.sleep(2000);
			demo1.alert.click();
			Thread.sleep(2000);
			demo1.searchclick.click();
			Thread.sleep(2000);
			demo1.search.sendKeys("trendy");
			Thread.sleep(10000);
			
			List<WebElement> result = driver.findElements(By.xpath("//android.view.View[2]/android.view.View/android.view.View"));   
			
			
			System.out.println(result.size());
			if(result.size()==0)
			{
			    System.out.println("no search result for trading romm");
			}else {
				 System.out.println("REsults are found as Expected for trading room");	
			}
           demo1.search.clear();
			ArrayList<String> names = new ArrayList<String>();
		    names.add("kody");
		    names.add("tendy");
		    names.add("ko  u");
		    names.add("@13as");
		    names.add("lee");
		    names.add("lou@");

			for (int i = 0; i < names.size(); i++) {
				
					
					demo1.search.sendKeys(names.get(i));
					Thread.sleep(10000);
					List<WebElement> result1 = driver.findElements(By.xpath("//android.view.View[2]/android.view.View/android.view.View"));   
					
					
					System.out.println(result1.size());
					if(result1.size()==0)
					{
					    System.out.println("no search result for trading romm");
					}else {
						 System.out.println("REsults are found as Expected for trading room");	
					}
		            
				demo1.search.clear();
		    }
			
			for (int i = 0; i < names.size(); i++) {
				try{
					
					demo1.search.sendKeys(names.get(i));
					Thread.sleep(10000);
		            driver.findElement(By.xpath("//android.view.View[2]/android.view.View/android.view.View")).isDisplayed();
		            System.out.println("postivesceanerio:"+names.get(i));
		        }
		        catch(NoSuchElementException e){
		            System.out.println("negativesceanerio:"+names.get(i));
		        }  
				demo1.search.clear();
		    }
			
			//soft.assertAll();
			
			
			
			
			
	        //demo1.zoomclick(driver);
			///Thread.sleep(1000);
			//demo1.filtersearchlist(driver);
		    /*driver.rotate(ScreenOrientation.LANDSCAPE);
			

	  
			
			/*demo1.filterclick.click();
			Thread.sleep(2000);
			demo1.deselect.click();
			Thread.sleep(2000);
			demo1.option.click();
			
			
			
			File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File source= new File("C://Users//DELL//eclipse-workspace//mobiletest//homefilter.jpg");
			FileHandler.copy(File, source);
			
			
     
			String expectedImagePath = "D://screenshot//imge.jpg";
			  String actualImagePath = "C://Users//DELL//eclipse-workspace//mobiletest//homefilter.jpg";
			  
			  File expectedImageFile = new File(expectedImagePath);
			  File actualImageFile = new File(actualImagePath);

			  BufferedImage expectedImage = ImageIO.read(expectedImageFile);  
			  BufferedImage actualImage = ImageIO.read(actualImageFile);

			  ImageDiffer imgDiff = new ImageDiffer();

			  ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

			  if (diff.hasDiff()) {
			   System.out.println("Images are same");
			  } else {
			   System.out.println("Images are NOT same");
			  }*/
			//touch.swipe1toclick(driver);            
			
			//demo1.filtersearchlist(driver);
			//Thread.sleep(10000);
			
		/*	demo1.bookmarked.click();
			demo1.filterclick.click();
			Thread.sleep(3000);
			demo1.swipebookmarkedtoclick(driver);
			demo1.showonlybookmarked.click();
			demo1.apply1.click();
			Thread.sleep(10000);*/
			/*demo1.tradingroom.click(); 
			Thread.sleep(2000);
			demo1.option1.click();
			Thread.sleep(2000);
			demo1.enterroom.click();
			Thread.sleep(2000);
			demo1.files.click();
			Thread.sleep(4000);
			demo1.downloadlink.click();
			demo1.allow.click();
		String test=demo1.completd.getText();
		System.out.println(test);
			if (test.contentEquals("Download Complete") ) {
				System.out.println("files completed");
				
			}else {     
				System.out.println("files not completed");
			}
			demo1.ok1.click();
		/*demo1.tradingroom.click(); 
			Thread.sleep(2000);
			demo1.option1.click();
			Thread.sleep(2000);
			demo1.tradinguserclear.clear();
			demo1.enterroom1.click();
			String test1=demo1.validatetradingroomuserdefault.getText();
			String name="Enter Username to Conti";
			SoftAssert soft= new SoftAssert(); 
			soft.assertEquals(test1, name);
		
		if(test1.contentEquals("Enter Username to Continue")) {
			System.out.println("popup validated for without enter room");
		}else {
			System.out.println("popup not show for without enter room");
		}
	
soft.assertAll();
			
/*String	test=driver.findElement(By.xpath("//android.widget.TextView[@text='Login Error']")).getText();
     assertEquals(test, "Login Error");
     boolean titleTextfield = driver.findElement(By.id("widget_polarisCommunityInput_113_title")).isDisplayed();
     assertFalse(titleTextfield, "Title text field present which is not expected");
		
     
     if(driver.findElements(By.xpath("value")).size() != 0){
    	 System.out.println("Element is Present");
    	 }else{
    	 System.out.println("Element is Absent");
    	 }
     
     if(driver.findElement(By.xpath("value"))!=    null){
    	 System.out.println("Element is Present");
    	 }else{
    	 System.out.println("Element is Absent");
    	 
    	 }*/
			
			
			
			/*demo1.classes.click();
			Thread.sleep(2000);
			demo1.internal.click();
			Thread.sleep(2000);
			demo1.enterroom.click();
			Thread.sleep(2000);
			demo1.alert.click();
			Thread.sleep(2000);
			
	   driver.findElement(By.xpath("//android.widget.EditText[@checkable='false']")).sendKeys("hi test");
	    driver.findElement(By.xpath("//android.view.View[2]/android.widget.Button")).click();
	
	demo1.exitroom.click();
	demo1.ok.click();
	demo1.alerthome.click();
   demo1.filtersearchlist(driver);
   String we=driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).getText();
   //String test= "hi t";
assertEquals(we,we);
demo1.tradingroom.click(); 
Thread.sleep(2000);
demo1.option1.click();
Thread.sleep(2000);
demo1.enterroom.click();
Thread.sleep(2000);
demo1.alert.click();
Thread.sleep(5000);
demo1.filtersearchlist(driver);
String test= "hi t";
String we1=driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).getText();
assertEquals(we1,we1);
/*FileReader reader=new FileReader("config.properties");  
Properties properties = new Properties();
properties.load(reader);
for(int i=0;i<properties.size();i++) {
		
		
demo1.username.sendKeys(properties.getProperty(we1));

demo1.password.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
demo1.login.click();
}*/

/*FileInputStream fs = new FileInputStream("D:\\DemoFile.xlsx");
//Creating a workbook
XSSFWorkbook workbook = new XSSFWorkbook(fs);
XSSFSheet sheet = workbook.getSheetAt(0);
Row row = sheet.getRow(0);
Cell cell = row.getCell(0);
System.out.println(sheet.getRow(0).getCell(0));    
Row row1 = sheet.getRow(1);
Cell cell1 = row1.getCell(1);
System.out.println(sheet.getRow(0).getCell(1));
Row row2 = sheet.getRow(1);
Cell cell2 = row2.getCell(1);
System.out.println(sheet.getRow(1).getCell(0));
Row row3 = sheet.getRow(1);
Cell cell3 = row3.getCell(1);
System.out.println(sheet.getRow(1).getCell(1));
//String cellval = cell.getStringCellValue();
//System.out.println(cellval);*/

}	  
}
