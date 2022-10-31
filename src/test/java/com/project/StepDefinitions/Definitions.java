package com.project.StepDefinitions;

import com.project.Pages.PageObjectModel;
import com.project.Utilities.ConfigurationReader;
import com.project.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Definitions  {
    WebDriver driver;
    PageObjectModel page;

    {
        try {
            page = new PageObjectModel();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @When("I should be in the ebebek website")
    public void i_should_be_in_the_ebebek_website() throws IOException {

 driver = Driver.getDriver();
 driver.get("https://www.e-bebek.com/");

    }
    @When("I should write {string} and searching the products")
    public void i_should_write_and_searching_the_products(String string) throws IOException, InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"txtSearchBox\"]")).sendKeys("bebek bezi"+ Keys.ENTER);

        Thread.sleep(3000);
    }

    @Then("I should get all prices of products in the first page as List<>")
    public void i_should_get_all_prices_of_products_in_the_first_page_as_list() {
        List<WebElement> bebekbezler = driver.findElements(By.className("product-item__new-price"));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        for (WebElement each: bebekbezler) {
            System.out.println(each.getText()+" ");
    }



}
}
