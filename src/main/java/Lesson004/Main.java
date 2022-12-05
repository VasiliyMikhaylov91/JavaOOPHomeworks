package Lesson004;

public class Main {
    public static void main(String[] args) {
        FieldGenerator fg = new FieldGenerator();
        int[][] field = fg.getField();
        Waves ws = new Waves(field, new Point(5,5));
        System.out.println(PrintField.print(ws.getField()));
    }
}
