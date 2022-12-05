package Lesson004;

public class Main {
    public static void main(String[] args) {
        FieldGenerator fg = new FieldGenerator();
        int[][] field = fg.getField();
        fg.addStart(new Point(5, 5));
        Waves ws = new Waves(field, fg.getStart());
        fg.addExit(new Point(8, 1));
        fg.addExit(new Point(1,7));
        System.out.println(PrintField.print(ws.getField()));
        System.out.println(ws.getPath(fg.getExits()));
    }
}
