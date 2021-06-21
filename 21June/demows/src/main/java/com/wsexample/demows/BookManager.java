package com.wsexample.demows;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookManager {

    @GetMapping("/getdata")
    public Book gdata(@RequestParam(value = "title", defaultValue = "Fish") String title,
                        @RequestParam(value = "publisher", defaultValue = "me") String publisher){
        Author author = new Author("me", 20);
        return new Book(title, publisher, author);
    }

    @PostMapping("/adddata")
    public void gdata(@RequestBody Book book){
        System.out.println(book);
    }
    
}
