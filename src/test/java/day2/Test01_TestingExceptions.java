package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {

    // !!! test ettigimiz method bekledigimiz exceptioni firlatti mi ???
    // Eger bekledigim exception firliyorsa handle etmisimdir ama baska bir exception geliyor mu?? bekledigimden
    // farkli bir exception gelirse bu dusunemedigim exceptiondir.

    @Test
    void testException(){ // ersim belirleyicisi public olmak zorunda degil JUnit5 te

        String str = "Merhaba Dunya"; // 13

        // firmala ihtimali olan exceptionlari assertThrows() methodu ile yapabiliyorum.
        assertThrows(NullPointerException.class, ()->{ // burada  NullPointerException firlayacagini belirttim.
            System.out.println("testException() calisti");
            str.length();
        });
    }

    // Bolme islemi icin ArtimeticException kontrolu

    @Test
    void testException2(){

        int sayi1 = 1;
        int sayi2 = 0;


        // boyle bir durumda firlayacak  olan exception Aritmetic exception degil mi??
        // Exception yazarken Parant'i yazarsamda gecer --> RunTimeException diye de yazabilirim.
        assertThrows(ArithmeticException.class,()-> {
            System.out.println(sayi1/sayi2);
        });

    }

    // Yukardaki methodu method ekleyerek yapalim

    @Test
    void testException3(){

        int sayi1 = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, ()-> {

            divide(1,0);
        });


    }

    private int  divide(int a, int b){

        return a/b;
    }

}
