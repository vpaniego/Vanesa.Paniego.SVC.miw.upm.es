package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C12Test {

    private C12 c12;

    @BeforeEach
    void before(){
        c12 = new C12();
    }

    @Test
    void testMA(){
        Assertions.assertEquals("mA", c12.mA());
    }
}
