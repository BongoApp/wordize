package com.bo.wordize.model;

public class HelloWorld {
    private String text;

    public HelloWorld(String text) {
        this.text = text;
    }

    public HelloWorld() {
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "text='" + text + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
