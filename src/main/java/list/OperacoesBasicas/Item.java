package main.java.list.OperacoesBasicas;

public record Item(String name, double price, int amount) {

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
