import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {
    @Test
    public void createTimeTest() {
        Time time = new Time(1, 0, 0);
        assertEquals(1, time.getHour());
        assertEquals(0, time.getMinutes());
        assertEquals(0, time.getSeconds());

    }

    @Test
    public void createTimeWithInvalidHourTest() {
        assertThrows(Exception.class, () -> new Time(37, 0, 0));
    }

    @Test
    public void createTimeWithInvalidMinutesTest() {
        assertThrows(Exception.class, () -> new Time(3, 68, 0));
    }

    @Test
    public void createTimeWithInvalidSecondsTest() {
        assertThrows(Exception.class, () -> new Time(7, 45, 97));
    }

    public static void main() {
        Time time = new Time(0, 0, 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Hours: ");
        int hour = 0;

        try {

            hour = scanner.nextInt();
            time = new Time(hour, 32, 23);
            System.out.println("Hour is " + time.getHour());
            //code that nay misbehave
        } catch (InputMismatchException joy) {
            System.out.println("Oga type something wey sense");
            main();
            //what to do if the specified error happens
        } catch (IllegalArgumentException ex) {
            System.out.println("Oga type correct hour");
            main();

        }

    }

}


