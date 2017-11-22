package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ActionWithOurElements { //В этот класс мы будем выносить все елементы страницы

    WebDriver webDriver;
    Logger logger;
    WebDriverWait webDriverWait15;
    Utils utils;


    public ActionWithOurElements(WebDriver driver) {
        this.webDriver = driver;
        logger = Logger.getLogger(getClass());
        webDriverWait15 = new WebDriverWait(webDriver, 15); //Драйвер жди 15 секунд каждые пол секунды он будет счелкать по кнопке
        utils = new Utils(webDriver);
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
            webDriverWait15.until(ExpectedConditions.elementToBeClickable(element));
            element.clear(); //Очисти поле
            element.sendKeys(text); //Введи текст
            logger.info("Was inputted - " + text);
        } catch (Exception e) {
            logger.error("Can not work with element - " + text);
            Assert.fail("Can not work with element - " + text);
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
            logger.error("Can not work with element - " + element);
            Assert.fail("Can not work with element - " + element);
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
            logger.error("Can not work with element - " + locator);
            Assert.fail("Can not work with element - " + locator);
        }
    }

    public boolean isElementPresent1(WebElement element) throws Exception {
        try {
            element.getText();
            logger.info("Element was found");
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } catch (Exception e) {
            throw new Exception("Can not work with element - " + element);
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            logger.info("Element was found");
            return element.isDisplayed();
        } catch (Exception e) {
            logger.error("Can not found element - " + element);
            Assert.fail("Can not found element - " + element);
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
            webDriverWait15.until(ExpectedConditions.textToBePresentInElement(By.xpath(xPath), text));
            String textFromElement = webDriver.findElement(By.xpath(xPath)).getText();
            Assert.assertEquals(textFromElement, text, "Text in element not mathed"); //Сравнивает фактич из ожидаемым
            return true;
        } catch (Exception e) {
            logger.error("Can not work with element - " + text);
            Assert.fail("Can not work with element - " + text);
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
            logger.info("Was selected is DropDown by text - " + text);
        } catch (Exception e) {
            logger.error("Can not work with DropDown - " + text);
            Assert.fail("Can not work with DropDown - " + text);
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
            logger.info("Was selected is DropDown by value - " + text);
        } catch (Exception e) {
            logger.error("Can not work with DropDown - " + text);
            Assert.fail("Can not work with DropDown - " + text);
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

    public void inputCalendarDataTime() {
        try {
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime currentDate = LocalDateTime.now();
            //запуск с консоли - SetDateTimePickerValue('planStart','2017-11-14 17:52:07')
            utils.setDataPicker("planStart", (currentDate.plusMinutes(2)).format(dateFormat));
            //setDataPicker("period_enquiry_end", (currentDate.plusMinutes(15)).format(dateFormat));
            logger.info("Data picker work");
        } catch (Exception e) {
            logger.error("Data picker does not work");
            Assert.fail("Data picker does not work");
        }
    }

    public String setDate(WebElement element, int minute) {
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentDate = LocalDateTime.now();
        logger.info("Get current date");
        //Calendar calendar = new GregorianCalendar();
        element.sendKeys();
        logger.info("Add days what we are need: " + minute);
        return currentDate.plusMinutes(3).format(dateFormat);
        //calendar.add(Calendar.MINUTE, minute);
        //return format.format(calendar.getTime());
    }

    public void uploadFile(String path) {
        File uploadFile = new File(path);
        webDriver.findElement(By.xpath(".//input[@type ='file']")).sendKeys(uploadFile.getAbsolutePath());
    }
}
