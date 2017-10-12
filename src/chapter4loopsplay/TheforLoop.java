package chapter4loopsplay;

/**
 * ,
 */

public class TheforLoop
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate="collapsed" desc="4.3: The for{} Loop">
        /* while{} loop repeats 10 times. */
        int counter = 1; // Initializes the counter
        while (counter <= 10) // Check the counter
        {
            System.out.println("while{} loop " + counter);
            counter++; // Updates the counter
        }

        /* Above code is same as for{} loop below. */
        for (int counter2 = 1; counter2 <= 10; counter2++)
        {
            System.out.println("for{} loop " + counter2);
        }
        /* for{} loop also called: event-controlled loop, definite loop.
         * Also, the expressions in the for{} loop are not executed at once.
         * 1. The variable (counter2) initialization happens once (before the loop)
         * 2. The condition (counter2 <= 10) is checked before each loop.
         * 3. The update (counter++) is checked after each iteration.
         */
        //</editor-fold>
    }
}
