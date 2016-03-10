/*
ID: 17
If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
*/

public class ID17 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
            sum += toEnglish(i).length();
        System.out.println(Integer.toString(sum));
    }

    private static String[] ONES = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static String[] TEENS = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen" };
    private static String[] TENS = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    private static String toEnglish(int n) {
        if (n < 0 || n > 99999)
            throw new IllegalArgumentException();

        if (n < 100)
            return tens(n);
        else {
            String result = "";
            if (n >= 1000)
                result += tens(n / 1000) + "thousand";
            if (n / 100 % 10 != 0)
                result += ONES[n / 100 % 10] + "hundred";
            if (n % 100 != 0)
                result += "and" + tens(n % 100);
            return result;
        }
    }

    private static String tens(int n) {
        if (n < 10)
            return ONES[n];
        else if (n < 20)
            return TEENS[n - 10];
        else
            return TENS[n / 10 - 2] + (n % 10 != 0 ? ONES[n % 10] : "");
    }

// Answer: 21124
