package com.kodilla.good.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    final String name;
    final Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = new Library(this.name);

        for (Book book : this.books) {
            Book clonedBook = new Book(
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublicationDate()
            );
            clonedLibrary.getBooks().add(clonedBook);
        }

        return clonedLibrary;
    }
}
