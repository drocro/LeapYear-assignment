package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Convert {

    @Test
    void convert_4_to_true(){
        LeapYear leapYear = new LeapYear();
        Assertions.assertTrue(leapYear.convert(4));
    }

}
