package ru.academits.pyakimova.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from < to) {
            this.from = from;
            this.to = to;
        } else {
//нужно сгенерить иксепшн
//предполагаем, что точка не является интервалом
        }
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        if (from < to) {
            this.from = from;
        } else {
//нужно сгенерить иксепшн
        }
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        if (from < to) {
            this.to = to;
        } else {
//нужно сгенерить иксепшн
        }
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double value) {
        return value >= from && value <= to;
    }

    public Range getIntersection(Range range1, Range range2) {
        if (range1.to <= range2.from || range2.to <= range1.from) {
            return null;
        }

        return new Range(Math.max(range1.from,range2.from),Math.min(range1.to,range2.to));
    }

    public Range getSum(Range range1, Range range2) {
        return range1;
    }

    public Range getDifference(Range range1, Range range2) {
        return range2;
    }
}
