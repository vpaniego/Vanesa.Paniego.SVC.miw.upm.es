package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C32Test {

    private C32 c32;

    @BeforeEach
    void before(){
        c32 = new C32();
    }

    @Test
    void testMA(){
        Assertions.assertEquals("mA", c32.mA());
    }
}
