package com.tegt.math.demo.obj;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter
@EqualsAndHashCode
public class JsonDate {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int second;

    public JsonDate() {
        this(Calendar.getInstance());
    }

    public JsonDate(Calendar calendar) {
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH);
        this.year = calendar.get(Calendar.YEAR);
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
}
