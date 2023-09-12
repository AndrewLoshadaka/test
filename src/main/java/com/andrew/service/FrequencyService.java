package com.andrew.service;

import com.andrew.model.CharacterFrequency;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class FrequencyService {

    public List<CharacterFrequency> getAnswer(String str){
        Map<Character, Integer> frequenciesMap = new HashMap<>();

        for(char c : str.toCharArray()){
            frequenciesMap.put(c, frequenciesMap.getOrDefault(c, 0) + 1);
        }

        return frequenciesMap.entrySet().stream()
                .map(entry -> new CharacterFrequency(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingInt(CharacterFrequency::getFrequency).reversed())
                .collect(Collectors.toList());
    }
}
