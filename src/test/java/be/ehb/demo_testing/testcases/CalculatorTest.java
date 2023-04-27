package be.ehb.demo_testing.testcases;

import be.ehb.demo_testing.utils.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void shouldBeCorrectPower(){
        assertEquals(9, Calculator.power(3,2));
    }

    @Test
    void shouldNotDivideByZero() {
       assertThrows(ArithmeticException.class, new Executable() {
           @Override
           public void execute() throws Throwable {
               Calculator.divide(1,0);
           }
       });
       //of korter via Lambda
        // assertThrows(ArithmeticException.class, () -> Calculator.divide(1,0) );
    }

    @Test
    void shouldBeCorrectFactorial(){
        assertEquals(120, Calculator.factorial(5));
    }

    @ParameterizedTest
    @CsvSource({
            "4, 24",
            "5, 120",
            "6, 720"
    })
    void shouldBeCorrectFactorialCSV(int input, int outpout){
        assertEquals(outpout, Calculator.factorialRecursief(input));
    }
}
