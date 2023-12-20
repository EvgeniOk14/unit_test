package org.example;

import java.util.*;
import java.util.Collections;

public class Shop
{
    //region Fields
    public List<Product> productList = new ArrayList<>();
    //endregion
    //region Constructor
    public Shop(List<Product> productList)
    {
        this.productList = productList;
    }
    //endregion

    //region Getter&Setter
    public List<Product> getProductList()
    {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    //endregion
    /**
     * нахождение продукта с максимальной ценой
     **/
    public Optional<Product> getMostExpensiveProduct()
    {

             return this.productList.stream().max(Comparator.comparing(Product::getPrice));

    }
    /** сортировке продуктов по стоимости **/
    public List<Product> sortProductByPrice()
    {
         Collections.sort(this.productList, Comparator.comparing(Product::getPrice).reversed());
         return this.productList;
    }
}
