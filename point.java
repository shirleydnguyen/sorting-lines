public class point {
    private int x;
    private int y;

    public point(){
        int x = 0;
        int y = 0;
    }

    public point(int inX, int inY){
        x = inX;
        y = inY;
    }

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public String toString(){
        return "The point is at (" + x + "," + y + ").";
    }
}
