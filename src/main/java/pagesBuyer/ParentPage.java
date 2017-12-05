package pagesBuyer;


import libs.ActionWithOurElements;
import libs.Utils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Сюда будем выносить все обищие страницы
public class ParentPage {
    WebDriver webDriver;
    Logger logger;
    public ActionWithOurElements actionWithOurElements;
    Utils utils;

    public ParentPage(WebDriver driver) { //Создали конструктор для того чтобы передать webDriver
        this.webDriver = driver; //webDriver перетащит webDriver который перейдет из вне
        logger = Logger.getLogger(getClass());
        //создали обьект благодаря которому в каждой Page мы будем с ним работать
        actionWithOurElements = new ActionWithOurElements(webDriver);
        utils = new Utils(webDriver);
        //инициализировать елементы(@FindBy) того класса который к ней обращается через оператор this
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Method opens url
     *
     * @param url
     */

    public void open(String url) { //создаем метод open и в него передаем Тип String с именем url
        try {
            webDriver.get(url); //открываем страницу
            logger.info("Page was opened - " + url);
        } catch (Exception e) {
            logger.error("Page can not opened - " + url);
            //Assert.fail пишет текст в Junit ЛОГ который будет использоваться для отчетов, и помимо этого он тест останавливает
            //Assert любой из них при негативном тесте завершает работы теста и пишет красным
            Assert.fail("Page can not opened" + url);
        }
    }

    /**
     * Method check title page
     *
     * @param expectedTitle
     */

    public void checkTitle(String expectedTitle) { //Метод ищет title //Strategy Pattern used and Map
        try {
            Assert.assertEquals(expectedTitle, webDriver.getTitle(), "Title not matched");
        } catch (Exception e) {
            logger.error("Can not work with title");
            Assert.fail("Can not work with title");
        }
    }
}
