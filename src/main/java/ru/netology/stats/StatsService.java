package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++)
            sum += sales[i];

        return sum;
    }

    public double averageSales(long[] sales) {
        int sum = sumSales(sales);
        return (double) sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthesBelowTheAverage(long[] sales) {
        int monthBelowTheAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                monthBelowTheAverage++;
            }
        }
        return monthBelowTheAverage;
    }

    public int monthesOverTheAverage(long[] sales) {
        int monthOverTheAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                monthOverTheAverage++;
            }
        }
        return monthOverTheAverage;
    }
}
