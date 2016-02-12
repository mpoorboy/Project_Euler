/*
ID: 10
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the primes below 2,000,000.
*/

public class ID10 {

    public static void main(String[] args) {
        System.out.println(SumOfPrimesLT(2000000L));
    }

    public static long SumOfPrimesLT(long limit) {

        boolean[] sieve = new boolean[(int) limit];
        int crosslimit = sieve.length;
        long sum = 0L;
        
        for (int i = 2; i < crosslimit; i++) {
            sieve[i] = true;
        }

        for (int i = 2; (i * i) < crosslimit; i++) {
            if (sieve[i])
                for (int j = (i * i); j < crosslimit; j += i)
                    sieve[j] = false;
        }

        for (int i = 2; i < crosslimit; i++) {
            if (sieve[i])
                sum += i;
        }
        
        return sum;
    }
}
// Answer: 142913828922
