/*
   8. Write a program to generate Arithmetic Exception.
   ------------------------------------------------------
 */

package JALA_Technologies_08;

public class ArithmeticException_Demo
{
    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }
}