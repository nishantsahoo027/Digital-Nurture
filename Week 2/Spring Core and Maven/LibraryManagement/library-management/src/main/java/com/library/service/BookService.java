//Exercise 1

// package com.library.service;

// public class BookService {

//     public void display() {
//         System.out.println("Book Service Initialized");
//     }

// }

// //Exercise 2

// package com.library.service;

// import com.library.repository.BookRepository;

// public class BookService {

//     private BookRepository bookRepository;

//     // Setter Injection
//     public void setBookRepository(BookRepository bookRepository) {
//         this.bookRepository = bookRepository;
//     }

//     public void addBook() {
//         System.out.println("Book Service Called");
//         bookRepository.saveBook();
//     }
// }

//Exercise 6

// package com.library.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.library.repository.BookRepository;

// @Service
// public class BookService {

//     @Autowired
//     private BookRepository bookRepository;

//     public void addBook() {
//         System.out.println("Book Service Called");
//         bookRepository.saveBook();
//     }
// }

//Exercise 7

package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    // Constructor Injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("Book Service Called");
        bookRepository.saveBook();
    }
}
