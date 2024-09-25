package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    @Test
    void main() {
    }

    @Test
    void fizzBuzz() {
        int n = 1;
        List<String> list = Main.fizzBuzz(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        assertEquals(expected, list);
    }

    @Test
    void reverse() {
        String expected = "llatsni ekam";
        assertEquals(expected, Main.reverse("make install"));
    }

    @Test
    void discriminant() {
        List<String> list = Main.discriminant(1, -2,-3);
        List<String> expected = List.of(
                "3.0",
                "-1.0"
        );
        assertEquals(expected, list);
    }

    @Test
    void seriesSum() {
        double res = Main.seriesSum();
        double expected = 0.6101121094474383;
        assertEquals(expected, res);
    }

    @Test
    void palindrome() {
        boolean list1 = Main.palindrome("mam");
        boolean list2 = Main.palindrome("man");
        assertTrue(list1);
        assertFalse(list2);
    }
}