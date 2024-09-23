package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, c.subtract(4, 2)); // 期望结果为 2，实际结果为 c.subtract(4, 2)
    }
}

