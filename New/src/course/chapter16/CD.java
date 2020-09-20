package course.chapter16;

import java.util.Objects;

public class CD {
    private int id;
    private String artist;
    private String title;

    public CD(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return id == cd.id &&
                artist.equals(cd.artist) &&
                title.equals(cd.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, artist, title);
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
