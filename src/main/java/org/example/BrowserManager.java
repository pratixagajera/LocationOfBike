package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{
    /*create method for open browser*/
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("http://api.citybik.es/v2/networks");
    }

    /*create method for close browser*/
    public void closeBrowser()
    {
        driver.quit();
    }
}
