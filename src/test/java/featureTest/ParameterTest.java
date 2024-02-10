package featureTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterTest {

    @Test
    @ParameterizedTest
    @ValueSource(strings = {"", "abc", "123", " ", "\t", "\n"})
    void testStringLengthBoundary(String input) {
        // Граничные проверки для строки
        assertNotNull(input, "Строка не должна быть null");
        assertTrue(input.length() <= 255, "Длина строки не должна превышать 255 символов");
    }

}
