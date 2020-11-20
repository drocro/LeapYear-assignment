package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Convert {

    @Test
    void convert_4_to_true(){
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(4));
    }

    @Test
    void convert_8_to_true(){
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(8));
    }
    @Test
    void convert_1996_to_true(){
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(1996));
    }
}
