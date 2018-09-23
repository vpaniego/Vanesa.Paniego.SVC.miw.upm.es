package es.upm.miw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C52Test {

    private C52 c52;

    @BeforeEach
    void before() {
        c52 = new C52();
    }

    @Test
    void testMA() {
        Assertions.assertEquals("mA", c52.mA());
    }
}
