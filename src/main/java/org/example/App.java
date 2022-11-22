package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = "";

        System.out.print( "Enter sentence: " );
        try {
             sentence = reader.readLine();
        } catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

        System.out.print("Number of words: ");
        System.out.println(WordUtils.numberOfWords(sentence));
        System.out.print("The shortest word: ");
        List<String> listOfWords = Arrays.asList(sentence.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "").split(" "));
        System.out.println(WordUtils.getShortestWord(listOfWords));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(5);
        System.out.print("Sum of numbers: ");
        System.out.println(NumberUtils.getSum(numbers));
        System.out.print("Odd numbers * 2: ");
        System.out.println(NumberUtils.multiplyOddNumber(numbers));
    }
}
