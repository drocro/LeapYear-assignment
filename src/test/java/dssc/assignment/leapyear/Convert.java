package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Convert {

    @ParameterizedTest
    @ValueSource(ints ={4, 8, 1996})
    void basic_leap_years_to_true(int number){
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(number));
    }


    

}
