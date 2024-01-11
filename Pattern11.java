package com.pattern;

public class Pattern11
{
    public static void main(String[] args)
    {
/*
        11
        2222
        333333
        44444444

        */
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=2*i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
