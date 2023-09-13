package com.andrew.service;

import com.andrew.model.CharacterFrequency;
import com.andrew.service.FrequencyService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyServiceTest {

    @Test
    public void testGetAnswer() {
        FrequencyService frequencyService = new FrequencyService();
        String input = "hello world";
        List<CharacterFrequency> result = frequencyService.getAnswer(input);
        assertNotNull(result);

        //assertEquals(9, result.size());
        assertEquals('l', result.get(0).getSymbol());
        assertEquals(3, result.get(0).getFrequency());
        assertEquals('o', result.get(1).getSymbol());
        assertEquals(2, result.get(1).getFrequency());
    }
}