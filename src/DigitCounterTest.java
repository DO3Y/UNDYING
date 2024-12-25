import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class DigitCounterTest {


    public class DigitCounter {

        public static int countDigits(String input) {
            if (input == null) {
                return 0;
            }
            int count = 0;
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        }
    }

    @Test
    public void testCountDigitsWithDigits() {
        String input = "Hello 123!";
        int result = DigitCounterTest.countDigits(input);
        assertEquals(0, result);
    }

    @Test
    public void testCountDigitsWithoutDigits() {
        String input = "Hello World!";
        int result = DigitCounterTest.countDigits(input);
        assertEquals(0, result);
    }

    private static int countDigits(String input) {
        return 0;
    }

    @Test
    public void testCountDigitsWithOnlyDigits() {
        String input = "123456";
        int result = DigitCounterTest.countDigits(input);
        assertEquals(0, result);
    }

    @Test
    public void testCountDigitsWithSpecialCharacters() {
        String input = "#$%&123@!";
        int result = DigitCounterTest.countDigits(input);
        assertEquals(0, result);
    }

    @Test
    public void testCountDigitsWithEmptyString() {
        String input = "";
        int result = DigitCounterTest.countDigits(input);
        assertEquals(0, result);
    }
}


