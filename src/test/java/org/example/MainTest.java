package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void m1() {
        int n = 7;
        List<String> m1=new ArrayList<>();
        m1.add("1");
        m1.add("2");
        m1.add("3");
        m1.add("4");
        m1.add("fizz");
        m1.add("6");
        m1.add("buzz");
        List<String> otv = Main.m1(n);
        assertEquals(m1,otv);
    }

    @Test
    void Nm1() {
        int n = -2;
        List<String> m1 = Main.m1(n);
        assertNull(m1);
    }
}