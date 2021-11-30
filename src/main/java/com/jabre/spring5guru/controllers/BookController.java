package com.jabre.spring5guru.controllers;

import com.jabre.spring5guru.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Jabre
 * @created : 11/30/2021, Tuesday
 **/
@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(path = "/books")
    public String getBook(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
