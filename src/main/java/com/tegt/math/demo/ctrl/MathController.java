package com.tegt.math.demo.ctrl;

import com.tegt.math.demo.obj.JsonDate;
import com.tegt.math.demo.svc.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MathController {

    private CalcService calcService;

    @Autowired
    public MathController(CalcService  calcService) {
        this.calcService = calcService;
    }


    @GetMapping(value = "date", produces = MediaType.APPLICATION_JSON_VALUE)
    public JsonDate getDate() {
        return new JsonDate();
    }

    @GetMapping(value = "calc", produces = MediaType.APPLICATION_JSON_VALUE)
    public JsonDate getCalc(@RequestParam(value = "days") int days) {
        return this.calcService.calcDays(days);
    }
}
