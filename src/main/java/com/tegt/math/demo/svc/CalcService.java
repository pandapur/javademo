package com.tegt.math.demo.svc;

import com.tegt.math.demo.obj.JsonDate;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class CalcService {

    public JsonDate calcDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        JsonDate jsonDate = new JsonDate(calendar);
        return jsonDate;
    }
}
