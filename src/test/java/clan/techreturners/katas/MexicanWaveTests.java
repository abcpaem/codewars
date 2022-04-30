package clan.techreturners.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MexicanWaveTests {
    @Test
    void checkMexicanWave() {
        // Arrange
        String stringToWave = "wave me!";
        String[] expectedWave = new String[]{"Wave me!", "wAve me!", "waVe me!", "wavE me!", "wave Me!", "wave mE!"};

        // Act
        String[] wave = MexicanWave.getWave(stringToWave);

        // Arrange
        assertArrayEquals(expectedWave, wave);
    }
}
