import org.junit.jupiter.api.Test;

import java.time.DateTimeException;

import static org.junit.jupiter.api.Assertions.*;

class DayFinderTest {

    @Test
    void shouldGiveValidAnswer() {
        //given
            int day = 21;
            int month = 3;
            int year = 2023;
            String expectedValue = "TUESDAY";
        //when
            String actualValue = DayFinder.findDay(month,day,year);
        //then
            assertEquals(expectedValue,actualValue);
    }
    @Test
    void shouldGiveZeroAnswer() {
        //given
        int day = 21;
        int month = 3;
        int year = 3031;
        String expectedValue = "0";
        //when
        String actualValue = DayFinder.findDay(month,day,year);
        //then
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void shouldGiveDataTimeException() {
        //given
        int day = 21;
        int month = 13;
        int year = 2023;

        assertThrows(DateTimeException.class,() -> DayFinder.findDay(month,day,year));
    }
}