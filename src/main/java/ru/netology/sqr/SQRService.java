package ru.netology.sqr;

public class SQRService {
    public static int NumberOfSquares(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (a <= x && x <= b) {
                count++;
            }
        }
        return count;
    }
}