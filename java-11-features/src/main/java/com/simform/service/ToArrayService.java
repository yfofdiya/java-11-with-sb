package com.simform.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ToArrayService {

    public void toArrayMethodDemo(String string1, String string2) {
        List<String> list = Arrays.asList(string1, string2);
        Object[] arr = list.toArray();
        for(Object str: arr) {
            System.out.println(str);
        }
    }
}
