package com.mavenit.selenium.traning.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    private String browser = "";


    public void openBrowser() {
        // Switch
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void navigateTo(String url){
        driver.get(url);
    }

    public void maxBrowser(){
        driver.manage().window().maximize();
    }

    public void applyImpWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBroser(){
        driver.quit();
    }

    public void handleApplicationCookies(){
        driver.findElement(By.linkText("GOT IT")).click();
    }


    public void sleep(int milli){
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
