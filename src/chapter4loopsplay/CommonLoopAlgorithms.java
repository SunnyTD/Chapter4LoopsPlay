package chapter4loopsplay;

/**
 * ,
 */

import java.util.Scanner;

public class CommonLoopAlgorithms
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate="collapsed" desc="4.7: Common Loop Algorithms">

        /* Computing sum of the number of inputs */
//        double total = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input numbers <100 to add: ");
//        while (in.hasNextDouble())
//        {
//            double input = in.nextDouble();
//            total = total + input;
//            if (total > 100)
//            {
//                break;
//            }
//        }
//        System.out.println("Sum of inputs: " + total);

        /* Computing an average based on input values */
        double total = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers to average: ");
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            total = total + input;
            count++;
            if (total > 100)
            {
                break;
            }
        }
        double average = 0;
        if (count > 0)
        {
            average = total / count;
        }
        System.out.println("average: " + average);
        //</editor-fold>
    }
}
