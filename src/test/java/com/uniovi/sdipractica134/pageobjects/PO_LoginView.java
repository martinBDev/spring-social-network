package com.uniovi.sdipractica134.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PO_LoginView extends PO_View {
    public static void login(WebDriver driver, String email, String password ){
        PO_NavView.clickOption(driver, "login", "class", "btn btn-primary");
        WebElement user = driver.findElement(By.name("username"));
        user.click(); user.clear(); user.sendKeys(email);
        WebElement passwd= driver.findElement(By.name("password"));
        passwd.click(); passwd.clear(); passwd.sendKeys(password);


        By boton = By.className("btn"); driver.findElement(boton).click();
    }
}
