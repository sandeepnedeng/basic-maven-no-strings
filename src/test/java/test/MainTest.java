package test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private Main target = new Main();

    @Test
    public void testLazy() {

        assertEquals("Hey you, Lazy", target.yourCustomExperimentHereWithJUnit());
    }
}
