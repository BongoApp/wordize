package com.bo.wordize.dto;

import java.util.Date;

public class WordDto {
    private Integer idWord;
    private String title;
    private String content;
    private Date createdAt;
    private Date modifiedAt;

    public WordDto(Integer idWord, String title, String content, Date createdAt, Date modifiedAt) {
        this.idWord = idWord;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public WordDto() {
    }

    @Override
    public String toString() {
        return "WordsDto{" +
                "idWord=" + idWord +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                '}';
    }

    public Integer getIdWord() {
        return idWord;
    }

    public void setIdWord(Integer idWord) {
        this.idWord = idWord;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
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
