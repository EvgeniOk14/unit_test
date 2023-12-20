package org.example;

public class CalculatorDiscount
{
    public static double price;
    public static double diccount;
    public static double itogSum;

    public CalculatorDiscount()
    {
    }

    public static double calculatorDiscount(double price, double diccount)
    {
        if(diccount > price)
        {
            throw new ArithmeticException("скидка не может быть больше цены!");
        }
        else if (price < 0)
        {
            throw new ArithmeticException("цена на товар не может быть отрицательной!");
        }
        itogSum = price - diccount;
        return  itogSum;
    }
}
