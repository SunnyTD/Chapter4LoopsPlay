package chapter4loopsplay;

/**
 * ,
 */

import java.util.Scanner;

public class ComparingAdjacentValues
{
    public static void main(String[] args)
    {
        //<editor-fold degaultstate = "collapsed" desc = "4.7.6: Comparing Adjacent Values"

        // Compares values that precede them in order.
        Scanner in = new Scanner(System.in);
        double input = in.nextDouble();
        while (in.hasNextDouble())
        {
            double previous = input;
            input = in.nextDouble();
            if (input == previous)
            {
                System.out.println("Duplicate input");
            }
            else
            {
                System.out.println("New input");
            }
        }
        //</editor-fold>
    }
}
