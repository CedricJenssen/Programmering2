package no.hiof.cedricj.models;

public class Album {

    private String albumName;
    private String artistName;
    private String genreName;

    public Album(String albumName, String artistName, String genreName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.genreName = genreName;
    }

    @Override
    public String toString() {
        return "Album: " + albumName + "  Artist: " + artistName + "  Genre: " + genreName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

}
