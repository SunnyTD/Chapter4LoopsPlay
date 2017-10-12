package chapter4loopsplay;

import java.util.Scanner;

/**
 * ,
 */

public class ThedoLoop
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate="collapsed" desc="4.4: The do{} Loop">
        /* The do{} loop works backwards from the other loops in that
         * it checks the given condition at the end of the loop, and
         * does all of the computations first. (Post-test loop)
         */
        int value;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println("Enter an integer < 100: ");
            value = in.nextInt();
        }
        while (value >= 100);
        System.out.println(value);
        //</editor-fold>
    }
}
