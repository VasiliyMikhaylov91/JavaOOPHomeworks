package Lesson007.Films;

import Lesson007.Artists.Artist;

import java.util.HashSet;

public class Film {
    private final Integer ID;
    private String name;
    private Integer producerID;
    private HashSet<Integer> actorsIDs = new HashSet<>();
    private HashSet<Integer> genresIDs = new HashSet<>();

    public Film(Integer ID, String name, Integer producerID) {
        this.ID = ID;
        this.name = name;
        this.producerID = producerID;

    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeProducer(Integer producerID) {
        this.producerID = producerID;
    }

    public void addActor(Integer actorID) {
        actorsIDs.add(actorID);
    }

    public void addGenre(Integer genreId) {
        genresIDs.add(genreId);
    }

    public HashSet<Integer> getActorsIDs() {
        return actorsIDs;
    }

    public HashSet<Integer> getGenresIDs() {
        return genresIDs;
    }

    public Integer getProducerID() {
        return producerID;
    }

    @Override
    public String toString() {
        return name;
    }
}
