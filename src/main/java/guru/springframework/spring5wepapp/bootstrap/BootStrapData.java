package guru.springframework.spring5wepapp.bootstrap;

import guru.springframework.spring5wepapp.domain.Author;
import guru.springframework.spring5wepapp.domain.Book;
import guru.springframework.spring5wepapp.domain.Publisher;
import guru.springframework.spring5wepapp.repositories.AuthorRepository;
import guru.springframework.spring5wepapp.repositories.BookRepository;
import guru.springframework.spring5wepapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design", "2134564654654");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development", "1454454455555");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        Publisher pub = new Publisher();
        pub.setFirstname("nikos");
        pub.setLastname("korobos");

        ddd.setPublisher(pub);
        pub.getBooks().add(ddd);

        noEJB.setPublisher(pub);
        pub.getBooks().add(noEJB);
        publisherRepository.save(pub);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + pub.getBooks().size());
        System.out.println("Publisher: " + publisherRepository.count());
    }
}
