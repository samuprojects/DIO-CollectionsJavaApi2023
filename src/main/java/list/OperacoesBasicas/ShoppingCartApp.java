package main.java.list.OperacoesBasicas;

public class ShoppingCartApp {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Book", 10.0, 2);
        shoppingCart.addItem("Pencil", 1.0, 1);
        shoppingCart.addItem("Pen", 1.1, 3);
        shoppingCart.addItem("Eraser", 2.0, 2);

        shoppingCart.showItems();

        shoppingCart.removeItem("Pencil");

        shoppingCart.showItems();

        System.out.println("The total purchase amount is = " + shoppingCart.CalcTotalValue());
    }
}
