
/**
 * Lab 15.1 Rolling
 * 
 * Emily Zhuang
 * Mr. Lantsberger
 * APCS:Period 4
 * 29 October 2016
 */

import java.util.Random;

public class RollingTester
{
    /**
     * This program rolls three die until all three numbers are different.
     * It prints all three numbers and how many times it took to roll three different 
     * numbers.
     * It repeats this until it only take one roll to roll three unique numbers. 
     */
    public static void main(String[] args)
    {
        Random die = new Random();          //instantiates a random number generator
        
        int dieRoll1, dieRoll2, dieRoll3, count;    
        count = 0;                          //how many rolls it takes to get all unique numbers
        while (count != 1)                  //repeats until only all numbers are unique on first roll
        {
            dieRoll1 = 0;                   //instantiates all the variables as zero
            dieRoll2 = 0;
            dieRoll3 = 0;
            count = 0;
            //loop should break when (dieRoll1 != dieRoll2 && dieRoll2 != dieRoll3 &&
            //                        dieRoll3 != dieRoll1)
            while ((dieRoll1 == dieRoll2) || (dieRoll2 == dieRoll3) || (dieRoll3 == dieRoll1))
            {
                dieRoll1 = die.nextInt(6) + 1;              //rolls first dice and prints value
                System.out.print(dieRoll1);
                
                dieRoll2 = die.nextInt(6) + 1;              //rolls second dice and prints value
                System.out.print("  " + dieRoll2);
                
                dieRoll3 = die.nextInt(6) + 1;              //rolls third dice and prints value
                System.out.println("  " + dieRoll3);
                
                count++;                                    //increments count
            }
            
            System.out.println("count = " + count);         //prints value of count
            System.out.println();
        }

    }
}
