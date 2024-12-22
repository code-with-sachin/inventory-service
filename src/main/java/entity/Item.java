package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    //This is encapsulation.. we are not providing constructors here but just Getters and setters for private fields

    @Id
    private int itemId;
    private String name;
    private int quantity;
    private double price;
    private String color;
    private String weight;

    //Getters and setters

    public int getItemId() { return itemId; }

    public void setItemId(int itemId) { this.itemId = itemId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getWeight() { return weight; }

    public void setWeight(String weight) { this.weight = weight; }

}
