package org.example;

import java.util.Scanner;

public class RootExtraction
{
        public static double sqrtOfNumber(double number)
        {
            if (number < 0)
            {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(number);
        }


        public static void main(String[] args)
        {
            System.out.println("Введите число N:");
            Scanner scanner = new Scanner(System.in);
            double number = scanner.nextDouble();
            RootExtraction rootExtraction = new RootExtraction();
            System.out.println(rootExtraction.sqrtOfNumber(number));
        }
}

