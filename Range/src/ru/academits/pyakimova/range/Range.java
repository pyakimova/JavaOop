package ru.academits.pyakimova.range;

public class Range {
    private double from;
    private double to;
    //предполагаем, что точка не является интервалом, поэтому from не равно to

    public Range(double from, double to) {
        if (from < to) {
            this.from = from;
            this.to = to;
        } else {
//нужно сгенерить иксепшн
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

    public Range[] getSum(Range range1, Range range2) {
        if (range1.to <= range2.from || range2.to <= range1.from){
            return new Range[]{range1,range2};
        }

        return new Range[]{new Range(Math.min(range1.from,range2.from),Math.max(range1.to,range2.to))};
    }

    public Range[] getDifference(Range range1, Range range2) {
        if (range1.to <= range2.from || range2.to <= range1.from) {
            return new Range[]{range1};
        }

        if (range2.from <= range1.from) {
            if (range1.to <= range2.to) {
                return new Range[]{};
            } else {
                return new Range[]{new Range(range2.to,range1.to)};
            }
        }

        if (range1.to <= range2.to) {
            return new Range[]{new Range(range1.from,range2.from)};
        }

        return new Range[]{new Range(range1.from,range2.from),new Range(range2.to,range1.to)};
    }
}
