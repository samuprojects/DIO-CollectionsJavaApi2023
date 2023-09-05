package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> listItem;

    public ShoppingCart() {
        this.listItem = new ArrayList<>();
    }

    public void addItem(String name, double price, int amount){
        Item item = new Item(name, price, amount);
        this.listItem.add(item);
    }

    public void removeItem(String name){
        List<Item> itemToRemove = new ArrayList<>();
        if (!listItem.isEmpty()){
            for (Item i : listItem) {
                if(i.name().equalsIgnoreCase(name)){
                    itemToRemove.add(i);
                }
            }
            listItem.removeAll(itemToRemove);
        } else {
            System.out.println("The list is empty!");
        }
    }

    public double CalcTotalValue(){
        double totalValue = 0;
        if (!listItem.isEmpty()) {
            for (Item item : listItem) {
                double itemValue = item.price() * (item.amount());
                totalValue += itemValue; //totalValue = totalValue + itemValue;
            }
            return totalValue;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void showItems(){
        if (!listItem.isEmpty()){
            System.out.println(this.listItem);
        } else {
            System.out.println("The list is empty!");
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "Items=" + listItem +
                '}';
    }
}
