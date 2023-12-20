package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       CalculatorDiscount calculatorDiscount = new CalculatorDiscount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите цену товара: ");
        double price = sc.nextDouble();
        System.out.println("Введите скидку на товар: ");
        double discount = sc.nextDouble();
        System.out.println("цена товара со скидкой равна: " + calculatorDiscount.calculatorDiscount(price, discount));
    }
}