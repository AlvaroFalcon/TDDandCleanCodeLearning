package VasyaClerkTests;

import VasyaClerkKata.VasyaClerk;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VasyaClerkKataTests {
    @Test
    public void with_one_person_with_25_dollars_should_return_YES() {
        assertEquals("YES", VasyaClerk.Tickets(new int[]{25}));
    }

    @Test
    public void with_two_person_with_25_and_50_dollars_should_return_YES() {
        assertEquals("YES", VasyaClerk.Tickets(new int[]{25, 50}));
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 50, 50, 50, 50}));
    }

    @Test
    public void test1() {
        assertEquals("YES", VasyaClerk.Tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 100}));
    }
}
