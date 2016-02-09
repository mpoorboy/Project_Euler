/*
ID: 3
The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143?
*/
class ID3 {
	public static long MaxPrimeFactorOf(long n) {
		long max = 0L;
		for (long i = 2L; i <= n; i++) {
			for (long l = 1L; l <= Math.sqrt(i); l++) {
				if (l % i == 0) {
					break;
				} else {
					while (n % i == 0) {
						n = n / i;
						max = i;
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(MaxPrimeFactorOf(600851475143L));
	}
}
// Answer: 6857
