package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    SQRService service = new SQRService();

    @org.junit.jupiter.api.Test
    void shouldFindNumbersExact() {
        int expected = 3;
        int actual = service.findSqrNumbers(200, 300);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMinimalBoundaryValue_1() {
        int expected = 0;
        int actual = service.findSqrNumbers(10, 99);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMinimalBoundaryValue_2() {
        int expected = 1;
        int actual = service.findSqrNumbers(100, 100);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMinimumBoundaryValue_3() {
        int expected = 2;
        int actual = service.findSqrNumbers(100, 121);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMaximumBoundaryValue_1() {
        int expected = 89;
        int actual = service.findSqrNumbers(100, 9800);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMaximumBoundaryValue_2() {
        int expected = 90;
        int actual = service.findSqrNumbers(100, 9801);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMaximumBoundaryValue_3() {
        int expected = 90;
        int actual = service.findSqrNumbers(100, 10_000);
        assertEquals(expected, actual);
    }
}
