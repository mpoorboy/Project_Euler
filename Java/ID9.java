/*ID: 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2. There exists exactly one Pythagorean triplet for which: a + b + c = 1000.
Find the product abc.*/

public class ID9 {
//s = the perimeter of the triangle
  public static void product(int s) {
    int a, b, c;
    for (a = 3; a <= (s - 3) / 3; a++) {
      for (b = (a + 1); b < (s - 1 - a) / 2; b++) {
        c = s - a - b;
        if ((c * c) == (a * a) + (b * b)) {
          System.out.println(a * b * c);
        }
      }
    }
  }
  public static void main(String[] args) {
    product(1000);
  }
}
// Answer: 31875000
