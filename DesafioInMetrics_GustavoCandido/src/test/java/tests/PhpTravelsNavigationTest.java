package tests;
 
import org.junit.runner.RunWith;
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(features = "features",tags = "@navFeature",
					glue = "steps",format = {"pretty", "html:target/cucumber"}) 

public class PhpTravelsNavigationTest { }