public class main {
    public static void main (String [] args){
        Line [] lines = new Line [2];
        lines[0] = new Line(new point(2, 4), new point(6,8));
        lines[1] = new Line(new point(3, 6), new point(10,15));
        sortedLines sortedLines = new sortedLines(2, lines);
        sortedLines.displayOrderedLines();
    }
}
