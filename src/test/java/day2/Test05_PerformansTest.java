package day2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformansTest {

    // !!! bunu nerede kullanabiliriz?
    // Tesk olarak verilen sorunun cozumu icin yazilan kodun max 2 sn icinde ekrana sonucu vermesini istiyorsam;
    // verilen sureyi asarsa calisam suresi test fail eder

    @Test
    void testPrintperformans(){

        assertTimeout(Duration.ofSeconds(2),()->
                IntStream.rangeClosed(1,100000).forEach(System.out::println)); // bu islemin 2 saniye de bitmesini istiyorum.


    }

    @Test
    void testPerformans(){

        assertTimeout(Duration.ofSeconds(3),()->
                IntStream.rangeClosed(1,100000).reduce((x,y) -> Math.addExact(x,y))); // bu islemin 2 saniye de bitmesini istiyorum.


    }



}
