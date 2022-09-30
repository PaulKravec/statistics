package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStatsService {

    @Test
    public void amoutAllSalesLong() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.amountAllSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);

    }

    @Test
    public void averageAmountOfSalesPerMonthLong() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageAmountOfSalesPerMonth(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void minSalesLong() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void maxSalesLong () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void salesBelowAverageLong () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesBelowAverageLong = 5;
        int actualSalesBelowAverageLong = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedSalesBelowAverageLong, actualSalesBelowAverageLong);
    }

    @Test
    public void salesAboveAverageLong () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesAboveAverangelong = 5;
        int actualSalesAboveAverangeLong = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedSalesAboveAverangelong,actualSalesAboveAverangeLong);
    }

}
