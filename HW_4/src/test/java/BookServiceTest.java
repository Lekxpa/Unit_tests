import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BookServiceTest {
    /*
    У вас есть класс BookService, который использует интерфейс BookRepository
    для получения информации о книгах из базы данных. Ваша задача написать unit-тесты
    для BookService, используя Mockito для создания мок-объекта BookRepository.
     */

    BookRepository bookRepository;
    BookService bookService;


    @BeforeEach
    void setUp(){

        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);

    }

    @Test
    public void findBookByIdTest(){

        String bookId = "1";
        Book book = new Book("1", "Book1", "Author1");

        when(bookRepository.findById(bookId)).thenReturn(book);

        Book findbook = bookService.findBookById(bookId);

        assertEquals(book, findbook);

    }

    @Test
    public void findAllBooksTest(){

        List<Book> bookLst = new ArrayList<>();
        bookLst.add(new Book("1", "Book1", "Author1"));
        bookLst.add(new Book("2", "Book2", "Author2"));

        when(bookRepository.findAll()).thenReturn(bookLst);

        List<Book> actualBooksLst = bookService.findAllBooks();

//        assertThat(actualBooksLst).isEqualTo(bookLst);
        assertEquals(actualBooksLst, bookLst);
    }
}
