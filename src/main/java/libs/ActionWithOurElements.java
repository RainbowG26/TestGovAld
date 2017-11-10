package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionWithOurElements { //В этот класс мы будем выносить все елементы страницы

    WebDriver webDriver;
    Logger logger;

    public ActionWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
    }

    /**
     * Method clears and inputs text to webElement
     *
     * @param element
     * @param text
     */

    //Этот метод будет передавать елемент и текст который мы будем вводить
    public void enterText(WebElement element, String text) {
        try {
            element.clear(); //Очисти поле
            element.sendKeys(text); //Введи текст
            logger.info(text + " was inputted");
        } catch (Exception e) {
            logger.error("Can not work with element" + element);
            Assert.fail("Can not work with element" + element);
        }
    }

    /**
     * Method Click element Button
     *
     * @param element
     */

    public void clickOnElement(WebElement element) {
        try {
            element.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            logger.error("Can not work with element" + element);
            Assert.fail("Can not work element" + element);
        }
    }

    /**
     * Method Click element Button by Locator
     *
     * @param locator
     */

    public void clickOnElementByLocator(WebElement locator) {
        try {
            locator.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            logger.info("Element was clicked");
            Assert.fail("Can not work element" + locator);
        }
    }

    /**
     * Method is element with locator
     * @param locator
     * @param text
     * @return
     */
    public boolean isElementPresent(String locator, String text) {
        try {
            return webDriver.findElement(By.xpath(locator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    /**
     * Method is element with Present locator and text
     * @param xPath
     * @param text
     * @return
     */

    public boolean checkTextInElement(String xPath, String text) {

        try {
            // будем дожидаться появление елемента
            // зачеркнутый метод это имееться ввиду что он рабочий но есть еще новей
            String textFromElement = webDriver.findElement(By.xpath(xPath)).getText();
            Assert.assertEquals(textFromElement,text,"Text in element not mathed"); //Сравнивает фактич из ожидаемым
            return true;
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        return false;
    }
}
