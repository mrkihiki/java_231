package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void sequence() {
        int n = 7;
        List<String> expected =new ArrayList<>();
        String[] q={"1", "2", "3", "4", "fizz", "6", "buzz", "8", "9", "fizz", "11", "12", "13", "buzz", "fizz", "16", "17", "18", "19", "fizz", "buzz", "22", "23", "24", "fizz", "26", "27", "buzz", "29", "fizz", "31", "32", "33", "34", "fizzbuzz", "36"};
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        expected.add("fizz");
        expected.add("6");
        expected.add("buzz");
        List<String> actual = Main.sequence(n);
        assertEquals(expected, actual);
        assertEquals(List.of(q), Main.sequence(36));
    }

    @Test
    void sequenceNegativeSize() {
        int n = -4;
        List<String> actual = Main.sequence(n);
        assertNull(actual);
    }

    @Test
    void reverse() {
        String expected="llatsni ekam";
        String actual =Main.reverse("make install");
        assertEquals(expected, actual);
    }

    @Test
    void equation() {
        String n="There are no real roots";
        List<String> unknowns =Main.equation(1,-5,9);
        assertEquals(n, unknowns.getFirst());
        unknowns =Main.equation(1,3,-4);
        List<String> expected =new ArrayList<>();
        expected.add("-4.0");
        expected.add("1.0");
        assertEquals(expected, unknowns);
        unknowns =Main.equation(1,-4,4);
        assertEquals("2", unknowns.getFirst());
    }

    @Test
    void sum() {
        assertEquals("0.61011225",String.valueOf(Main.sum()));
    }

    @Test
    void palindrome() {
        assertTrue(Main.palindrome("Do geese see God"));
        assertFalse(Main.palindrome("Do geese see Dog"));
    }
}
