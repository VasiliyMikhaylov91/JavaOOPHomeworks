package Lesson004;

import java.util.*;

public class Waves {
    private int[][] field;
    private Point start;
    private Deque<Point> queue = new ArrayDeque<>();
    private int[][] movies = new int[][]{
            {0, -1},
            {1, 0},
            {0, 1},
            {-1, 0}
    };

    public Waves(int[][] field, Point start) {
        this.start = start;
        this.field = field;
        field[start.getY()][start.getX()] = 1;
        queue.add(start);
        spreadWaves();
    }

    private void spreadWaves() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int[] move : movies) {
                if (field[point.getY() + move[1]][point.getX() + move[0]] == 0) {
                    field[point.getY() + move[1]][point.getX() + move[0]] = field[point.getY()][point.getX()] + 1;
                    queue.addLast(new Point(point.getX() + move[0], point.getY() + move[1]));
                }
            }
        }
    }

    public String getPath(ArrayList<Point> exits) {
        Point mainExit = new Point(0, 0);
        int stepsToExit = Integer.MAX_VALUE;
        for (Point cur : exits) {
            if (field[cur.getY()][cur.getX()] < stepsToExit) {
                mainExit = cur;
                stepsToExit = field[cur.getY()][cur.getX()];
            }
        }
        Stack<Point> path = new Stack<>();
        Point curPoint = mainExit;
        while (stepsToExit != 0) {
            for (int[] move : movies) {
                if (field[curPoint.getY() + move[1]][curPoint.getX() + move[0]] == stepsToExit - 1) {
                    curPoint = new Point(curPoint.getX() + move[0], curPoint.getY() + move[1]);
                    path.add(curPoint);
                    break;
                }
            }
            stepsToExit--;
        }
        StringBuilder sb = new StringBuilder();
        while (!path.isEmpty()) {
            sb.append(path.pop());
            sb.append("->");
        }
        sb.append(mainExit);
        return sb.toString();
    }

    public int[][] getField() {
        return field;
    }
}
