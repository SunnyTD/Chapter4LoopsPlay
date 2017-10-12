package chapter4loopsplay;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ?????? (Doesn't work/unanswered topic: Special Topic 4.2
 */

public class DadTest
{
    public static void main(String[] args)
    {

        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(isReader);
        while (true)
        {
            try
            {
                String inputStr = null;
                if ((inputStr = bufReader.readLine()).equals("exit"))
                {

                    System.out.println("exiting program");
                    break;
                }
                else
                {
                    System.out.println(inputStr);
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
