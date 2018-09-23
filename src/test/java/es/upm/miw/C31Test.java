package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C31Test {

    private C31 c31;

    @BeforeEach
    void before() {
        c31 = new C31();
    }

    @Test
    void testM1() {
        Assertions.assertEquals("m1", c31.m1());
    }

    @Test
    void testM2() {
        Assertions.assertEquals("m2", c31.m2());
    }

    @Test
    void testMB() {
        Assertions.assertEquals("mB", c31.mB());
    }
}
