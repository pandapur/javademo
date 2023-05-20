package com.tegt.math.demo.metrics;

import com.tegt.math.demo.ctrl.MathController;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class CustomMetrics {

    @Autowired
    protected MathController mathController;


    private Supplier<Number> getDateCalls() {
        return () -> this.mathController.getDateCalls();
    }

    private Supplier<Number> getCalcCalls() {
        return () -> this.mathController.getDateCalls();
    }

    @Autowired
    public CustomMetrics(MeterRegistry registry) {
        Gauge.builder("number.of.calls.date", getDateCalls()).register(registry);
        Gauge.builder("number.of.calls.calc", getCalcCalls()).register(registry);
    }

}
