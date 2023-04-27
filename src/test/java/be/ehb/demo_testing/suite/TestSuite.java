package be.ehb.demo_testing.suite;

import be.ehb.demo_testing.testcases.CalculatorTest;
import be.ehb.demo_testing.testcases.StringUtilsTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, StringUtilsTest.class})
public class TestSuite {
}
