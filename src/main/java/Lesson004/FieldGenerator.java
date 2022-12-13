package Lesson004;

import java.util.ArrayList;

public class FieldGenerator {
    private int[][] field;
    private Point start;
    private ArrayList<Point> exits = new ArrayList<>();

    public FieldGenerator() {
        int[][] field = new int[][]{
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 00, 00, 00, 00, 00, 00, 00, 00, -1},
                {-1, 00, 00, 00, 00, -1, -1, -1, 00, -1},
                {-1, -1, -1, -1, 00, 00, 00, 00, 00, -1},
                {-1, 00, 00, 00, 00, 00, -1, 00, 00, -1},
                {-1, 00, 00, 00, 00, 00, -1, 00, 00, -1},
                {-1, 00, 00, 00, -1, 00, 00, 00, 00, -1},
                {-1, 00, 00, 00, 00, 00, -1, 00, 00, -1},
                {-1, 00, 00, 00, 00, 00, -1, 00, 00, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
        this.field = field;
    }

    public int[][] getField() {
        return field;
    }

    public void addStart(Point start) {
        this.start = start;
    }

    public void addExit(Point exit) {
        exits.add(exit);
    }

    public Point getStart() {
        return start;
    }

    public ArrayList<Point> getExits() {
        return exits;
    }
}
