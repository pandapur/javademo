package com.tegt.math.demo.svc;

import com.tegt.math.demo.obj.JsonDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcServiceTest {

    CalcService calcService;

    @BeforeEach
    void setUp() {
        calcService = new CalcService();
    }

    @Test
    @DisplayName("Calc service days + 12 should work")
    void testMultiply() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 12);
        JsonDate now = new JsonDate(calendar);
        assertEquals(now, calcService.calcDays(12),
                "Calc now + 12 days should work");
    }
}
