package be.ehb.demo_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void somShouldBeCorrect() {
       assertEquals(20, MathUtil.som(11,9),  "result incorrect");
       //assertThrows(ArithmeticException.class , () -> { MathUtil.som(5,0); } );
    }
}