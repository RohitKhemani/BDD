package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\rohit\\eclipse-workspace\\BDD\\src\\main\\java\\com\\org\\feature\\Login.feature"},
		glue = {"Stepping"},
        monochrome = true 
        plugin = {"pretty", }
        
		
		)




public class TestRunner {

}
