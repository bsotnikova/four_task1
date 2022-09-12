package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void purelyWithinTheRange() {
        SQRService service = new SQRService();
        int x = 100;
        int y = 300;
        int expected = 100;
        int actual = service.squares(x,y);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void purelyOutOfRange() {
        SQRService service = new SQRService();
        int x = 50;
        int y = 90;
        int expected = 10;
        int actual = service.squares(x,y);
        assertEquals(expected, actual);
    }
}
