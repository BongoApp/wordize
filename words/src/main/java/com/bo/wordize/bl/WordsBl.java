package com.bo.wordize.bl;

import com.bo.wordize.dto.WordsDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordsBl {
    public List<WordsDto> wordsDtoList = new ArrayList<>();

    public WordsDto createNewWord(WordsDto wordsDto) {
        wordsDtoList.add(wordsDto);
        return wordsDto;
    }

    public void deleteWord(String title) {
        for (int i = 0; i < wordsDtoList.size(); i++) {
            if (wordsDtoList.get(i).getTitle().equals(title)) {
                wordsDtoList.remove(i);
                break;
            }
        }
    }

    public List<WordsDto> getWords() {
        return wordsDtoList;
    }
}
