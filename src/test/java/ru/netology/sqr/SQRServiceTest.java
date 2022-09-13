package ru.netology.sqr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SQRServiceTest {
    SQRService service;
    @BeforeAll
    void beforeAll (){
        service = new SQRService();
    }

    @org.junit.jupiter.api.Test
    void purelyWithinTheRange() {
        int x = 200;
        int y = 300;
        int expected = 3;
        int actual = service.squares(x,y);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void purelyOutOfRange() {
        int x = 200;
        int y = 300;
        int expected = 4;
        int actual = service.squares(x,y);
        assertEquals(expected, actual);
    }
}
