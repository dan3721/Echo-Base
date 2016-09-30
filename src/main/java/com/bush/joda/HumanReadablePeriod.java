package com.bush.joda;

import org.joda.time.Period;
import org.joda.time.format.PeriodFormat;

import static java.lang.System.out;

public class HumanReadablePeriod {
    public static void main(String[] args) {
        out.println(PeriodFormat.getDefault().print(new Period(5872346L)));
    }
}
