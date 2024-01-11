package com.pattern;

public class Pattern15
{
    public static void main(String[] args)
    {
/*

        a
        ab
        abc
        abcd
        abcde

*/
    /*    for (char i = 'a'; i<='e';i++)
        {
            for (char j='a';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    */
      for (int i=1;i<=5;i++)
      {
          for (int j=1;j<=i;j++)
          {
              System.out.print((char)(96+j));
          }
          System.out.println(" ");
      }

    }
}
