package com.yourname;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator();

    // ---------- 正常运算 ----------

    @Test
    void addWorks() {
        assertEquals(4.0, c.eval("2", "+", "2"));
    }

    @Test
    void subtractWorks() {
        assertEquals(3.0, c.eval("5", "-", "2"));
    }

    @Test
    void multiplyWorks() {
        assertEquals(12.0, c.eval("3", "*", "4"));
    }

    @Test
    void divideWorks() {
        assertEquals(2.0, c.eval("10", "/", "5"));
    }

    // ---------- 边界值 ----------

    @Test
    void addWithZero() {
        assertEquals(5.0, c.eval("5", "+", "0"));
    }

    @Test
    void negativeNumbers() {
        assertEquals(-3.0, c.eval("-1", "*", "3"));
    }

    @Test
    void largeNumbers() {
        assertEquals(1.0E10, c.eval("1e5", "*", "1e5"));
    }

    // ---------- 异常路径 ----------

    @Test
    void blankInputThrows() {
        assertThrows(IllegalArgumentException.class, () -> c.eval("", "+", "2"));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> c.eval("10", "/", "0"));
    }

    @Test
    void unknownOperatorThrows() {
        assertThrows(IllegalArgumentException.class, () -> c.eval("2", "&", "3"));
    }
}