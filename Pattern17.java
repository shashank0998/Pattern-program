package com.pattern;

public class Pattern17
{
    public static void main(String[] args)
    {
/*
        1
        12
        123
        1234
        12345

    */
        for (int i=1;i<=5;i++)
        {
            for (int k=1;k<=5-i;k++)
            {
                System.out.print(" ");              // create space in left side
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
