package com.simform.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class NotPredicateService {

    public void notPredicateMethodDemo(String string1, String string2) {
        List<String> list = Arrays.asList(string1, "\n \n", string2, " ");
        List<String> withoutBlanks = list.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        withoutBlanks.forEach(System.out::print);
    }
}
