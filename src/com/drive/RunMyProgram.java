package com.drive;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Mutton",glue= {"com.cucumberr.third"})
public class RunMyProgram {

}
