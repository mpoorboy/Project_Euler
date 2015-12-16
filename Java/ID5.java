/*
ID: 5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class ID5 {
  public static int LCM(int range) {
    boolean notDiv = true;
    int answer = 1;
    while (notDiv) {
      int count = 0;
      for (int i = 1; i <= range; i++) {
        if (answer % i == 0) {
          count++;
        }
      }
      if (count == range) {
        return answer;
      }
      answer++;
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(LCM(20));
  }
}
//Answer: 232792560
