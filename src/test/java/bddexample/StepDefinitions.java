package bddexample;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	
	private DoxyOrder order;

    @Given("A customer orders Doxycycline")
    public void orderDoxycycline() {
    	order = new DoxyOrder();
    }

    @And("Suffers the condition {string}")
    public void suffersCondition(String condition) {
    	order.setCondition(condition);
    }

    @Then("Reply should be {string}")
    public void replyIs(String expectedAnswer) {
    	assertEquals(expectedAnswer, order.getPrescribeMessage());
    }

}
