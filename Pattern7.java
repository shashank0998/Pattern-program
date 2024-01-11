package com.pattern;

public class Pattern7
{
    public static void main(String[] args)
    {
/*
        1
        123
        12345
        1234567

*/

        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=2*i-1;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
