package chapter4loopsplay;

/**
 * ,
 */

public class ApplicationRandomNumbersandSimulations
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate = "collapsed" desc = "4.10: Application: Random Numbers and Simulations"

        // Calls Math.random() 10 times. This generates 10 random floating-point numbers that are >= 0 and <1.
        for (int i = 1; i <= 10; i++)
        {
            double r = Math.random();
            System.out.println(r);
        }
        //</editor-fold
    }
}
