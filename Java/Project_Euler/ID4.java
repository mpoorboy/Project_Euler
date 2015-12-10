/*
ID: 4
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
class ID4 {
public static boolean isPalindrome(int nr) {
    int rev = 0;                    // the reversed number
    int x = nr;                     // store the default value (it will be changed)
    while (x > 0) {
        rev = 10 * rev + x % 10;
        x /= 10;
    }
    return nr == rev;               // returns true if the number is palindrome
}

public static void main(String[] args) {

    int max = 100001;

    for ( int i = 999 ; i >= 100 ; i--) {
        if ( max >= i*999 ) { 
            break;
        }
        for (int j = 999 ; j >= i ; j-- ) {             
            int p = i * j;
            if ( max < p && isPalindrome(p) ) {
                max = p;
            }
        }
    }       
    System.out.println(max);
}
}