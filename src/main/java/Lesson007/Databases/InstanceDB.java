package Lesson007.Databases;

import Lesson007.Artists.Artist;
import Lesson007.Films.Film;
import Lesson007.Genres.Genre;

import java.util.HashMap;

public class InstanceDB {
    private HashMap<Integer, Film> films = new HashMap<>();
    private HashMap<Integer, Artist> artists = new HashMap<>();
    private HashMap<Integer, Genre> genres = new HashMap<>();
    private Integer filmsCount = 0;
    private Integer artistsCount = 0;
    private Integer genresCount = 0;

    public void addFilm(String name, Integer producerID) {
        films.put(++filmsCount, new Film(filmsCount, name, producerID));
    }

    public void addArtist(String fullName, Integer birthYear) {
        artists.put(++artistsCount, new Artist.Builder(artistsCount)
                                                .fullName(fullName)
                                                .birthYear(birthYear)
                                                .build());
    }

    public void addArtist(String fullName) {
        addArtist(fullName, null);
    }

    public void addGenre(String name) {
        genres.put(++genresCount, new Genre(genresCount, name));
    }

    public Artist getArtist(Integer ID) {
        return artists.get(ID);
    }

    public Film getFilm(Integer ID) {
        return films.get(ID);
    }

    public String getProducerFromFilm(Integer filmID) {
        return artists.get(films.get(filmID).getProducerID()).toString();
    }

    public String getActorsFromFilm(Integer filmID) {
        StringBuilder sb = new StringBuilder();
        for (Integer actorID: films.get(filmID).getActorsIDs()) {
            sb.append(artists.get(actorID) + "; ");
        }
        return sb.toString();
    }

    public String getGenresFromFilm(Integer filmID) {
        StringBuilder sb = new StringBuilder();
        for (Integer genreID: films.get(filmID).getGenresIDs()) {
            sb.append(genres.get(genreID) + "; ");
        }
        return sb.toString();
    }
}
