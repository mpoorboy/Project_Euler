/*
ID: 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. 
Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class ID1 {

	public static void main(String[] args) {
		System.out.println(SumDivisibleBy(3) + SumDivisibleBy(5) - SumDivisibleBy(15));
	}

	public static int SumDivisibleBy(int factor) {
		int sum = 0;
		for (int i = 0; i <= 999; i++) {
			int p = 999 / factor;
			sum = factor * (p * (p + 1)) / 2;
		}
		return sum;
	}

}
// Answer: 233168
