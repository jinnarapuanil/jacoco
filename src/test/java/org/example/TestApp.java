package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestApp {

    @Test
    public void testAdd() {

        App obj = new App();
        assertEquals(8, obj.add(4,4));

    }

    @Test
    public void testAdd1() {

        App obj = new App();
        assertEquals(-2, obj.add(-4,-4, 6));

    }
}
