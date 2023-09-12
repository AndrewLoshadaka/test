package com.andrew.controller;

import com.andrew.model.CharacterFrequency;
import com.andrew.service.FrequencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restapi/getFrequency")
public class WorkController {
    private final FrequencyService frequencyService = new FrequencyService();
    @GetMapping
    public List<CharacterFrequency> getList(
            @RequestParam("input") String inputStr){
        System.out.println(frequencyService.getAnswer(inputStr));
        return frequencyService.getAnswer(inputStr);
    }
}
