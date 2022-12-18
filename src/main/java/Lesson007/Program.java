package Lesson007;

import Lesson007.Databases.InstanceDB;
import Lesson007.Genres.Genre;

public class Program {
    public static void main(String[] args) {
        InstanceDB myDb = new InstanceDB();
        myDb.addArtist("Vova Vovov", 1987);
        myDb.addArtist("Ilia Liin");
        myDb.addArtist("Petp Petrov", 2001);
        myDb.addFilm("Sunny Day", 1);
        myDb.getFilm(1).addActor(2);
        myDb.getFilm(1).addActor(3);
        myDb.addGenre("Drama");
        myDb.getFilm(1).addGenre(1);
        System.out.println(myDb.getFilm(1));
        System.out.println(myDb.getProducerFromFilm(1));
        System.out.println(myDb.getActorsFromFilm(1));
        System.out.println(myDb.getGenresFromFilm(1));
    }
}
