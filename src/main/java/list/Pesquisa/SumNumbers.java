package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class SumNumbers {

    private List<Integer> numbers;

    public SumNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number){
        this.numbers.add(number);
    }

    public int sumCalc(){
        int sum = 0;
        for (Integer number : numbers)
            sum += number;
        return sum;
    }

    public int findGreaterNumber(){
        int greaterNumber = Integer.MIN_VALUE;
        if(!numbers.isEmpty()){
            for(Integer number : numbers){
                if (number >= greaterNumber){
                    greaterNumber = number;
                }
            }
            return greaterNumber;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public int findSmallestNumber(){
        int smallerNumber = Integer.MAX_VALUE;
        if(!numbers.isEmpty()){
            for(Integer number : numbers){
                if (number <= smallerNumber){
                    smallerNumber = number;
                }
            }
            return smallerNumber;
        } else {
            throw new RuntimeException("The list is empty!");
        }
    }

    public void showNumbers(){
        if(!numbers.isEmpty()){
            System.out.println(this.numbers);
        } else {
            System.out.println("The list is empty!");
        }
    }



}
