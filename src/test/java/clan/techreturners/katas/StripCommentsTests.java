package clan.techreturners.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StripCommentsTests {
    @Test
    void checkGetStrip() {
        // Arrange
        String string = "Comment !word stripped\nsame here\ntomato, avocado # and tangerine";
        String[] markers = new String[]{"!","#"};
        String expectedOutput = "Comment\nsame here\ntomato, avocado";

        // Act
        String strip = StripComments.getStrip(string, markers);

        // Assert
        assertEquals(expectedOutput, strip);
    }
}
