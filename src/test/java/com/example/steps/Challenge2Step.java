package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Challenge2Step extends BaseTest {
    @Given("user already on list menu")
    public void userAlreadyOnListMenu() {
        loginPage.inputUsername("admin");
        loginPage.inputPassword("admin");
        loginPage.clickLoginBtn();
        navigationMenu.clickHamburgerBtn();
        navigationMenu.clickListMenu();
    }

    @When("user tap hold on list keempat")
    public void userTapHoldOnListKeempat() {
        listPage.longPress();
    }

    @Then("info message will appear")
    public void infoMessageWillAppear() {
    }


    @When("user multiple tap on list ke enam puluh")
    public void userMultipleTapOnListKeempat() {
        listPage.swipeList();
        listPage.multipleTap();
    }
}
