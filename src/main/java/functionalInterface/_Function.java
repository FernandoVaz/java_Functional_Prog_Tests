package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Function takes one argument and produces one result
        int increment = increment(0);
        System.out.println(increment);

        // This is much easier to read, apply implements the function
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply10 = multiplyBy10.apply(10);
        System.out.println(multiply10);

        int chainValues = multiplyBy10.apply(increment2);
        System.out.println(chainValues);

        final Function<Integer, Integer> incrementByOneAndMultiplyBy10
                = incrementByOneFunction.andThen(multiplyBy10);

        System.out.println(incrementByOneAndMultiplyBy10.apply(1));


        // BiFunction
        // Takes two arguments and produces one result

        final int value = incrementByOneAndMultiply(4, 125);
        System.out.println(value);

        final int valueBiFunction = incrementByOneAndMultiplyBiFunction.apply(4, 125);
        System.out.println(valueBiFunction);

    }

    //This function increments a number just as the same as the increment using main/increment
    static Function<Integer, Integer> incrementByOneFunction = number -> number++;
    //Takes an value , returns a value
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

    //Num to add, num to multiply, result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
