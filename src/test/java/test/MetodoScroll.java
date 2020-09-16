package test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static test.RepBase.driver;

public class MetodoScroll {

        public static void scrollDown(){
            Dimension dimension = AppDriver.getDriver().manage().window().getSize();
            int scrollStart = (int) (dimension.getHeight() * 0.5);
            int scrollEnd = (int) (dimension.getHeight() * 0.2);

            new TouchAction((PerformsTouchActions) AppDriver.getDriver())
                    .press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release().perform();
        }

        public static void scrollNClick(By listItems, String Text){
            boolean flag = false;

            while(true){
                for(WebElement el: AppDriver.getDriver().findElements(listItems)){
                    if(el.getAttribute("text").equals(Text)){
                        el.click();
                        flag=true;
                        break;
                    }
                }
                if(flag)
                    break;
                else
                    scrollDown();
            }
        }

        public static void scrollNClick(WebElement el){
            int retry = 0;
            while(retry <= 5){
                try{
                    el.click();
                    break;
                }catch (org.openqa.selenium.NoSuchElementException e){
                    scrollDown();
                    retry++;
                }
            }
        }

        public static void scrollIntoView(String Text){
            ((AndroidDriver<MobileElement>) AppDriver.getDriver()).findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + Text + "\").instance(0))").click();
        }

        public static void swipeScreenWithLogs(String dir) {
            System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

            // Animation default time:
            //  - Android: 300 ms
            //  - iOS: 200 ms
            // final value depends on your app and could be greater
            final int ANIMATION_TIME = 200; // ms

            final int PRESS_TIME = 200; // ms

            int edgeBorder = 10; // better avoid edges
            Point pointStart, pointEnd;
            PointOption pointOptionStart, pointOptionEnd;

            // init screen variables
            Dimension dims = driver.manage().window().getSize();

            // init start point = center of screen
            pointStart = new Point(dims.width / 2, dims.height / 2);

            switch (dir) {
                case "DOWN": // center of footer
                    pointEnd = new Point(dims.width / 2, dims.height - edgeBorder);
                    break;
                case "UP": // center of header
                    pointEnd = new Point(dims.width / 2, edgeBorder);
                    break;
                case "LEFT": // center of left side
                    pointEnd = new Point(edgeBorder, dims.height / 2);
                    break;
                case "RIGHT": // center of right side
                    pointEnd = new Point(dims.width - edgeBorder, dims.height / 2);
                    break;
                default:
                    throw new IllegalArgumentException("swipeScreen(): dir: '" + dir.toString() + "' NOT supported");
            }

            // execute swipe using TouchAction
            pointOptionStart = PointOption.point(pointStart.x, pointStart.y);
            pointOptionEnd = PointOption.point(pointEnd.x, pointEnd.y);
            System.out.println("swipeScreen(): pointStart: {" + pointStart.x + "," + pointStart.y + "}");
            System.out.println("swipeScreen(): pointEnd: {" + pointEnd.x + "," + pointEnd.y + "}");
            System.out.println("swipeScreen(): screenSize: {" + dims.width + "," + dims.height + "}");
            try {
                new TouchAction(driver)
                        .press(pointOptionStart)
                        // a bit more reliable when we add small wait
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                        .moveTo(pointOptionEnd)
                        .release().perform();
            } catch (Exception e) {
                System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
                return;
            }

            // always allow swipe action to complete
            try {
                Thread.sleep(ANIMATION_TIME);
            } catch (InterruptedException e) {
                // ignore
            }
        }

    }
