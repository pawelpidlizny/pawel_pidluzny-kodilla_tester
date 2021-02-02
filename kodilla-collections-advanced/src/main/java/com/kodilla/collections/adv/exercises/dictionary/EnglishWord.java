package com.kodilla.collections.adv.exercises.dictionary;

import java.util.Objects;

public class EnglishWord {
    private final PartOfSpeech partOfSpeech;
    private final String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
        this.word = word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnglishWord that = (EnglishWord) o;

        if (partOfSpeech != that.partOfSpeech) return false;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        int result = partOfSpeech != null ? partOfSpeech.hashCode() : 0;
        result = 31 * result + (word != null ? word.hashCode() : 0);
        return result;
    }
}
