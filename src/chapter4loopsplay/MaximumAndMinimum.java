package chapter4loopsplay;

/**
 * ,
 */

import java.util.Scanner;

public class MaximumAndMinimum
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate = "collapsed" desc = "4.7.5: Maximum And Minimum"

        // Stores and keeps the largest variable in the system updated
//        Scanner in = new Scanner(System.in);
//        double largest = in.nextDouble();
//        while (in.hasNextDouble())
//        {
//            double input = in.nextDouble();
//            if (input > largest)
//            {
//                largest = input;
//                System.out.println("New largest #: " + largest);
//            }
//            else
//            {
//                System.out.println("No change to largest #... " + largest);
//            }
//        }

        /* Does same as above, but with the smallest input */
        Scanner in = new Scanner(System.in);
        double smallest = in.nextDouble();
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (input < smallest)
            {
                smallest = input;
                System.out.println("New smallest #: " + smallest);
            }
            else
            {
                System.out.println("No change in smallest #: " + smallest);
            }
        }
        //</editor-fold>
    }
}
