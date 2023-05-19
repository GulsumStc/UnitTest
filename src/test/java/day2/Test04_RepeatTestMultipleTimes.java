package day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTimes {

    // class seviyesinde calistirildiginda default davranis olarak en altaki method'tan baslar calistirmaya


    // !!!! Bir testin birden fazla calimasini istersem.
    // Testi tekrarlamak istersem


    @RepeatedTest(5)// bu methodun ornegin 5 defa calismasini istersem!
    void testSubstring(){

        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test gecti");
    }


    // ayni girdiyle 5 defa methodu calistirmak mantikli degildir. girdileri random olarak uretecegiz.

    @RepeatedTest(3)
    @Disabled// class seviyede calistiginda bu methodu pasif hale getiriyor.
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("test2 calisti");
    }


    // 3. Ornek
    Random rm = new Random();

    @RepeatedTest(3)
    void testMathExact(){

        int sayi1 = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);

        assertEquals(sayi1+sayi2, Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 : "+ sayi1 + " sayi2 = " +sayi2);


    }



}
