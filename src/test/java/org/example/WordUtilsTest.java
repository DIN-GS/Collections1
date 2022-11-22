package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilsTest {

    private static String sentence;
    private static List<String> words;

    @BeforeAll
    public static void initialize(){
        sentence = "Hello World!";
        words =  Arrays.asList(sentence.replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "").split(" "));
    }

    @Test
    void numberOfWords() {
        assertEquals(2, WordUtils.numberOfWords(sentence));
    }

    @Test
    void getShortestWord() {
        assertEquals("Hello", WordUtils.getShortestWord(words));
    }
}