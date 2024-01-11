package com.pattern;

public class Pattern16
{
    public static void main(String[] args)
    {
/*
        a
        bb
        ccc
        dddd
        eeeee
*/

        for (char i='a';i<='e';i++)
        {
            for (char j='a';j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
