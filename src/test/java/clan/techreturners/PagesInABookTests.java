package clan.techreturners;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagesInABookTests {
    @ParameterizedTest(name = "{index}) For summary {0}, the book has {1} pages")
    @CsvSource({"15,12", "31,20"})
    void checkGetPagesInABook(Integer summary, Integer expectedValue) {
        // Arrange
        // @CsvSource is doing the Arrange, as it is injecting the testing values as parameters

        // Act
        int pagesInABook = PagesInABook.getPagesInABook(summary);

        // Assert
        assertEquals(expectedValue, pagesInABook);
    }
}
