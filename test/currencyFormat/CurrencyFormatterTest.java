import org.junit.jupiter.api.Test;
import currencyFormat.CurrencyFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyFormatterTest {


    @Test
    void shouldGiveCorrectCurrencyFormattingOutput(){
        //given
        Double payment = 12324.134;
        String expectedOutput = """
                                    US: $12,324.13
                                    India: Rs.12,324.13
                                    China: ¥12,324.13
                                    France: 12 324,13 €
                                    """;
        //when
        String actualOutput = CurrencyFormatter.format(payment);
        //then
        assertEquals(expectedOutput,actualOutput);
    }
}