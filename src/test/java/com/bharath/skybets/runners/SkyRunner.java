package com.bharath.skybets.runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"json:target/cucumber.json", "html:target/default-html-reports"},
        features = "src/test/resources/features/",
        glue = "com/bharath/skybets/stepDef",
        dryRun = false
)

public class SkyRunner extends AbstractTestNGCucumberTests{

	
	
}
