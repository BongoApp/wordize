package com.bo.wordize.dao;

import com.bo.wordize.model.Word;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WordsDao {

    void createNewWord(Word word);

    List<Word> getListWords();

    void deleteWord(Integer idWord);

    Integer getLastInsertId();
}
