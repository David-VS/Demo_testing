package be.ehb.demo_testing.utils;

public class Calculator {

    public static double power(double x, double e){
        return Math.pow(x, e);
    }

    public static double divide(double x, double y) {
        if(y == 0.0 || y == -0.0)
            throw new ArithmeticException("/ by 0");
        return x/y;
    }

    public static int factorial(int input){
        int result = 1;
        for( ;input > 1 ; input--) {
            result *= input; //korter voor resultaat = resultaat * input
        }
        return result;
    }

    //extra, recursief opgelost
    public static int factorialRecursief(int input){
        if(input < 1)
            return 1;
        return input * factorialRecursief(input - 1);
    }
}
