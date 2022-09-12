package ru.netology.sqr;

public class SQRService {
    public int squares(int x, int y) {
        int i = 0;
        for (i = 10; i < 100; i++) {
            if (x <= i * i & i * i <= y) {
                System.out.println(i);
            }
        }
        return i;
    }
}
