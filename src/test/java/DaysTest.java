import dayOfTheWeek.ArrayDays;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DaysTest {
    ArrayDays arrayDays;

    @BeforeEach
    void setUp() {
        arrayDays = new ArrayDays();
    }
    @AfterEach
    void tearDown() throws Exception {
        arrayDays = new ArrayDays();
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 1, 87569034, -54790887})
    public void summaryParamsTest (int weekDays){
        ArrayDays weekDay = new ArrayDays();
        String expectedResult = "Sunday";

        String actualResult = weekDay.getDay(weekDays);
        assertEquals(expectedResult, actualResult, "Summary result is incorrect");
    }

    @Test
    public void testWeekDaysHappyPath() {
        Integer dayNumber = 1;
        String expectedResult = "Sunday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysHappyPath2() {
        Integer dayNumber = 2;
        String expectedResult = "Monday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysHappyPath3() {
        Integer dayNumber = 3;
        String expectedResult = "Tuesday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysHappyPath4() {
        Integer dayNumber = 4;
        String expectedResult = "Wednesday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysHappyPath5() {
        Integer dayNumber = 5;
        String expectedResult = "Thursday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysHappyPath6() {
        Integer dayNumber = 6;
        String expectedResult = "Friday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysHappyPath7() {
        Integer dayNumber = 7;
        String expectedResult = "Saturday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysBad() {
        Integer dayNumber = 0;
        String expectedResult = "Sunday";
        ArrayDays weekDay = new ArrayDays();
        String actualResult = weekDay.getDay(dayNumber);
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

//    @Test
//    public void testArrays() {
//        String s1[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//        String expected[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//        ArrayDays.sort(s1);
//        assertArrayEquals(expected, s1);
//    }
//    @ParameterizedTest
//    @MethodSource
//    void testWithMethodSource(String argument) {
//        Assertions.assertNotNull(argument);
//    }

    @Test
    public  void testNullNegative(){
 //       logger.error("Null checking");
        Integer dayNumber = null;
        ArrayDays weekDay = new ArrayDays();
        Assertions.assertThrows(NullPointerException.class,()->weekDay.getDay(dayNumber));
    }

}