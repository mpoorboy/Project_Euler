/*
ID:30
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4
As 1 = 1^4 is not a sum it is not included. The sum of these numbers is 1634 + 8208 + 9474 = 19316.
Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
*/

public class ID30 {

	public static void main(String[] args) {
		System.out.println(SumOfNumbers());
	}

	public static int SumOfNumbers() {
		int number_sum = 0;
		for (int i = 2; i < 1000000; i++) {
			if (i == SumOf5thPwrDigits(i))
				number_sum += i;
		}
		return number_sum;
	}

	public static int SumOf5thPwrDigits(int number) {
		int digit_sum = 0;
		while (number != 0) {
			int digit = number % 10;
			digit_sum += (int) Math.pow(digit, 5);
			number /= 10;
		}
		return digit_sum;
	}

}
// Answer: 443839
