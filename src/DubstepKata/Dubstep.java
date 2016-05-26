package DubstepKata;

public class Dubstep {
    public String SongDecoder(String song) {
        return process(song);
    }

    private String process(String song) {
        while (song.contains("WUBWUB")) {
            song = reduceWUBtoOne(song);
        }
        return deleteWub(song).trim();
    }

    private String deleteWub(String song) {
        return song.replaceAll("WUB"," ");
    }

    private String reduceWUBtoOne(String song) {
        return song.replaceAll("WUBWUB", "WUB");
    }
}
