package main.java.list.Pesquisa;

public class SumNumbersApp {

    public static void main(String[] args) {

        SumNumbers sumNumbers = new SumNumbers();

        sumNumbers.addNumber(1);
        sumNumbers.addNumber(2);
        sumNumbers.addNumber(10);
        sumNumbers.addNumber(-4);
        sumNumbers.addNumber(1);

        System.out.println("Numbers add:");
        sumNumbers.showNumbers();

        System.out.println("Sum numbers = " + sumNumbers.sumCalc());

        System.out.println("Higher Number = " + sumNumbers.findGreaterNumber());

        System.out.println("Smaller Number = " + sumNumbers.findSmallestNumber());
    }
}
