package ru.netology.stats;

public class StatsService {

    public long sumOfSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long averageMonth(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        long averageMonth = totalSales / 12;
        return averageMonth;
    }

    public int salesMaxMonth(long[] sales) {
        int maximumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maximumMonth]) {
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }

    public int salesMinMonth(long[] sales) {
        int minimumMonth = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < sales[minimumMonth]) {
                minimumMonth = i;
            }
        }
        return minimumMonth + 1;
    }

    public int averageMinMonth(long[] sales) {
        int count = 0;
        long average = averageMonth(sales);
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int averageMaxMonth(long[] sales) {
        int count = 0;
        long average = averageMonth(sales);
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}