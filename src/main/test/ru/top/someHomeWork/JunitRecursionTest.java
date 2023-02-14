package ru.top.someHomeWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitRecursionTest {

    @Test
    void reverse() {
        int expectedNumber = 17;
        JunitRecursion.reverse(179);
        Assertions.assertEquals(expectedNumber, 1+7+9);
    }
}