package Lesson004;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Waves {
    private int[][] field;
    private Deque<Point> queue = new ArrayDeque<>();

    public Waves(int[][] field, Point start) {
        this.field = field;
        field[start.getY()][start.getX()] = 1;
        queue.add(start);
        spreadWaves();
    }

    private void spreadWaves() {
        if (!queue.isEmpty()) {
            Point point = queue.poll();
            if (field[point.getY() - 1][point.getX()] == 0) {
                field[point.getY() - 1][point.getX()] = field[point.getY()][point.getX()] + 1;
                queue.addLast(new Point(point.getX(), point.getY() - 1));
            }
            if (field[point.getY()][point.getX() + 1] == 0) {
                field[point.getY()][point.getX() + 1] = field[point.getY()][point.getX()] + 1;
                queue.addLast(new Point(point.getX() + 1, point.getY()));
            }
            if (field[point.getY() + 1][point.getX()] == 0) {
                field[point.getY() + 1][point.getX()] = field[point.getY()][point.getX()] + 1;
                queue.addLast(new Point(point.getX(), point.getY() + 1));
            }
            if (field[point.getY()][point.getX() - 1] == 0) {
                field[point.getY()][point.getX() - 1] = field[point.getY()][point.getX()] + 1;
                queue.addLast(new Point(point.getX() - 1, point.getY()));
            }
            spreadWaves();
        }
    }

    public int[][] getField() {
        return field;
    }
}
