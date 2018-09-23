package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C22Test {

    private C22 c22;

    @BeforeEach
    void before(){
        c22 = new C22();
    }

    @Test
    void testMA(){
        Assertions.assertEquals("mA", c22.mA());
    }
}
