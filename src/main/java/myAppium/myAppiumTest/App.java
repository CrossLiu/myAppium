package myAppium.myAppiumTest;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import baseUtilities.Swipe;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;

public class App 
{
   
	public static void main( String[] args ) throws Exception{
		tongXunBF();



	

    }
	
		
	public static void tongXunBF() throws Exception {
//		File classpathRoot = new File(System.getProperty("user.dir")); //当前项目的路径
//	    File appDir = new File(classpathRoot, "apps");//项目路径下的apps文件夹
//	    File app = new File(appDir, "tongxunbeifen.apk"); //安装app
	    DesiredCapabilities capabilities=new DesiredCapabilities();
	    capabilities.setCapability("deviceName", "Android emulator");
    	//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
    	capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
//
//        capabilities.setCapability("app", app.getAbsolutePath());
      
        capabilities.setCapability("appPackage", "com.weining.view.activity");
        capabilities.setCapability("appActivity", "com.weining.backup.ui.activity.SplashActivity");
        AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(6000);
        WebElement element=driver.findElementByClassName("android.widget.ImageView");
        Swipe.swipeToLeft(driver, element);
        Thread.sleep(3000);
        Swipe.swipeToLeft(driver, element);
        Thread.sleep(3000);
       
	}
}


