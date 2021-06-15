package com.bo.wordize;

import com.bo.wordize.model.Word;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class WordizeApplicationTests {

    @Test
    void contextLoads() {
        Word word = null;
        Assert.isNull(word);
    }

}
