package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C51Test {

    private C51 c51;

    @BeforeEach
    void before() {
        c51 = new C51();
    }

    @Test
    void testM1() {
        Assertions.assertEquals("m1", c51.m1());
    }

    @Test
    void testM2() {
        Assertions.assertEquals("m2", c51.m2());
    }
}
