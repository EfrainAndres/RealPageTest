package com.realpage.automation.pages;

import com.realpage.automation.pages.basepage.BasePage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class SearchPage extends BasePage {

    private String homePage;
    private String text;
    private String firstResult;

    public String getHomepage() {
        return homePage;
    }

    public String getText() {
        return text;
    }

    public String getFirstResult() {
        return firstResult;
    }

    public void goHomePage(String homePage) throws InterruptedException {
        dv.get(this.homePage = homePage);
        wait.loading(2000);
    }

    public void txtSearch(String text) throws InterruptedException {
        dv.findElement(By.name("q")).sendKeys(this.text = text);
        wait.loading(2000);
    }

    public void clickSearchButton() throws InterruptedException {
        dv.findElement(By.name("btnK")).click();
        wait.loading(2000);
    }

    public void resultsPage() throws InterruptedException {
        String link = dv.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a")).getAttribute("href");
        wait.loading(2000);
    }

    public void firstResult(String firstResult) throws InterruptedException {
        String actualString = dv.findElement(By.cssSelector("#rso > div:nth-child(2) > div > div.r > a > h3")).getText();
        String expectedString = this.firstResult = firstResult;
        assertTrue(actualString.contains(expectedString));
        wait.loading(2000);
    }

    public void clickFirstResult() throws InterruptedException {
        dv.findElement(By.cssSelector("#rso > div:nth-child(2) > div > div.r > a > h3")).click();
        wait.loading(2000);
        dv.navigate().back();
        wait.loading(2000);
    }

    public void goToThePage() throws InterruptedException {
        dv.findElement(By.xpath("(//a[contains(text(),'Patrick Rothfuss')])[3]")).click();
        wait.loading(2000);
        dv.findElement(By.cssSelector("#hdtb-msb-vis > div:nth-child(4) > a")).click();
        wait.loading(2000);
    }

    public void listIsDisplayed() throws InterruptedException {
        dv.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li/div/div[2]/div/span")).getText();
        wait.loading(2000);
    }

    public void clickFirstSuggestion() throws InterruptedException {
        dv.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li/div/div[2]/div/span")).click();
        wait.loading(2000);
    }
}
