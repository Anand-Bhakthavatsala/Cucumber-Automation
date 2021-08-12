package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tester {

//	@Given("^I am a manual tester$")

	@Given("^I am a \"([a-zA-Z]{1,})\" tester$")
//	@Given("^I am a ([a-zA-Z]{1,}) tester$") 
	public void I_am_a_manual_tester(String testerType)
	{
		System.out.println("@Given -- I_am_a_"+testerType+"_tester");
	}
	
/*	public void I_am_a_manual_tester()
	{
		System.out.println("@Given -- I_am_a_manual_tester");
	}*/
	
	@When("^I apply for a job$")
	public void I_apply_for_a_job() {
		System.out.println("@When I apply for a job");
	}
	
//	@Then("^I got less paid job$")
	@Then("^I got \"([a-zA-Z]{1,})\" paid job$")
	public void I_got_less_paid_job(String salary)
	{
		System.out.println("@Then I got "+salary+" paid job");
	}
	
//	@And("^I am not satisfied with my salary$")
	@And ("^I am \"([a-zA-Z]{1,})\" satisfied with my salary$")
	public void I_am_not_satisfied_with_my_salary(String satisfactionType) {
		System.out.println("@And I am not "+satisfactionType+" with my salary");
	}
	
//	@But("^my parents are still satisfied$")
	@But("^my parents are \"([a-zA-Z]{1,})\" satisfied$")
	public void my_parents_are_still_satisfied(String parentsSatisfaction)
	{
		System.out.println("@But my parents are "+parentsSatisfaction+" satisfied");
	}
}
