package step_defination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="Feature123",glue="Mystep_definations",plugin= {"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})
//path above is given for running particular project we can also give My_Feature folder also,glue is used to give package name,tags is used to select any two method and plugin is used to create html report.
public class Runner1 {

}
