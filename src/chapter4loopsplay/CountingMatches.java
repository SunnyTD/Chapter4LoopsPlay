package chapter4loopsplay;

import java.util.Scanner;

/**
 * ,
 */

public class CountingMatches
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate = "collapsed" desc="4.7.2: Counting Matches">

        /* Counts how many spaces are in a string, and then spaces the string accordingly. */
        int spaces = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input string here: ");
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == ' ')
            {
                spaces++;
            }
        }
        System.out.println(spaces);
        //</editor-fold>
    }
}
