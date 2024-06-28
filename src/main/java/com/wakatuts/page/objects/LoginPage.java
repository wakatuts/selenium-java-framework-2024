package com.wakatuts.page.objects;



import com.wakatuts.page.steps.LoginSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public void login(String username) {
        WebDriver driver = new ChromeDriver();
        driver.findElement(LoginSelector.LOGIN_INPUT);
    }

}
