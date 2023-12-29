package eg.springframework.spring6webapp.services;

import eg.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
