package service;

import entity.Item;

import java.util.List;

public class InventoryServiceImpl implements InventoryService {


    @Override
//    public Item addItem(Item item) {
//        return null;
//    }

    //Interview example to Override tricky scenario -> Using Child class return type in Impl, even when Parent class A is defined as return type in interface
    public B addItem(Item item){
        return null;
    }

    @Override
    public Item addItem(List<Item> item) {
        return null;
    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public void removeItem(int itemId) {

    }

    @Override
    public Item searchItem(int itemId) {
        return null;
    }

    @Override
    public Item searchItem(String itemName) {
        return null;
    }

    @Override
    public Item searchItem(String itemName, String color) {
        return null;
    }

    @Override
    public Item searchItem(String itemName, String color, double price) {
        return null;
    }

}
