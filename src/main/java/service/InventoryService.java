package service;

import entity.Item;

import java.util.List;

public interface InventoryService {

    //Below are examples of Method Overloading
    public Item addItem(Item item);

    public Item addItem(List<Item> item);

    public void removeItem(Item item);

    public void removeItem(int itemId);

    public Item searchItem(int itemId);

    public Item searchItem(String itemName);

    public Item searchItem(String itemName, String color);

    public Item searchItem(String itemName, String color, double price);
}
