package chapter4loopsplay;

/**
 * ,
 */

public class FindingTheFirstMatch
{
    public static void main(String[] args)
    {
        //<editor-fold defaultstate = "collapsed" desc = "4.7.3: Finding the First Match"

        // Stops when it first finds the letter 'a' in the string.
        boolean found = false;
        char ch = '?';
        int position = 0;
        String str = "Strange";

        while (!found && position < str.length())
        {
            ch = str.charAt(position);
            if (ch == 'A' || ch == 'a')
            {
                found = true;
            }
            else
            {
                position++;
            }
        }
        System.out.println(position);
        System.out.println(found);
        //</editor-fold>
    }
}
