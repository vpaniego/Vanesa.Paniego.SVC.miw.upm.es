package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C11Test {

    private C11 c11;

    @BeforeEach
    void before(){
        c11 = new C11();
    }

    @Test
    void testM1(){
        Assertions.assertEquals("m1", c11.m1());
    }

    @Test
    void testM2(){
        Assertions.assertEquals("m2", c11.m2());
    }
}
