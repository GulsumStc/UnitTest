package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test() {



    }

    @Test
    public void testLemgth(){

        String cumle = "Merhaba Dunyam"; //14

        int anlikDeger =  cumle.length();
        int beklenenDeger = 14;

        assertEquals(beklenenDeger,anlikDeger);


    }




}
