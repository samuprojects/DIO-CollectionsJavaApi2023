package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class UniqueWordSet {
    private Set<String> uniqueWordsSet;

    public UniqueWordSet() {
        this.uniqueWordsSet = new HashSet<>();
    }

    public void addWord (String word){
        uniqueWordsSet.add(word);
    }

    public void removeWord(String word) {
        if (!uniqueWordsSet.isEmpty()) {
            if (uniqueWordsSet.contains(word)) {
                uniqueWordsSet.remove(word);
            } else {
                System.out.println("Word not found in the set!");
            }
        } else {
            System.out.println("The set is empty!");
        }
    }

    public boolean checkWord(String word){
        return uniqueWordsSet.contains(word);
    }

    public void showUniqueWord(){
        if(!uniqueWordsSet.isEmpty()){
            System.out.println(uniqueWordsSet);
        } else{
            System.out.println("The set is empty!");
        }
    }

    public static void main(String[] args) {

        UniqueWordSet uniqueWord = new UniqueWordSet();

        uniqueWord.addWord("Java");
        uniqueWord.addWord("Spring Boot");
        uniqueWord.addWord("Quarkus");
        uniqueWord.addWord("Kubernetes");
        uniqueWord.addWord("Jakarta");
        uniqueWord.addWord("Cobol");

        uniqueWord.showUniqueWord();

        uniqueWord.removeWord("Cobol");
        uniqueWord.showUniqueWord();

        uniqueWord.removeWord("Test");

        System.out.println("A linguagem 'Java' está no conjunto? " + uniqueWord.checkWord("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + uniqueWord.checkWord("Cobol"));

        uniqueWord.showUniqueWord();
    }
}
