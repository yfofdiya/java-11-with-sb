package com.simform.service;

import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class StringService {

    public void repeatDemo() {
        String str = "Java 11 ".repeat(5) + "Features";
        System.out.println("Repeat Demo : " + str);
    }

    public void stripDemo() {
        String str = "\n\t  Strip      ".strip();
        System.out.println("Strip Demo : " + str);
    }

    public void stripLeadingDemo() {
        String str = "     StripLeading      ".stripLeading();
        System.out.println("StripLeading : " + str);
    }

    public void stripTrailingDemo() {
        String str = "   StripTrailing      ".stripTrailing();
        System.out.println("StripTrailing : " + str);
    }

    public void isBlankDemo() {
        String str1 = "     ";
        String str2 = "";
        System.out.println("Is Blank " + str1.isBlank());
        System.out.println("Is Blank " + str2.isBlank());
    }

    public void linesDemo() {
        String str = "This is \na \rmultiline \nstring";
        Stream<String> lines = str.lines();
        lines.forEach(System.out::println);
    }
}
