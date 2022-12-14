package Lesson004;

public class PrintField {
    public static String print(int[][] field) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                sb.append(String.format("%5d", field[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
