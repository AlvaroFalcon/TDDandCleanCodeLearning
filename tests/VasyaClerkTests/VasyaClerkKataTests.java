package VasyaClerkTests;

import VasyaClerkKata.VasyaClerk;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VasyaClerkKataTests {
    @Test
    public void with_one_person_with_25_dollars_should_return_YES() {
        assertEquals("YES", new VasyaClerk().Tickets(new int[]{25}));
    }

    @Test
    public void with_two_person_with_25_and_50_dollars_should_return_YES() {
        assertEquals("YES", new VasyaClerk().Tickets(new int[]{25, 50}));
    }

    @Test
    public void when_25_25_50_100_should_return_YES(){
        assertEquals("YES", new VasyaClerk().Tickets(new int[]{25, 25, 50, 100}));
    }

    @Test
    public void when_25_100_should_return_NO() {
        assertEquals("NO", new VasyaClerk().Tickets(new int[]{25, 100}));
    }
}
