package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FunctionsAssignmentTests {

    FunctionsAssignment functionsAssignment = new FunctionsAssignment();

    @Test
    void testSumMethod() {
        assertEquals(5, functionsAssignment.sum(2, 3));
    }

    @Test
    void testReverseStringMethod() {
        assertEquals("tac", functionsAssignment.reverseString("cat"));
    }

    @Test
    void testFindMaxMethod() {
        assertEquals(5, functionsAssignment.findMax(new int[]{1, 3, 5, 2, 4}));
    }

    @Test
    void testIsPalindromeMethod() {
        assertTrue(functionsAssignment.isPalindrome("madam"));
        assertFalse(functionsAssignment.isPalindrome("hello"));
    }
}
