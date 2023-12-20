package org.example;

import java.util.ArrayList;
import java.util.List;

public class FillShopByProducts
{
    /** Выведение часто повторяющегося участка кода в отдельный метод в отдельном классе
     * ( создание товаров,заполнение полей товаров, заполнение магазина товарами) **/
    public List<Product> fillShopByProducts()
    {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            Product randomProduct = Product.generateRandomProduct();
            productList.add(randomProduct);
            System.out.println("Случайный продукт: " + randomProduct.toString());
        }
        System.out.println("Список продуктов: " + productList.toString());
        return productList;
    }
}
