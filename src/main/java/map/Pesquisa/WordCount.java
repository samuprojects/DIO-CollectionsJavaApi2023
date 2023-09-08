package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ALL")
public class WordCount {

    private Map<String, Integer> words;

    public WordCount() {
        this.words = new HashMap<>();
    }

    public void addWords(String language, Integer count) {
        words.put(language, count);
    }

    public void removeWord(String word) {
        if (!words.isEmpty()) {
            words.remove(word);
        } else {
            System.out.println("The Map is empty.");
        }
    }

    public int showWordCount() {
        int countTotal = 0;
        for (int count : words.values()) {
            countTotal += count;
        }
        return countTotal;
    }

    public String findMostFrequentWords() {
        String languageMostFrequent = null;
        int highestCount = 0;
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
                languageMostFrequent = entry.getKey();
            }
        }
        return languageMostFrequent;
    }

    public static void main(String[] args) {
        WordCount countLanguages = new WordCount();

        countLanguages.addWords("Java", 2);
        countLanguages.addWords("Python", 8);
        countLanguages.addWords("JavaScript", 1);
        countLanguages.addWords("C#", 6);

        System.out.println("There are " + countLanguages.showWordCount() + " palavras.");

        String linguagemMaisFrequente = countLanguages.findMostFrequentWords();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}