package chapter4loopsplay;

/**
 * ,
 */

public class TheMonteCarloMethod
{
    public static void main(String[] args)
    {
        // 4.10.3: The Monte Carlo Method (pi)

        // Predicts behavior of pi using basic arithmetic.
        final int tries = 10000000;
        int hits = 0;
        for (int i = 1; i <= tries; i++)
        {
            // Generate random numbers between 0 and 1
            double r = Math.random();
            double x = -1 + 2 * r; // Gets a random number for x-coord for point on the unit circle
            r = Math.random();
            double y = -1 + 2 * r; // Gets a random number for the y-coord on the unit circle

            if (x * x + y * y <= 1) // Checks to see if coords are within circle boundary (pi=1)
            {
                hits++; // The ratio (hits/tries) is approx. pi/4
            }
        }
        double piEstimate = 4.0 * hits / tries; // ((pi/4) * 4) = pi
        System.out.println("Estimate for pi: " + piEstimate);
    }
}
