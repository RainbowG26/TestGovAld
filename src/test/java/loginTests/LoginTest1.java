package loginTests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest1 {

    //создаем обьект браузер
    //обьявили переменную
    WebDriver webDriver;


    @Test //аннотацию Junit

    public void validLogon() {

        //эта надпись нужно для того чтобы указать путь к файлу chromedriver для работы с ним
        File fileFF = new File("././drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());


        //создали обьект ChromeDriver для работы с ним //ChromeDriver - это реализация webDriver
        //открыли браузер в маленьком размере
        webDriver = new ChromeDriver();

        // Менеджеру webDriver дали команды открыть браузер в макс размере
        webDriver.manage().window().maximize();

        //настроить дефолтное ожидание браузера при выполнении
        //браузер будет повторять действия которые мы задаем в течении 10 секунд, если не выполнит выведет ошибку
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Вствляет URL в адресную строку браузера
        webDriver.get("https://test-gov.ald.in.ua/purchases");

        //Найди мне елемент по xpath -> указать локатор и вставь мне данные(sendKeys) в поле
        webDriver.findElement(By.xpath(".//*[@id='liLoginNoAuthenticated']/a")).click();
        webDriver.findElement(By.xpath(".//*[@id='butLoginPartial']")).click();
        webDriver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("test.gov.user@yopmail.com");
        webDriver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("123456");
        webDriver.findElement(By.xpath(".//*[@id='submitLogin']")).click();
        System.out.println("Page was opened");

        //Дать команду webDriver -> close - закрывает вкладку quit - закрывает браузер
        webDriver.quit();
    }
}
