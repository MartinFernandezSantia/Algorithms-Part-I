import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

/* This is an example of the relationship between the problem size N and the running time of the program.

 * We read the input, then start the timer, then count the triplets and finally print the triplets and
   the time it took to run the program.

 *
 *
 * */

// Counts the number of triples in a file of N integers that sum to 0 (assuming overflow plays no role)
public class ThreeSum {
    public static int count(int[] a) { // Count triples that sum to 0.
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
        return cnt;
    }

    // We use 1Kints.txt and the other Kints as input
    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        Stopwatch timer = new Stopwatch();
        int cnt = count(a);
        double time = timer.elapsedTime();

        StdOut.println(cnt + " triples " + time + " seconds.");
    }
}
