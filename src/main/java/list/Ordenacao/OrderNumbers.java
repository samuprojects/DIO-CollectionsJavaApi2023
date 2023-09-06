package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("ALL")
public class OrderNumbers {

    private List<Integer> numbersList;

    public OrderNumbers() {
        this.numbersList = new ArrayList<>();
    }

    public void addNumber(int number){
        this.numbersList.add(number);
    }

    public List<Integer> AscendingOrder(){
        List<Integer> ascendingNumber = new ArrayList<>(this.numbersList);
        if (!numbersList.isEmpty()){
            Collections.sort(ascendingNumber);
            return ascendingNumber;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public List<Integer> DescendingOrder(){
        List<Integer> ascendingNumber = new ArrayList<>(this.numbersList);
        if (!numbersList.isEmpty()){
            ascendingNumber.sort(Collections.reverseOrder());
            return ascendingNumber;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void showNumbers(){
        if (!numbersList.isEmpty()){
            System.out.println(this.numbersList);
        } else{
            System.out.println("The list is empty!");
        }
    }
}
