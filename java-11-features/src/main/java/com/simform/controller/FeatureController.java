package com.simform.controller;

import com.simform.helper.Response;
import com.simform.service.FileService;
import com.simform.service.NotPredicateService;
import com.simform.service.StringService;
import com.simform.service.ToArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/features")
public class FeatureController {

    @Autowired
    private StringService stringService;

    @Autowired
    private FileService fileService;

    @Autowired
    private ToArrayService toArrayService;

    @Autowired
    private NotPredicateService notPredicateService;

    @GetMapping("/string-methods")
    public ResponseEntity<Response> newStringMethodsDemo() {

        stringService.repeatDemo();
        stringService.stripDemo();
        stringService.stripLeadingDemo();
        stringService.stripTrailingDemo();
        stringService.isBlankDemo();
        stringService.linesDemo();

        Response response = new Response("Check Console", "Success");

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/read-file")
    public ResponseEntity<Response> newReadFileDemo() throws IOException {
        fileService.readFile();
        Response response = new Response("File read operation is successful", "Success");
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/write-file")
    public ResponseEntity<Response> newWriteToFileDemo() throws IOException {
        fileService.writeToFile();
        Response response = new Response("File write operation is successful", "Success");
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/to-array-demo/{string1}/{string2}")
    public ResponseEntity<Response> newToArrayDemo(@PathVariable String string1, @PathVariable String string2) {
        toArrayService.toArrayMethodDemo(string1, string2);
        Response response = new Response("List of String is converted to Array", "Success");
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/not-predicate/{string1}/{string2}")
    public ResponseEntity<Response> newNotPredicateDemo(@PathVariable String string1, @PathVariable String string2) {
        notPredicateService.notPredicateMethodDemo(string1, string2);
        Response response = new Response("Not Predicate demo works", "Success");
        return ResponseEntity.ok().body(response);
    }
}
