/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 0;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            i++;

            // Using Knuth's method to select the champion word with probability 1/i
            if (StdRandom.bernoulli(1.0 / i)) {
                champion = word;
            }
        }

        // Print the surviving champion word
        System.out.println(champion);
    }
}
