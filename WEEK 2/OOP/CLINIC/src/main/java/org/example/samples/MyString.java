package org.example.samples;

public class MyString {
    private String word;


    @Override
    public String toString() {
        return "MyString{" +
                "word='" + word + '\'' +
                '}';
    }

    public MyString(String word) {
        this.word = word;
    }


    public MyString() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
