package day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test02_DisplayName {

    @Test
    @DisplayName("Test_parseInt_to_chekc_if_It_is_throwing_for_non_digit_value")
    void terstException(){// test_parseInt_if_It_is_throwing_for_non_digit_value

     //   String str = "123"; // Integer.parseInt(str) --> 123
        // integer'a dounusmeyecek bir strign ifade verildiginde NumberFormatException gelir mi?
        String str = "Merhaba";

        assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt(str); // Exception firliyorsa test gecer
        });


    }

}
