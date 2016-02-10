/*
ID: 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the primes below 2,000,000.
*/
public class ID10 {
    public static void main(String[] args) {
        System.out.println(SumOfPrimesLT(2000000L));
    }

    public static long SumOfPrimesLT(long max) {
        long sum = 2L;
        for (long i = 3L; i < max; i += 2L) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(long n) {
        boolean prime = true;
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

}
// Answer: 142913828922
