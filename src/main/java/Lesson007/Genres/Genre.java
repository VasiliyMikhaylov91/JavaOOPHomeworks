package Lesson007.Genres;

public class Genre {
    private final Integer ID;
    private String name;

    public Genre(Integer ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return name;
    }
}
