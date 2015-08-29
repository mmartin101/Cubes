package com.martin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Test class for testing FindCubes
 * Created by maxm on 8/29/15.
 */
public class FindCubesTest {
    /**
     * The cube, 41063625 (345^3), can be permuted to produce
     * two other cubes: 56623104 (384^3) and 66430125
     * (405^3). In fact, 41063625 is the smallest cube which
     * has exactly three permutations of its digits which are
     * also cube.
     *
     * @throws Exception
     */
    @Test
    public void testUsing3MaxPermutations() throws Exception {
        PossibleAnswer pa = FindCubes.compute(3);
        assertNotNull("value returned should not be null", pa);
        assertEquals("There should be 3 bases", 3, pa.bases.length);
        assertEquals("There should be 3 values", 3, pa.values.length);
        assertEquals("Count should be 3", 3, pa.count);
    }

    @Test
    public void testUsingMaxPermutationsLessThan1ShouldReturnNull() throws Exception {
        PossibleAnswer pa = FindCubes.compute(0);
        assertNull("value returned should be null", pa);
        pa = FindCubes.compute(-1);
        assertNull("value returned should be null", pa);

    }
}
