package org.example;

import java.util.Random;

public class Product
{
    //region Fields
    public double price;
    public double quantity;
    public double weight;
    public boolean isPresent = true;
    public boolean isAbsnt = false;
    //endregion

    //region Getter&Setter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuontity() {
        return quantity;
    }

    public void setQuontity(double quontity) {
        this.quantity = quontity;
    }

    public double getWieght() {
        return weight;
    }

    public void setWieght(double wieght) {
        this.weight = wieght;
    }
    //endregion

    //region Constructor
    public Product(double price, double quontity, double wieght) {
        this.price = price;
        this.quantity = quontity;
        this.weight = wieght;
    }
    //endregion

    /** заполнение полей товара случайными числами от 1 до 10 **/
    public static Product generateRandomProduct( )
    {
        Random random = new Random();
        int randomPrice = random.nextInt(1, 10);
        int randomQuantity =  random.nextInt(1, 10);
        int randomWeight =  random.nextInt(1, 10);

        return new Product(randomPrice, randomQuantity, randomWeight);
    }

    /** Ввыод полей товара **/
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Product {")
                .append("price=").append(price)
                .append(", quantity=").append(quantity)
                .append(", weight=").append(weight)
                .append("}");

        return sb.toString();
    }
}
