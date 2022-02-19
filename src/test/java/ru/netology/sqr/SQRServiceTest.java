package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @Test
    void shouldCalculateMarks() {
        SQRService service = new SQRService();
        int from = 200;
        int to = 300;
        int expected = 3;
        int actual = service.calculate(from, to);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMarks100300() {
        SQRService service = new SQRService();
        int from = 100;
        int to = 300;
        int expected = 8;
        int actual = service.calculate(from, to);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateIntoMarks1001000() {
        SQRService service = new SQRService();
        int from = 100;
        int to = 1000;
        int expected = 22;
        int actual = service.calculate(from, to);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateIntoMarks() {
        SQRService service = new SQRService();
        int from = 200;
        int to = 210;
        int expected = 0;
        int actual = service.calculate(from, to);
        assertEquals(expected, actual);
    }

}
