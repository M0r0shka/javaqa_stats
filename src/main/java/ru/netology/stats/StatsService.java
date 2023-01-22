package ru.netology.stats;

public class StatsService {

    public long totalSum(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum = totalSum + sale;
        }
        return totalSum;
    }

    public long averageSum(long[] sales) {
        long averageSum = totalSum(sales) / sales.length;

        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {

        long averageSum = averageSum(sales);
        int belowAverageMonth = 0; // переменная для подсчёта количества меляцев с продажами ниже среднего
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale < averageSum) {
                belowAverageMonth = belowAverageMonth +1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return belowAverageMonth;
    }

    public int aboveAverageSales(long[] sales) {

        long averageSum = averageSum(sales);
        int aboveAverageMonth = 0; // переменная для подсчёта количества меляцев с продажами выше среднего
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale > averageSum) {
                aboveAverageMonth = aboveAverageMonth +1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return aboveAverageMonth;
    }

}
