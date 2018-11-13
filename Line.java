public class Line extends point {
    private point first; // variables must be private
    private point second;

    public Line() {
        super();
        first = new point(); // these are default (0,0)
        second = new point(); // these are default (0,0)
    }

    public Line(point inFirst, point inSecond) {
        super();
        first = inFirst; // plugging in one coordinate here, b/c already established (x,y) in point class
        second = inSecond;
    }

    public int [][] getBothPoints(){
        int[][] xyCoor = new int[2][2];
        xyCoor[0][0] = first.getX();
        xyCoor[0][1] = first.getY();
        xyCoor[1][0] = second.getX();
        xyCoor[1][1] = second.getY();
        return xyCoor;
    }

    public String toString(){
        return ("("+first.getX()+","+ first.getY()+") and ("+second.getX()+", "+ second.getY()+")");
    }

    public double getDistance(){
        return (Math.sqrt((Math.pow(first.getX() - second.getX(), 2) - (Math.pow(first.getY() - second.getY(), 2)))));
    }
}
