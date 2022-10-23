package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
public class CalculatorSteps extends BaseTest {
    @When("user input angka1 field is {int}")
    public void userInputAngka1FieldIs(int value){
        calculatorPage.inputAngka1(value);
    }
    @And("user input angka2 field is {int}")
    public void userInputAngka2FieldIs(int value) {
        calculatorPage.inputAngka2(value);
    }

    @And("user click equal button")
    public void userClickEqualButton() {
        calculatorPage.clickEqualbutton();
    }

    @And("user click dropdown button")
    public void userClickDropdownButton() {
        calculatorPage.clickdropdownbutton();
    }

    @And("user click plus button")
    public void userClickPlusButton() {
        calculatorPage.clickplusbutton();
    }

    @And("user click minus button")
    public void userClickMinusButton() {
        calculatorPage.clickminusbutton();
    }

    @And("user click multiply button")
    public void userClickMultiplyButton() {
        calculatorPage.clickmultiplybutton();
    }

    @And("user click division button")
    public void userClickDivisionButton() {
        calculatorPage.clickDivisionbutton();
    }

    @Then("plus result is {int}")
    public void plusResultIs(int plusResults) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+plusResults, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("minus result is {int}")
    public void minusResultIs(int minusResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+minusResult, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("multiply result is {int}")
    public void multiplyResultIs(int multiplyResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+multiplyResult, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("division result is {int}")
    public void divisionResultIs(int divisionResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+divisionResult, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @When("user input angka1 field is {string}")
    public void userInputAngka1FieldIs(String value) {
        calculatorPage.inputInvalidAngka1(value);
    }

    @And("user input angka2 field is {string}")
    public void userInputAngka2FieldIs(String value) {
        calculatorPage.inputInvalidAngka2(value);
    }

    @Then("add results is {string}")
    public void addResultsIs(String text) {
        Assertions.assertTrue(calculatorPage.checkResultisDisplayed(), text);
    }

    @When("user input angkadesimal1 field is {double}")
    public void userInputAngkadesimal1FieldIs(double value) {
        calculatorPage.inputAngkaDecimal1(value);
    }

    @And("user input angkadesimal2 field is {double}")
    public void userInputAngkadesimalFieldIs(double value) {
        calculatorPage.inputAngkaDecimal2(value);
    }

    @Then("plus decimal result is {double}")
    public void plusDecimalResultIs(double plusResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+plusResult, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("multiply decimal result is {double}")
    public void multiplyDecimalResultIs(double multipleResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+multipleResult, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("division decimal result is {double}")
    public void divisionDecimalResultIs(double divisionResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+divisionResult, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("minus decimal result is {double}")
    public void minusDecimalResultIs(double minusResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : "+minusResult, result);
        boolean isDisplayed = calculatorPage.checkResultisDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }
}
