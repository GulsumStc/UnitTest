package day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParamterizedTest {


    @Test
    void testLength(){

        assertTrue("Mirac".length()>0);
        assertTrue("ebubekir".length()>0);
        assertTrue("Bilal".length()>0);
        assertTrue("Ahmet".length()>0);

    }

    // yukaridaki methodta  4 defa assertTrue yazdik ama bunu daha clean hale getirebiliriz

    //Bu method calisirken bir parametreye ihtiyaci var onuda "ValueSource" anotasyonuyla gonderilen
    // elemanlari alip calistiracak. bir donguye giriyor gibi...
    @ParameterizedTest
    @ValueSource(strings = {"Mirac", "Bilal", "ebubekir", "Ahmet"})
    void testLength2(String str){

        assertTrue(str.length()>0);

    }

    // !!! 2. Ornek

    @Test
    void testUpperCase(){

        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());

    }

    // !!! yukarida ornegi parametreli olarak yazalim

    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA, merhaba",
            "JAVA, java",
            "TEST, test"
    })
    void testUppercase2(String str1,String str2){

        assertEquals(str1,str2.toUpperCase());

    }

    @ParameterizedTest
    @CsvSource(value = {"true,java,a",
            "true,junit,u",
            "false,hello,a"})
    void testContains(boolean b1, String str1, String str2){

        assertEquals(b1,str1.contains(str2));

    }

}
