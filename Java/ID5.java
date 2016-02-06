/*
ID: 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class ID5 {
  public static boolean isPrime(int n) {
    boolean prime = true;
    if (n < 2)
      return false;
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        prime = false;
        break;
      }
    }
    return prime;
  }

  public static int LCM(int k) {
    int lcm = 1;
    for (int i = 2; i <= k; i++) {
      if (isPrime(i)) {
        lcm *= i;
      } else if (lcm % i != 0) {
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            lcm *= j;
            break;
          }
        }
      }
    }

    return lcm;
  }

  public static void main(String[] args) {
    System.out.println(LCM(20));
  }
}
//Answer: 232792560
