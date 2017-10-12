package chapter4loopsplay;

/**
 * ,
 */

public class NestedLoops
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate = "collapsed" desc = "4.8: Nested Loops">

        // Simulates a 4x4 table, with each row increasing the rate power (1^2, 1^3, etc.)
        final int nmax = 4;
        final double xmax = 2;

        //print table body
        for (double x = 1; x <= xmax; x++)
        {
            // print table row
            for (int n = 1; n <= nmax; n++)
            {
                System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }
        //</editor-fold>
    }
}
