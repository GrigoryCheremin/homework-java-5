package ru.netology.sqr;

public class SQRService {
    public int calculate(int from, int to) {
        int square = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= from && i * i <= to) {
                square++;
            }
        return square;
    }
}