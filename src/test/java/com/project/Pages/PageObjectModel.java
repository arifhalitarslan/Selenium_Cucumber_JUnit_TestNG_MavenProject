package com.project.Pages;

import com.project.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class PageObjectModel {

    public PageObjectModel() throws IOException {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//*[@id=\"txtSearchBox\"]")
public WebElement searchBox ;


    




}
