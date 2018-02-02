package baseUtilities;


import java.net.URL;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;



public class BaseCore {
	private static DesiredCapabilities capabilities=new DesiredCapabilities();
	private static AndroidDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> getDriver() {
		return driver;
	}
	public static void setDriver(AndroidDriver<MobileElement> driver) {
		BaseCore.driver = driver;
	}

	public static void initialization() throws IOException {
		
		File classpathRoot = new File(System.getProperty("user.dir")); //当前项目的路径
	    File appDir = new File(classpathRoot, "apps");//项目路径下的apps文件夹
	    File app = new File(appDir, "tongxunbeifen.apk"); //安装app
    	capabilities.setCapability("deviceName", "Android Emulator");
    	//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
    	capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0");
        capabilities.setCapability("app", app.getAbsolutePath());
        //启动app
        capabilities.setCapability("appPackage", "com.weining.view.activity");
        capabilities.setCapability("appActivity", "com.weining.backup.ui.activity.SplashActivity");
        driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}
	

	


}
