package be.ehb.demo_testing.utils;

public class StringUtils {

    public static boolean isPalindroom(String input){
        //clean up spaces and capital letters
        String cleanInput = input.replace(" ", "");
        //reverse it
        StringBuilder sb = new StringBuilder(cleanInput);
        String reversed = sb.reverse().toString();

        return cleanInput.equalsIgnoreCase(reversed);
    }
}
