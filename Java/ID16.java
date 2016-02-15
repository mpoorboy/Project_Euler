/*
ID: 16
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26. What is the sum of the digits of the number 2^1000?
*/
import java.math.BigInteger;

public class ID16 {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(2, 1000));

    }

    public static int SumOfDigits(int base, int exp) {
        BigInteger number = BigInteger.valueOf(base);
        number = number.pow(exp);
        int sum = 0;
        String digits = String.valueOf(number);

        for (int i = 0; i < digits.length(); i++) {
            int j = Character.digit(digits.charAt(i), 10);
            sum += j;
        }
        return sum;
    }
}

// Answer: 1366
