package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C21Test {
    private C21 c21;

    @BeforeEach
    void before() {
        c21 = new C21();
    }

    @Test
    void testM1(){
        Assertions.assertEquals("m1", c21.m1());

    }

    @Test
    void testM2(){
        Assertions.assertEquals("m2", c21.m2());
    }

    @Test
    void testM3(){
        Assertions.assertEquals("m3", c21.m3());
    }


}
