package Lesson007.Artists;

import java.util.HashSet;

public class Artist {
    private Integer ID;
    private String fullName;
    private Integer birthYear;


    public static class Builder {
        private final Integer ID;
        private String fullName;
        private Integer birthYear;

        public Builder(Integer id) {
            ID = id;
        }

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder birthYear(Integer birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Artist build() {
            if (fullName == null) {
                fullName = "No name";
            }
            if (birthYear == null) {
                birthYear = 0;
            }
            return new Artist(this);
        }
    }


    private Artist(Builder builder) {
        ID = builder.ID;
        fullName = builder.fullName;
        birthYear = builder.birthYear;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
