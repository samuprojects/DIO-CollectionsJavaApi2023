package main.java.list.Ordenacao;

public class OrderNumbersApp {

    public static void main(String[] args) {

        OrderNumbers numbers = new OrderNumbers();

        numbers.addNumber(3);
        numbers.addNumber(4);
        numbers.addNumber(1);
        numbers.addNumber(2);
        numbers.addNumber(55);

        numbers.showNumbers();

        System.out.println(numbers.AscendingOrder());

        numbers.showNumbers();

        System.out.println(numbers.DescendingOrder());

        numbers.showNumbers();
    }
}
