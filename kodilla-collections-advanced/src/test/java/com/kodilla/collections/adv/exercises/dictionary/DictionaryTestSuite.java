package com.kodilla.collections.adv.exercises.dictionary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        // given dajesz wartosci
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        //when akcja która bedzie sie działa w tescie
        dictionary.addWord(polishWord,englishWord);
        //then oczekiwany rezultata testu
        Assertions.assertEquals(1, dictionary.size());
    }
    @Test
    public void testFindEnglishWord(){
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));
        // when
        List<EnglishWord> result = dictionary.findEnglishWord("gra");
        // then
        List<EnglishWord>expectedList= new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"game"));
        Assertions.assertEquals(expectedList,result);
    }
    @Test
    public void testFindEnlishWords_withPartOfSpeech(){
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.VERB,"take"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));
        // when
        List<EnglishWord>result = dictionary.findEnglishWords("brać",PartOfSpeech.NOUN);
        //then
        List<EnglishWord> expectedList= new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        Assertions.assertEquals(expectedList,result);

    }

}