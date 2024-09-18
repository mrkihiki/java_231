package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        int n = -4;
        List<String> m1 = Main.m1(n);
        assertNull(m1);
    }

    @Test
    void m2() {
        String n="llatsni ekam";
        String m2=Main.m2("make install");
        assertEquals(n,m2);
    }

    @Test
    void m3() {
        String n="нет вещественных корней";
        List<String> m3 =Main.m3(1,-5,9);
        assertEquals(n,m3.getFirst());
        m3=Main.m3(1,3,-4);
        List<String> nn=new ArrayList<>();
        nn.add("-4.0");
        nn.add("1.0");
        assertEquals(nn,m3);
        m3=Main.m3(1,-4,4);
        assertEquals("2",m3.getFirst());
    }

    @Test
    void m4() {
        assertEquals("0.61011225",String.valueOf(Main.m4()));
    }
}