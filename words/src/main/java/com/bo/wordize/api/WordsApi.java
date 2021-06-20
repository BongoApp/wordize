package com.bo.wordize.api;

import com.bo.wordize.bl.WordsBl;
import com.bo.wordize.dto.WordDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "words/api")
public class WordsApi {
    private final WordsBl wordsBl;
    private static final Logger LOGGER = LoggerFactory.getLogger(WordsApi.class);

    @Autowired
    public WordsApi(WordsBl wordsBl) {
        this.wordsBl = wordsBl;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public WordDto createNewWord(@RequestBody WordDto wordDto) {
        return wordsBl.createNewWord(wordDto);
    }

    @RequestMapping(value = "/delete/{idWord}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void deleteWord(@PathVariable Integer idWord) {
        wordsBl.deleteWord(idWord);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<WordDto> getListWords() {
        LOGGER.warn("All list");
        return wordsBl.getWords();
    }


}
