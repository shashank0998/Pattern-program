package com.pattern;

public class Pattern10
{
    public static void main(String[] args)
    {
        /*
            12
            1234
            123456
            12345678
        */
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=2*i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
