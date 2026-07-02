//Exercise 1

// package com.library.repository;

// public class BookRepository {

//     public void display() {
//         System.out.println("Book Repository Initialized");
//     }

// }

//Exercise 2

// package com.library.repository;

// public class BookRepository {

//     public void saveBook() {
//         System.out.println("Book saved in Repository");
//     }
// }

//Exercise 6

package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void saveBook() {
        System.out.println("Book saved in Repository");
    }
}