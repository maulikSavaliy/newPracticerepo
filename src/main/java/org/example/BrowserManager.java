package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BrowserManager extends Utils {
    String browserName = System.getProperty("browser");
    boolean souce= Boolean.parseBoolean(System.getProperty("souce"));

    URL url = null;

    public void openBrowser() {

        if (souce)
        {
            if (browserName.equalsIgnoreCase("chrome"))
            {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");
                Map<String, Object> sauceOptions = new HashMap<>();
                sauceOptions.put("username", "oauth-maulikkumar955-c8345");
                sauceOptions.put("accessKey", "4f087935-4817-43a4-b941-0e7b0d30e322");
                sauceOptions.put("build", "<your build id>");
                sauceOptions.put("name", "<your test name>");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
                driver = new RemoteWebDriver(url, browserOptions);

            } else if (browserName.equalsIgnoreCase("firefox"))
            {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");
                Map<String, Object> sauceOptions = new HashMap<>();
                sauceOptions.put("username", "oauth-maulikkumar955-c8345");
                sauceOptions.put("accessKey", "4f087935-4817-43a4-b941-0e7b0d30e322");
                sauceOptions.put("build", "<your build id>");
                sauceOptions.put("name", "<your test name>");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
                driver = new RemoteWebDriver(url, browserOptions);

            } else if (browserName.equalsIgnoreCase("edge"))
            {
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");
                Map<String, Object> sauceOptions = new HashMap<>();
                sauceOptions.put("username", "oauth-maulikkumar955-c8345");
                sauceOptions.put("accessKey", "4f087935-4817-43a4-b941-0e7b0d30e322");
                sauceOptions.put("build", "<your build id>");
                sauceOptions.put("name", "<your test name>");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
                 driver = new RemoteWebDriver(url, browserOptions);
            }

        }
        else {

            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/Resources/driver/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.msedge.driver", "src/test/Resources/driver/msedgedriver.exe");
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/Resources/driver/geckodriver.exe");
                driver = new FirefoxDriver();
            } else {
                System.out.println(browserName + "is not match");
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    }

    public void closeBrowser() {
        // driver.quit();

    }
//    System.setProperty("webdriver.chrome.driver","src/test/Resources/driver/chromedriver.exe");
//    driver=new ChromeDriver();
}
