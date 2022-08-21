package ru.academits.pyakimova.range_main;

import ru.academits.pyakimova.range.Range;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(1.1, 3);

        System.out.println("Длина диапазона: " + range.getLength());

        range.setFrom(1.9);
        System.out.println("Левая граница диапазона: " + range.getFrom());

        range.setTo(2.9);
        System.out.println("Правая граница диапазона: " + range.getTo());

        System.out.println("Лежит ли точка 1 внутри диапазона: " + range.isInside(1));
    }
}
