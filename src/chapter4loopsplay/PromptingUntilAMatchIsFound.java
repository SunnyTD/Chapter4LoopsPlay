package chapter4loopsplay;

/**
 * ,
 */

import java.util.Scanner;

public class PromptingUntilAMatchIsFound
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate = "collapsed" desc = "4.7.4 Prompting until a match is found"

        // Keeps asking user for input until it is correct (falls under parameters)
        boolean valid = false;
        double input = 0;
        Scanner in = new Scanner(System.in);

        while (!valid)
        {
            System.out.println("Please enter a positive value < 100");
            input = in.nextDouble();
            if (0 < input && input < 100)
            {
                valid = true;
            }
            else
            {
                System.out.println("invalid number");
            }
        }
        System.out.println(valid);
        System.out.println(input);
        //</editor-fold>
    }
}
