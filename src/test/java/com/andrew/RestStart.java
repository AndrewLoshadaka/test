package com.andrew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class RestStart {
    public static void main(String[] args) throws ParseException {
        String string = "25-05-2020";
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd-MM-yyyy");
        Date docDate= format.parse(string);

        System.out.println(docDate.getTime());
        SpringApplication.run(RestStart.class, args);
    }
}
