package day2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test06_GroupingTest {

    // !!! amacimiz: birbiriyle iliskili testleri gruplamak

    // carpma ve toplama islemleri icin yazilan test methodlarini gruplayacagiz.


    @Nested // bu class icinde yazilmis olan methodlarin hepsi gruplanmis sekilde tek bir amac icin yazilmis methodlardir.
    class MultiplyTest{ // sadece carpma islemleriyle ilgili methodlarimi gruplamis olucam

        @ParameterizedTest
        @CsvSource(value = {"-12,-4,3 ", " -12, 4, -3", "12, -4, -3"}) // "-12,-4,3 " --> -4*3=-12
        void testMultipleWithNonZero(int result, int x, int y){

            assertEquals(result,Math.multiplyExact(x,y));

        }

        @ParameterizedTest
        @CsvSource(value = {"0, 3, 0", "0, 0, 4","0, 12,0"})
        void testMultipleWithZero(int result, int x, int y){

            assertEquals(result, Math.multiplyExact(x,y));

        }


    }

    @Nested
    class AddTest{

        @ParameterizedTest
        @CsvSource(value = {"-1, -4, 3", "1, 4, -3", "-7, -4, -3"})
        void testAddWithNonZero(int result, int x, int y){

            assertEquals(result,Math.addExact(x,y));

        }

        @ParameterizedTest
        @CsvSource(value = {"3, 0, 3", "4, 4, 0", "12, 0 ,12"})
        void testAddWithZero(int result, int x, int y){

            assertEquals(result, Math.addExact(x,y));

        }

    }


}
