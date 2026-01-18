package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    public void statisticsServiceFindMax() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = statisticsService.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void statisticsServiceFindMaxAtBeginning() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomesInBillions = {15, 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 15;

        long actual = statisticsService.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void statisticsServiceWhenAllEquals() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomesInBillions = {16, 16, 16, 16, 16};

        long expected = 16;
        long actual = statisticsService.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void statisticsServiceFindSingleElement() {
        StatisticsService statisticsService = new StatisticsService();
        long[] incomesInBillions = {18};

        long expected = 18;
        long actual = statisticsService.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void statisticsServiceWhenAllElementsAreZero() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {0, 0, 0};

        long expected = 0;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldUpdateMaxWhenBiggerValueAppearsLater() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 10, 4, 9, 12, 3};
        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionWhenArrayIsEmpty() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {};

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            service.findMax(incomes);
        });
    }
}

