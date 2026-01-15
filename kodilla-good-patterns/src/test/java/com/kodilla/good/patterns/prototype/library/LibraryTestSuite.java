package com.kodilla.good.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        // Given
        Library library = new Library("Main library");

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1916, 1, 1));
        Book book2 = new Book("Pan Tadeusz", "Adam Mickiewicz", LocalDate.of(1835, 1, 1));
        Book book3 = new Book("Lalka", "Bolesław Prus", LocalDate.of(1894, 1, 1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        // When
        Library shallowClonedLibrary = library.shallowCopy();
        Library deepClonedLibrary = library.deepCopy();

        shallowClonedLibrary.getBooks().remove(book1);

        // Then
        assertEquals(2, library.getBooks().size());
        assertEquals(2, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

        assertSame(library.getBooks(), shallowClonedLibrary.getBooks());
        assertNotSame(library.getBooks(), deepClonedLibrary.getBooks());
    }
}