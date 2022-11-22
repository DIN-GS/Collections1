package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordUtils {
    public static int numberOfWords(String sentence){
        Set<String> list = new HashSet<>();
        String[] words = sentence.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "").split(" ");
        for (int i = 0; i < words.length; i++){
            list.add(words[i]);
        }
        return list.size();
    }

    public static String getShortestWord(List<String> words){
        int min = words.get(0).length();
        String tempWord = words.get(0);
        for (String word : words){
            if (word.length() < min){
                min = word.length();
                tempWord = word;
            }
        }
        return tempWord;
    }
}
