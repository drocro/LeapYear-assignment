package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Convert {

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 1996})
    void basic_leap_years_to_true(int number) {
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 21, 2001})
    void basic_not_leap_years_to_false(int number) {
        LeapYear leapYear = new LeapYear();
        Assertions.assertFalse(leapYear.convert(number));
    }


    @ParameterizedTest
    @ValueSource(ints = {300, 600, 1900})
    void atypical_not_leap_years_to_false(int number) {
        LeapYear leapYear = new LeapYear();
        Assertions.assertFalse(leapYear.convert(number));
    }

    @Test
    void atypical_leap_year_400_to_true() {
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(400));
    }
    @Test
    void atypical_leap_year_800_to_true() {
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(800));
    }


}
