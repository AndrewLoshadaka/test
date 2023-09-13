package com.andrew.controller;

import com.andrew.model.CharacterFrequency;
import com.andrew.service.FrequencyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WorkControllerTest {

    private WorkController workController;

    @Mock
    private FrequencyService frequencyService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        workController = new WorkController(frequencyService);
    }

    @Test
    void testGetList() {
        String inputStr = "test input";
        List<CharacterFrequency> expectedResponse = new ArrayList<>();
        expectedResponse.add(new CharacterFrequency('t', 3));
        expectedResponse.add(new CharacterFrequency(' ', 1));
        expectedResponse.add(new CharacterFrequency('p', 1));
        expectedResponse.add(new CharacterFrequency('s', 1));
        expectedResponse.add(new CharacterFrequency('e', 1));
        expectedResponse.add(new CharacterFrequency('u', 1));
        expectedResponse.add(new CharacterFrequency('i', 1));
        expectedResponse.add(new CharacterFrequency('n', 1));

        expectedResponse.sort(Comparator.comparingInt(CharacterFrequency::getFrequency).reversed());

        when(frequencyService.getAnswer(inputStr)).thenReturn(expectedResponse);

        List<CharacterFrequency> actualResponse = workController.getList(inputStr);
        for (int i = 0; i < actualResponse.size(); i++) {
            assertEquals(expectedResponse.get(i).getSymbol(), actualResponse.get(i).getSymbol());
            assertEquals(expectedResponse.get(i).getFrequency(), actualResponse.get(i).getFrequency());
        }


    }
}
