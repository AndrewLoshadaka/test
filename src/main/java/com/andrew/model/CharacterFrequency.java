package com.andrew.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CharacterFrequency {
    private char symbol;
    private int frequency;
}
