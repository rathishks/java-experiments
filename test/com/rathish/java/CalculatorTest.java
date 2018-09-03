package com.rathish.java;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void givenMultiThread_whenNonSyncMethod() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Calculator calculator = new Calculator();
        IntStream.range(0, 1000)
                .forEach(count -> service.submit(calculator::increment));

        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        assertEquals(Integer.valueOf(1000), calculator.getSum());

    }
}
