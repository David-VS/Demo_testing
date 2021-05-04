package be.ehb.demo_testing;


import be.ehb.demo_testing.utils.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"mooi dit idioom", "racecar", "kajak", "Tim Smit"})
    void shouldBePalindrome(String input){
        assertTrue(StringUtils.isPalindroom(input));
    }
}
