package ru.netology.service;

public class B {
    public static final int CUSTOMS_SERVICE (int price, int weight) {
        int priceCheck = price / 100;
        int weightCheck = weight * 100;

        return priceCheck + weightCheck;
    }
}
