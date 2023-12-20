package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ShopTest
{
    /** тест на то, что: 1) возвращаемый продукт не должен быть равным Null
                        2) возвращенный продукт является самым дорогим продуктом в списке
     **/
    @Test
    void getMostExpensiveProduct()
    {
        FillShopByProducts fillShopByProducts = new FillShopByProducts();
        List<Product> productList = fillShopByProducts.fillShopByProducts();
        Shop shop =  new Shop(productList);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct().get();
        System.out.println("Самый дорогой продукт: " + mostExpensiveProduct);

        // 1) проверка на то, что возвращаемый продукт не должен быть равным Null
        assertNotNull(mostExpensiveProduct, "возвращаемый продукт не должен быть равным Null");

        // 2) тест на то, что возвращенный продукт является самым дорогим продуктом в списке
        assertTrue(productList.isEmpty() || mostExpensiveProduct.getPrice() >= Collections.max(productList,
                Comparator.comparing(Product::getPrice)).getPrice(),
                "Возвращенный продукт должен быть самым дорогим в списке");
    }

    /** тест на то что в магазине содержаться нужные продукты **/
    @Test
    void sortProductByPrice()
    {
        FillShopByProducts fillShopByProducts = new FillShopByProducts();
        List<Product> productList = fillShopByProducts.fillShopByProducts();
        Shop shop =  new Shop(productList);
        List<Product> expectedProducts = shop.sortProductByPrice();
        // тест на то что в магазине содержаться нужные продукты
        assertTrue(shop.getProductList().containsAll(expectedProducts));
    }

    /** тест на размер списка (т.е. на количество товаров в магазине) **/
    @Test
    void getProductsList()
    {
        FillShopByProducts fillShopByProducts = new FillShopByProducts();
        List<Product> productList = fillShopByProducts.fillShopByProducts();
        Shop shop =  new Shop(productList);

        List<Product> expectedProducts = shop.sortProductByPrice();
        // тест на размер списка (т.е. на количество товаров в магазине)
        assertEquals(expectedProducts.size(), shop.getProductList().size());
    }

}