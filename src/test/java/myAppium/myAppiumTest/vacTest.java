package myAppium.myAppiumTest;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;


public class vacTest {
	AndroidDriver<WebElement> driver;
  @Test(priority=1)
  public void login() throws InterruptedException {
	  driver.findElementById("com.suneee.vacapp:id/username").clear();
	  driver.findElementById("com.suneee.vacapp:id/username").sendKeys("admin");
	  Thread.sleep(3000);
	  driver.findElement(By.id("com.suneee.vacapp:id/pw")).clear();
	  driver.findElement(By.id("com.suneee.vacapp:id/pw")).sendKeys("123456");
	  Thread.sleep(3000);
	  driver.findElementById("com.suneee.vacapp:id/loginBtn").click();
	  Thread.sleep(15000);
  }
  
  @Test(priority=2)
  public void carPlan() throws InterruptedException {
	  TouchAction action=new TouchAction(driver);
	  action.tap(90, 220).perform();//点击左上角导航按钮
	  Thread.sleep(3000);
	  action.tap(300, 540).perform();//点击车辆服务
	  Thread.sleep(3000);
	  action.tap(200, 650).perform();//点击用车计划
	  Thread.sleep(3000);
	  baseUtilities.Swipe.swipeUpBottom(driver, 700, 2000, 700, 400);//向下拖动

	  Thread.sleep(6000);
	   }
  @BeforeClass
  public void beforeClass() throws InterruptedException, MalformedURLException {
	  DesiredCapabilities capabilities=new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "Android emulator");
  	  capabilities.setCapability("automationName", "Appium");
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability("platformVersion", "7.0");
    
      capabilities.setCapability("appPackage", "com.suneee.vacapp");
      capabilities.setCapability("appActivity", ".ui.AppIntroduceActivity");
      driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      Thread.sleep(3000);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
}


