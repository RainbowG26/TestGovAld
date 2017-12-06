package pages;


import libs.ActionWithElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//Сюда будем выносить все обищие страницы
public class ParentPage {
    WebDriver webDriver;
    Logger logger;
    public ActionWithElements actionWithElements;

    public ParentPage(WebDriver driver) { //Создали конструктор для того чтобы передать webDriver
        this.webDriver = driver; //webDriver перетащит webDriver который перейдет из вне
        logger = Logger.getLogger(getClass());
        //создали обьект благодаря которому в каждой Page мы будем с ним работать
        actionWithElements = new ActionWithElements(webDriver);
        //инициализировать елементы(@FindBy) того класса который к ней обращается через оператор this
        PageFactory.initElements(webDriver, this);
    }
}
