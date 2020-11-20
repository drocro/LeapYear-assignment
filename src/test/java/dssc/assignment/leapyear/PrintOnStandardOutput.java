package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintOnStandardOutput {

    @Test
    void true_to_string(){
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));
        LeapYear leapYear = new LeapYear();

        leapYear.PrintIsLeap(2000);

        Assertions.assertEquals("true", fakeStandardOutput.toString());
    }
    @Test
    void false_to_string(){
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));
        LeapYear leapYear = new LeapYear();

        leapYear.PrintIsLeap(2001);

        Assertions.assertEquals("false", fakeStandardOutput.toString());
    }

}
