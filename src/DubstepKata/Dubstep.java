package DubstepKata;

public class Dubstep {
    public String SongDecoder(String song) {
        return process(song);
    }

    private String process(String song) {
        String decodedSong = song;
        while (decodedSong.contains("WUBWUB")) {
            decodedSong = reduceWUBtoOne(decodedSong);
        }
        return deleteWub(decodedSong).trim();
    }

    private String deleteWub(String song) {
        return song.replaceAll("WUB"," ");
    }

    private String reduceWUBtoOne(String song) {
        return song.replaceAll("WUBWUB", "WUB");
    }
}
