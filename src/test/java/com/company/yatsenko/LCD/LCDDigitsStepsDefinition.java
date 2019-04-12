package com.company.yatsenko.LCD;

import com.company.yatsenko.LCD.second.variant.factory.services.NumericFactory;
import com.company.yatsenko.LCD.second.variant.factory.services.NumericParser;
import com.company.yatsenko.LCD.second.variant.factory.services.NumericRepresentation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;


public class LCDDigitsStepsDefinition {
    private NumericRepresentation numericRepresentation;
    private int userInput;
    private String actualAnswer;

    @Given("^Initialize Numeric Representation$")//^-start of the String,$<-End of the string
    public void initNumericRepresentation() {
        NumericParser numericParser = new NumericParser();
        NumericFactory numericFactory = new NumericFactory();
        numericRepresentation = new NumericRepresentation(numericFactory, numericParser);
    }

    @When("^User set numeric (\\d+)$")
    public void shouldInitializeRightParametr(int number) {
        userInput = number;
    }

    @Then("^Return \"([^\"]*)\"$")
    public void returnNumericInFormat(String expectedAnswer) throws Throwable {
        numericRepresentation.representNumeric(1);
        System.out.println();
        System.out.println(expectedAnswer);
        assertEquals(expectedAnswer, "._.|.||_|");
        System.out.println(expectedAnswer);
    }
}
