package com.example.demo;

import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
@RequestMapping
public class ExerciseOne {

    @GetMapping(path= "/{day}/{month}/{year}")
    public Integer calcIdade(@PathVariable Integer day,
                            @PathVariable Integer month,
                            @PathVariable Integer year) {
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(year, month, day);
        return Period.between(birth, today).getYears();
    }
}

// error treatment to be implemented