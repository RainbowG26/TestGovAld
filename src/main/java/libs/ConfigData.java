package libs;


import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 *  That class provides static methods for getting values from Config and UI mapping files
 *  Этот класс предоставляет статические методы для получения значений из файлов сопоставления Config и UI
 */
public class ConfigData {
    public static String cfgFile="src/config.properties"; //Path to config.properties file
    public static String uiMappingFile="src/UIMapping.properties";
    public static String filePath="src/filePath.properties";

    /*
     *  Return value from .properties file
     *  Возвращаемое значение из файла .properties.
     */
    public static String getValueFromFile(String key, String fileName) throws IOException {
        Properties p = new Properties();
        // Create stream for reading from file
        FileInputStream cfg = new FileInputStream(fileName);
        // Load Properties from input stream
        p.load(cfg);
        cfg.close();

        // Return value for the property
        // Возвращаемое значение для свойства
        return(p.getProperty(key));
    }


    /*
     *  Return value from UI mapping file.
     *  Возвращаемое значение из файла сопоставления пользовательского интерфейса.
     *  Note, please, that returned value is String.
     *  Обратите внимание, что возвращаемое значение - String.
     *  We should take care of value's type by himself when will use config data value in the test.
     *  Мы должны позаботиться о типе значения самостоятельно, когда будем использовать значение
     *  данных конфигурации в тесте.
     */
    public static String getFilePathValue(String key) throws IOException {
    	
        return(getValueFromFile(key, filePath));
    }


    /*
    *  Return value from config file.
    *  Возвращаемое значение из файла конфигурации.
    *  Note, please, that returned value is String.
    *  We should take care of value's type by himself when will use config data value in the test.
    */
    public static String getCfgValue(String key) throws IOException {

        return(getValueFromFile(key, cfgFile));
    }


    /*
     *  Return By class with finding method and target for WebElement from UI mapping file
     *  Возврат По классу с методом поиска и целью для WebElement из файла сопоставления пользовательского интерфейса
     */
    public static By ui(String key) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        // Get WebElement's locator from UI mapping file and divide it to finding method and target
        // Получить локатор WebElement из файла сопоставления пользовательского интерфейса и разделить его на метод поиска и целевой
        String[] partsOfLocator=getValueFromFile(key, uiMappingFile).split("\"");
        String findMethod=partsOfLocator[0].substring(0,partsOfLocator[0].length()-1);
        String target=partsOfLocator[1];

        // Return By class with appropriate method and target
        // Возврат по классу с соответствующим методом и целью
        if (findMethod.equals("id")){
            return By.id(target);
        } else {
            if (findMethod.equals("xpath")){
                return By.xpath(target);
            } else {
                if (findMethod.equals("name")){
                    return By.name(target);
                } else {
                    if (findMethod.equals("linkText")){
                        return By.linkText(target);
                    } else {
                        if (findMethod.equals("tagName")){
                            return By.tagName(target);
                        } else {
                            if (findMethod.equals("className")){
                                return By.className(target);
                            } else {
                                if (findMethod.equals("cssSelector")){
                                    return By.cssSelector(target);
                                } else {
                                    return By.partialLinkText(target);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}
