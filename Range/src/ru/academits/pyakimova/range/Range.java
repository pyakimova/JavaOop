package ru.academits.pyakimova.range;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    public Range getIntersection(Range range) {
        if (this.to <= range.from || range.to <= this.from) {
            return null;
        }

        return new Range(Math.max(this.from,range.from),Math.min(this.to,range.to));
    }

    public Range[] getSum(Range range) {
        if (this.to <= range.from || range.to <= this.from){
            return new Range[]{this,range};
        }

        return new Range[]{new Range(Math.min(this.from,range.from),Math.max(this.to,range.to))};
    }

    public Range[] getMinus(Range range) {
        if (this.to <= range.from || range.to <= this.from) {
            return new Range[]{this};
        }

        Range[] resultRange = new Range[]{};
        if (this.from <= range.from) {
            resultRange = Arrays.copyOf(resultRange,1);
            resultRange[0] = new Range(this.from,range.from);
            }

        if (range.to <= this.to) {
            int newArrayLength = resultRange.length + 1;
            resultRange = Arrays.copyOf(resultRange,newArrayLength);
            resultRange[newArrayLength - 1] = new Range(range.to,this.to);
        }

        return resultRange;
    }
}
