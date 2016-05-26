package DubstepTests;

import DubstepKata.Dubstep;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DubstepKataTests {
    @Test
    public void when_the_song_is_WUBA_should_return_A() {
        assertEquals("A", new Dubstep().SongDecoder("WUBA"));
    }

    @Test
    public void when_the_song_is_WUBWUBABCWUB_should_return_ABC() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void when_the_song_is_RWUBWUBWUBLWUB_should_return_R_space_L() {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }
}
