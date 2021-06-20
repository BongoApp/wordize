package com.bo.wordize.model;

import java.util.Date;

public class Word {
    private Integer idWord;
    private String title;
    private String content;
    private Integer idUser;
    private Date createdAt;
    private Date modifiedAt;
    private Integer status;

    public Word(Integer idWord, String title, String content, Integer idUser, Date createdAt, Date modifiedAt, Integer status) {
        this.idWord = idWord;
        this.title = title;
        this.content = content;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.status = status;
    }

    public Word(String title, String content, Integer idUser, Date createdAt, Date modifiedAt, Integer status) {
        this.title = title;
        this.content = content;
        this.idUser = idUser;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.status = status;
    }

    public Word() {
    }

    @Override
    public String toString() {
        return "Word{" +
                "idWord=" + idWord +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", idUser='" + idUser + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", status=" + status +
                '}';
    }

    public Integer getIdWord() {
        return idWord;
    }

    public void setIdWord(Integer idWord) {
        this.idWord = idWord;
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

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
