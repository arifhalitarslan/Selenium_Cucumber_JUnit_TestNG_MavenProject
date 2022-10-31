package com.project.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Driver {

    public static WebDriver driver;


    public static WebDriver getDriver() throws IOException {

        String browserType = ConfigurationReader.getPropertyObject().getProperty("browser");

        switch (browserType) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.chromedriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.chromedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.err.println("invalid browser");
                System.exit(0);
        }

        return driver;

    }

}
