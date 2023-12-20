package org.example;

import java.util.Scanner;

public class Devision
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите превое число a:");
        int a = sc.nextInt();
        System.out.println("Введите второе число b:");
        int b = sc.nextInt();

        try
        {
            devisionByZero(a, b);
        }
        catch (ArithmeticException e)
        {
         e.printStackTrace();
        }
    }
    public static void devisionByZero(int a, int b)
    {
        if(b != 0)
        {
            int result = a / b;
            System.out.println(result);
        }
        else
        {
            throw new ArithmeticException("На ноль делить нельзя! ");
        }
    }
}
