package com.team13.recruitmentautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Pavel
 */
public class WhatsAppSend {

    public static void sendWhatsUpMessage(String phoneNumber, String text) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-profiles-outside-user-dir");
        options.addArguments("--enable-profile-shortcut-manager");
        options.addArguments("user-data-dir=C:\\Users\\lait2\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
        options.addArguments("--profile-directory=Profile 1");
        options.addArguments("--profiling-flush=n");
        options.addArguments("--enable-aggressive-domstorage-flushing");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://web.whatsapp.com/");

        String messageUrl = String.format("https://web.whatsapp.com/send?phone=%s&text=%s",
                phoneNumber, text.replace(" ", "+"));

        driver.get(messageUrl);
        Thread.sleep(5000);
        WebElement sendButton = driver.findElement(By.cssSelector("[data-tab='11']"));
        sendButton.click();
        Thread.sleep(500);
        driver.quit();
    }
}