package ru.netology.sqr;

public class SQRService {
    public int findSqrNumbers(int from, int to) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= from) {
                if (i * i <= to) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }
}

