/*
ID: 15
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner. How many such routes are there through a 20×20 grid?
*/

// Binomial Coefficient: (n! / (k! * (n-k)!)
public class ID15 {
    public static void main(String[] args) {

        System.out.println(NChooseK(40, 20));
    }

    public static long NChooseK(int moves, int grid_size) {
            long count = 1;

        if (grid_size > (moves - grid_size)){
            grid_size = moves - grid_size;
        }

        for (int i = 0; i < grid_size; i++) {
            count *= (moves - i);
            count /= (i + 1);

        }

        return count;
    }

}
// Answer: 137846528820
