package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("31000"));
        System.out.println(isPhoneNumberValid("11100"));
        System.out.println(isPhoneNumberValid("3132131223"));

        System.out.println(isPhoneNumberValidPredicate.test("31000"));

        //Chaining Predicates
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("31000"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("3132131223"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).or(containsNumber5).test("3152131223"));

        System.out.println(stringContainsAnother.test("311", "1"));
    }

    //Illustration
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("31") && phoneNumber.length() == 5;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("31") && phoneNumber.length() == 5;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static Predicate<String> containsNumber5 = phoneNumber -> phoneNumber.contains("5");

    static BiPredicate<String, String> stringContainsAnother = (phoneNumber, anotherString) ->
            phoneNumber.contains(anotherString);
}
