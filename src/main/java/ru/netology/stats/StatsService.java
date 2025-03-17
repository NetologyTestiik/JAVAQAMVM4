package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];

        }
        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i > sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int lessThanAvg(long[] sales) {
        int months = 0;
        long avg = avgSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                months++;
            }
        }
        return months;
    }

    public int MoreThanAvg(long[] sales) {
        int months = 0;
        long avg = avgSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                months++;
            }
        }
        return months;
    }


}
