package myAppium.myAppiumTest;

import org.testng.annotations.Test;

import baseUtilities.Swipe;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class TestCase {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement element=driver.findElementByClassName("android.widget.ImageView");
      Swipe.swipeToLeft(driver, element);
      Thread.sleep(3000);
      Swipe.swipeToLeft(driver, element);
      Thread.sleep(3000);
      driver.findElementById("com.weining.view.activity:id/btn_start").click();
      Thread.sleep(3000);
  }
  @BeforeClass(description="初始化app")
  public void beforeClass() throws InterruptedException, MalformedURLException {
	  DesiredCapabilities capabilities=new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "Android emulator");
  	  capabilities.setCapability("automationName", "Appium");
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability("platformVersion", "7.0");
    
      capabilities.setCapability("appPackage", "com.weining.view.activity");
      capabilities.setCapability("appActivity", "com.weining.backup.ui.activity.SplashActivity");
      driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      Thread.sleep(3000);
      
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
