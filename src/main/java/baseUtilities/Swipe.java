package baseUtilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class Swipe {
	
	//拖动某个元素向右翻页
	public static void swipeToLeft(AndroidDriver<WebElement> driver,WebElement element) {
		//元素起始x和y坐标
		Point point=element.getLocation();
		int startX=point.x;
		int startY=point.y;
		System.out.println("元素起始x="+startX+",元素起始y="+startY);
		//计算元素的宽和高
		Dimension dimension=element.getSize();
		int width=dimension.getWidth();
		int height=dimension.getHeight();
		System.out.println("元素宽width="+width+",元素高height="+height);
		//计算元素中间坐标
		int centerX=startX+width*3/4;
		int centerY=startY+height*3/4;
		System.out.println("元素中心点距边框宽centerX="+centerX+",高centerY="+centerY);
		TouchAction action=new TouchAction(driver);
		action.press(centerX, centerY).moveTo(5-centerX, 0).release().perform();

         }
	
	//拖动某个元素向左翻页
	public static void swipeToRight(AndroidDriver<WebElement> driver,WebElement element) {
		//元素起始x和y坐标
		Point point=element.getLocation();
		int startX=point.x;
		int startY=point.y;
		System.out.println("元素起始x="+startX+",元素起始y="+startY);
		//计算元素的宽和高
		Dimension dimension=element.getSize();
		int width=dimension.getWidth();
		int height=dimension.getHeight();
		System.out.println("元素宽width="+width+",元素高height="+height);
		//计算元素中间坐标
		int centerX=startX+width*1/4;
		int centerY=startY+height/2;
		System.out.println("元素中心点距边框宽centerX="+centerX+",高centerY="+centerY);
		int widthX=driver.manage().window().getSize().width;
		TouchAction action=new TouchAction(driver);
		action.press(centerX, centerY).moveTo(widthX-centerX-5, 0).release().perform();
         }
	//拖动某个元素向下翻页
	public static void swipeToUp(AndroidDriver<WebElement> driver,WebElement element) {
		//元素起始x和y坐标
		Point point=element.getLocation();
		int startX=point.x;
		int startY=point.y;
		System.out.println("元素起始x="+startX+",元素起始y="+startY);
		//计算元素的宽和高
		Dimension dimension=element.getSize();
		int width=dimension.getWidth();
		int height=dimension.getHeight();
		System.out.println("元素宽width="+width+",元素高height="+height);
		//计算元素中间坐标
		int centerX=startX+width*1/2;
		int centerY=startY+height*3/4;
		System.out.println("元素中心点距边框宽centerX="+centerX+",高centerY="+centerY);
		//int widthX=driver.manage().window().getSize().width;
		TouchAction action=new TouchAction(driver);
		action.press(centerX, centerY).moveTo(0, centerY-5).release().perform();
         }
	//拖动某个元素向上翻页
	public static void swipeToBottom(AndroidDriver<WebElement> driver,WebElement element) {
		//元素起始x和y坐标
		Point point=element.getLocation();
		int startX=point.x;
		int startY=point.y;
		System.out.println("元素起始x="+startX+",元素起始y="+startY);
		//计算元素的宽和高
		Dimension dimension=element.getSize();
		int width=dimension.getWidth();
		int height=dimension.getHeight();
		System.out.println("元素宽width="+width+",元素高height="+height);
		//计算元素中间坐标
		int centerX=startX+width*1/2;
		int centerY=startY+height*1/4;
		System.out.println("元素中心点距边框宽centerX="+centerX+",高centerY="+centerY);
		int heightY=driver.manage().window().getSize().height;
		TouchAction action=new TouchAction(driver);
		action.press(centerX, centerY).moveTo(0, heightY-centerY-5).release().perform();
         }
	
	public static void swipeUpBottom(AndroidDriver<WebElement> driver,int startX,int startY,int endX,int endY) {
		int widthX=driver.manage().window().getSize().width;
		int heightY=driver.manage().window().getSize().height;
		TouchAction action=new TouchAction(driver);
		try {
			if (widthX>=endY&&heightY>=endY) {
				action.press(startX, startY).moveTo(endX-startX, endY-startY).release().perform();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
     }
}
