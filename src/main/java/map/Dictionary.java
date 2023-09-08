package main.java.map;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ALL")
public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition){
        dictionary.put(word,definition);
    }

    public void removeWord(String word){
        if (!dictionary.isEmpty()){
            dictionary.remove(word);
        } else {
            System.out.println("The dictionary is empty.");
        }
    }

    public String searchByWord(String word){
        String definition = dictionary.get(word);
        if (definition != null){
            return definition;
        }
        return "Language not found in dictionary.";
    }

    public void showWords(){
        if ((!dictionary.isEmpty())){
            System.out.println(dictionary);
        } else {
            System.out.println("The dictionary is empty.");
        }
    }

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();

        dictionary.addWord("java", "Object-oriented programming language.");
        dictionary.addWord("typescript", "JavaScript language superset that adds static typing.");
        dictionary.addWord("kotlin", "Modern programming language for the JVM.");

        dictionary.showWords();

        String definitionOfJava = dictionary.searchByWord("java");
        System.out.println("Definition of language 'java': " + definitionOfJava);

        String definitionOfCSharp = dictionary.searchByWord("csharp");
        System.out.println(definitionOfCSharp);

        dictionary.removeWord("typescript");
        dictionary.showWords();
    }
}
