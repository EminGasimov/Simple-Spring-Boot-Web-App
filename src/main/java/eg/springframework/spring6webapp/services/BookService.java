package eg.springframework.spring6webapp.services;

import eg.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
