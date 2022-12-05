package Lesson004;

public class FieldGenerator {
    private int[][] field;
    public FieldGenerator() {
        int[][] field = new int[][] {
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
                {-1,00,00,00,00,00,00,00,00,-1},
                {-1,00,00,00,00,-1,-1,-1,00,-1},
                {-1,-1,-1,-1,00,00,00,00,00,-1},
                {-1,00,00,00,00,00,-1,00,00,-1},
                {-1,00,00,00,00,00,-1,00,00,-1},
                {-1,00,00,00,-1,00,00,00,00,-1},
                {-1,00,00,00,00,00,-1,00,00,-1},
                {-1,00,00,00,00,00,-1,00,00,-1},
                {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}
        };
        this.field = field;
    }

    public int[][] getField() {
        return field;
    }

//    public void setStart(Point point) {
//        field[point.getX()][point.getY()] = -2;
//    }
//
//    public void setFinish (Point point) {
//        field[point.getX()][point.getY()] = -3;
//    }
}
