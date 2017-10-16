package chapter4loopsplay;

/**
 * ,
 */

public class SimulatingDiceTosses
{
    public static void main(String[] args)
    {
        // 4.10.2: Simulating Dice Tosses

        // Simulates 2 dice throws each 10 times. (output between 1 and 6)
        for (int i = 1; i <= 10; i++)
        {
            int d1 = (int) ((Math.random() * 6) + 1);
            int d2 = (int) ((Math.random() * 6) + 1);
            System.out.println(d1 + " " + d2);
        }
        System.out.println();
    }
}
