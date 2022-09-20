package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class TimeFormatterTest {
    @Test
    public void exampleTests() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

    @Test
    public void testYear() {
        assertEquals("1 year", TimeFormatter.formatDuration(3600*24*365));
        assertEquals("1 year, 1 hour and 2 minutes", TimeFormatter.formatDuration(3600*24*365+3600+60*2));
    }

    @Test
    public void testDay(){
        assertEquals("1 day", TimeFormatter.formatDuration(3600*24));
        assertEquals("1 day and 1 hour", TimeFormatter.formatDuration(3600*24+3600));
    }

    @Test
    public void testHour(){
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 3 minutes and 50 seconds", TimeFormatter.formatDuration(3600+60*3+50));
    }
}