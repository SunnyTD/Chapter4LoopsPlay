package chapter4loopsplay;

/**
 * ,
 */

public class ThewhileLoop
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate="collapsed" desc="4.1: The while{} Loop">
        /* While loop runs continuously as long as (while) set condition is true.
         * Increments year counter and adds interest while balance is
         * less than target balance of $20,000.
         */
        double balance = 1000;
        int target = 2000;
        double year = 0;
        double rate = 5;

        while (balance < target)
        {
            year++;
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
        System.out.println("Balance: " + balance);
        System.out.println("Years taken to double balance: " + year);

        /* Common Error 4.2: Infinite Loops
         * Cntrl+C, or simply killing the program, ends loops.

         * Common Error 4.3: Off-by-one Errors
         * Keep in mind the starting point of equasions.
         * In the above case, should the year start as 0 or 1?
         * 0, because year 1 is the first year where interest is being added,
         * not year 0.(this is because of the year++ line)
         */
        //</editor-fold>
    }
}
