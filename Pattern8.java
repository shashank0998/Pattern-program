package com.pattern;

public class Pattern8
{
    public static void main(String[] args)
    {
        /*

        1
        222
        33333
        4444444

        */
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
