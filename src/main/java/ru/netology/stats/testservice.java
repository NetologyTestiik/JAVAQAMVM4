package ru.netology.stats;

import junit.framework.TestCase;
import org.junit.Test;

public class testservice {

    private TestCase Assertions;

    @Test
    public void sumTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        TestCase Assertions = null;
        Assertions.assertEquals(expected, actual);
        System.out.println(expected);
    }

    @Test
    public void avgSales() {
        StatsService service = new StatsService();
        int sum = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int length = 12;
        int avg = sum / length;
        System.out.println(avg);
    }

    @Test
    public void lessThanAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.lessThanAvg(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
    @Test
    public void MoreThanAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.lessThanAvg(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}

