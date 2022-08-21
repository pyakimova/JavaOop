package ru.academits.pyakimova.range_main;

import ru.academits.pyakimova.range.Range;

import java.util.Arrays;

public class RangeMain {
    public static void main(String[] args) {
//        Range range = new Range(1.1, 3);
//
//        System.out.println("Длина диапазона: " + range.getLength());
//
//        range.setFrom(1.9);
//        System.out.println("Левая граница диапазона: " + range.getFrom());
//
//        range.setTo(2.9);
//        System.out.println("Правая граница диапазона: " + range.getTo());
//
//        System.out.println("Лежит ли точка 1 внутри диапазона: " + range.isInside(1));
        Range range = new Range(1,10);
        Range[] arr = range.getMinus(new Range(2,5));
        System.out.println(arr[0].getFrom() + "-" + arr[0].getTo() + "; " + arr[1].getFrom() + "-" + arr[1].getTo());
    }
}
