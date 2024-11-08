/* LeapYearTest.java */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void testLeapYearDivisibleBy400() {
        // Years divisible by 400 should be leap years
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(1600), "1600 should be a leap year");
        assertTrue(leapYear.isLeapYear(2000), "2000 should be a leap year");
    }

    @Test
    void testNotLeapYearDivisibleBy100Only() {
        // Years divisible by 100 but not 400 should not be leap years
        LeapYear leapYear = new LeapYear();
        assertFalse(leapYear.isLeapYear(1700), "1700 should not be a leap year");
        assertFalse(leapYear.isLeapYear(1800), "1800 should not be a leap year");
        assertFalse(leapYear.isLeapYear(1900), "1900 should not be a leap year");
    }

    @Test
    void testLeapYearDivisibleBy4Only() {
        // Years divisible by 4 but not by 100 should be leap years
        LeapYear leapYear = new LeapYear();
        assertTrue(leapYear.isLeapYear(2004), "2004 should be a leap year");
        assertTrue(leapYear.isLeapYear(2020), "2020 should be a leap year");
    }

    @Test
    void testNotLeapYearNotDivisibleBy4() {
        // Years not divisible by 4 should not be leap years
        LeapYear leapYear = new LeapYear();
        assertFalse(leapYear.isLeapYear(2001), "2001 should not be a leap year");
        assertFalse(leapYear.isLeapYear(2019), "2019 should not be a leap year");
    }
}
