package com.bo.wordize.dto;

public class WordsDto {
    private String title;
    private String content;

    public WordsDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public WordsDto() {
    }

    @Override
    public String toString() {
        return "Words{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
