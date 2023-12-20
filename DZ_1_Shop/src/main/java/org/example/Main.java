package org.example;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        FillShopByProducts fillShopByProducts = new FillShopByProducts();
        List<Product> productList = fillShopByProducts.fillShopByProducts();
        Shop shop =  new Shop(productList);

        System.out.println("Самый дорогой продукт это: " + shop.getMostExpensiveProduct());

        System.out.println("Отсортированный список по цене: " + shop.sortProductByPrice());
    }
}