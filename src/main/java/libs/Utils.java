package libs;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Utils {

    private Logger logger;

    public Utils() { //Создали конструктор для работы с логом
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
    public void waitABit(int second) { //Метод останавливает все процессы в джава
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}