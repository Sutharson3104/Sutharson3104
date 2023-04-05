package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	@Before("@sanity")
	public void before() {
		System.out.println("hooks-@before");

	}
	
	@Before("@E2@")
	public void before1() {
		System.out.println("hooks-@before1");

	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("hooks-@beforeStep");

	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("hooks-@AfterStep");

	}
	
	@After
	public void after() {
		System.out.println("hooks-@after");

	}
	
	
	

}
