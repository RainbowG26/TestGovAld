package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class ActionWithOurElements { //В этот класс мы будем выносить все елементы страницы

    WebDriver webDriver;
    Logger logger;
    WebDriverWait webDriverWait15;

    public ActionWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        webDriverWait15 = new WebDriverWait(webDriver, 15); //Драйвер жди 15 секунд каждые пол секунды он будет счелкать по кнопке
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
     *
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
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Method is element with Present locator and text
     *
     * @param xPath
     * @param text
     * @return
     */

    public boolean checkTextInElement(String xPath, String text) {

        try {
            // будем дожидаться появление елемента
            // зачеркнутый метод это имееться ввиду что он рабочий но есть еще новей
            String textFromElement = webDriver.findElement(By.xpath(xPath)).getText();
            Assert.assertEquals(textFromElement, text, "Text in element not mathed"); //Сравнивает фактич из ожидаемым
            return true;
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        return false;
    }

    // передать в этот метод в каком елементе что выбрать
    public void selectTextInDropDownByText(WebElement dropDown, String text) {
        try {
            //Библиотека умеет работать с ДропДауном и с него получаем все елементы
            // нужно отталкиваться от мануального тесткейса!!! для работы с дроп дауном
            // DropDown - это селект
            // мы получаем все что находиться внутри дропдауна
            Select optionsFromDropDown = new Select(dropDown);
            // Выбери нам из текста
            optionsFromDropDown.selectByVisibleText(text);
            //optionsFromDropDown.selectByValue(text);
            logger.info(text + " was selected si DropDown by Text");
        } catch (Exception e) {
            logger.error("Can not work with DropDown");
            Assert.fail("Can not work with DropDown");
        }
    }

    //Метод выбора значения в DropDown по value
    public void selectValueInDropDownByValue(WebElement dropDown, String text) {
        try {
            //Библиотека умеет работать с ДропДауном и с него получаем все елементы
            Select optionsFromDropDown = new Select(dropDown);
            // Выбери нам из value
            // select by value - работает быстрей в разы!!
            optionsFromDropDown.selectByValue(text);
            logger.info(text + " was selected si DropDown by value");
        } catch (Exception e) {
            logger.error("Can not work with DropDown");
            Assert.fail("Can not work with DropDown");
        }
    }

    //Метод по работе с checkbox(сначала у него узнать состояние , и в зависимости от состояния - кликнуть по нему или нет)
    public void clickCheckBox(WebElement checkBox) {
        try {
            Boolean statusCheckBox = checkBox.isSelected();
            if (statusCheckBox) {
                logger.info("check box is initially checked");
            } else {
                webDriverWait15.until(ExpectedConditions.elementToBeClickable(checkBox));
                checkBox.click();
                logger.info("check box was clicked");
            }
        } catch (Exception e) {
            logger.error("Can not work with element " + checkBox);
            Assert.fail("Can not work with element " + checkBox);
        }
    }

    public void setCheckboxState(WebElement checkbox, String expectedState) {

        boolean currentState = checkbox.isSelected();

        logger.info("Clicking checkBox");
        if (currentState == true && expectedState == "unclicked") {
            logger.info("Click checkbox to make it unclicked");
            checkbox.click();
        } else if (currentState == false && expectedState == "clicked") {
            logger.info("Click checkbox to make it clicked");
            checkbox.click();
        }
    }

    public void inputCalendarDataTime(WebElement dateCalendar) {
//        LocalDateTime currentDate = LocalDateTime.now();
//        currentDate.plusMinutes(5);
//        dateCalendar.click();


        DateTimeFormatter dateFormat =
                DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        LocalDateTime date = LocalDateTime.now();
        dateFormat.format(date);
        dateFormat.format(date.plusMinutes(5));
    }
}

