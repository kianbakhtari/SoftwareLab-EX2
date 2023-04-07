package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int input;
    private String opt;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+), (rvs|sqr)$")
    public void twoInputValues(int arg0, String arg1) {
        input = arg0;
        opt = arg1;
    }
    @When("^I calculate$")
    public void iCalculate() {
        result = calculator.calculate(input, opt);
        System.out.print(result);
    }
    @Then("^I expect the result (-?\\d+\\.\\d+)$")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(arg0, result, 0.001);
    }

}
