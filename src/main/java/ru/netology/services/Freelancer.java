package ru.netology.services;

public class Freelancer {
    public int calculate(int income, int expenses, int threshold) {
        int ballance = 0;
        int relax = 0;

        for (int i = 0; i < 12; i++) {
            if (ballance >= threshold) {
                ballance -= expenses;
                ballance /= 3;
                relax++;
            } else {
                ballance += income;
                ballance -= expenses;


            }

        }

        return relax;
    }
}
