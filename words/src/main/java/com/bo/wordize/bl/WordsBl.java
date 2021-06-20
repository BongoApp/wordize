package com.bo.wordize.bl;

import com.bo.wordize.dao.WordsDao;
import com.bo.wordize.dto.WordDto;
import com.bo.wordize.model.Word;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class WordsBl {
    public List<WordDto> wordDtoList = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(WordsBl.class);

    private WordsDao wordsDao;

    @Autowired
    public WordsBl(WordsDao wordsDao) {
        this.wordsDao = wordsDao;
    }

    public WordDto createNewWord(WordDto wordDto) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        wordDto.setCreatedAt(date);
        wordDto.setModifiedAt(date);
        wordsDao.createNewWord(new Word(wordDto.getTitle(), wordDto.getContent(), 1, wordDto.getCreatedAt(), wordDto.getModifiedAt(), 1));
        wordDto.setIdWord(wordsDao.getLastInsertId());
        LOGGER.warn(wordDto.toString());
        return wordDto;
    }

    public void deleteWord(Integer idWord) {
        wordsDao.deleteWord(idWord);
//            throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Item not found");
    }

    public List<WordDto> getWords() {
        List<WordDto> wordDtos = new ArrayList<>();
        List<Word> words = wordsDao.getListWords();
        words.forEach(word -> {
            if (word.getStatus().equals(1))
                wordDtos.add(new WordDto(word.getIdWord(), word.getTitle(), word.getContent(), word.getCreatedAt(), word.getModifiedAt()));
        });
        return wordDtos;
    }
}
