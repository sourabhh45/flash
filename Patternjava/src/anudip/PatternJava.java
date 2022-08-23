package anudip;

public class PatternJava {

	/*
	 * This program is for printing a number pattern shown below:
	 * 1
	 * 121
	 * 12321
	 * 1234321
	 * 123454321
	 */
    public static void main(String[] args)
    {
        
        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int k = i - 1; k >= 1; k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }

	}

