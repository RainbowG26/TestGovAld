package libs;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Utils {

    private Logger logger;
    WebDriver webDriver;

    public Utils(WebDriver driver) { //Создали конструктор для работы с логом
        this.webDriver = driver;
        logger = Logger.getLogger(getClass());
    }

    /**
     * Taking screenshot into .//target// + pathToScreenShot
     *
     * @param pathToScreenShot
     * @param driver
     */
    public void screenShot(String pathToScreenShot, WebDriver driver) { //Метод который делает скрин
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //Снимает скрин
        try {
            FileUtils.copyFile(scrFile, new File(pathToScreenShot));
            logger.info("ScreenShot: " + pathToScreenShot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hard wait
     *
     * @param second
     */
    //Статический член 'libs.Utils.waitABit (int)' обращается через ссылку экземпляра меньше
    //Метод waitABit Static, он напрямую вызывается без приложения к конкретному объекту этого класса
    public void waitABit(int second) { //Метод останавливает все процессы в джава
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //str formatter java - форматер в строку, js.executeScript java

    public void setDataPicker(String id, String value) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("SetDateTimePickerValue(\'" + id + "\',\'" + value + "\')");
        } catch (JavascriptException e) {
            e.printStackTrace();
        }
    }

    public void scrollPage() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("window.scrollBy(0,300)", "");
        } catch (JavascriptException e) {
            e.printStackTrace();
        }
    }
}