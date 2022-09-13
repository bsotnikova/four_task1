package ru.netology.sqr;

public class SQRService {
    public int squares(int x, int y) {
        int amount = 0;
        for (int i = 10; i < 100; i++) {
            if (x <= i * i & i * i <= y) {
                System.out.println(i);
                amount = amount + 1;
            }
        }
        System.out.println(amount);
        return amount;
    }
}
