package com.pattern;

public class Pattern5
{
    public static void main(String[] args)
    {
        /*
        55555
        4444
        333
        22
        1
        */
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
}
