/*
ID:20
n! means n × (n − 1) × ... × 3 × 2 × 1. For example: 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, and the sum of the digits in the
number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27. Find the sum of the digits in the number 100!
*/
import java.math.BigInteger;

public class ID20 {
    public static void main(String[] args) {
        System.out.println(SumOfFactorialDigits(100));

    }

    public static int SumOfFactorialDigits(int number) {
        int sum = 0;
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String digits = String.valueOf(fact);

        for (int i = 0; i < digits.length(); i++) {
            int j = Character.digit(digits.charAt(i), 10);
            sum += j;
        }
        return sum;
    }
}

// Answer: 648
