public class sortedLines extends Line {
    private int numberOfLines = 2;
    private Line [] lines = new Line [numberOfLines];
    private double [] distances = new double [numberOfLines];

    public sortedLines(){
        super();
    }

    public sortedLines(int inNumberOfLines, Line [] inLines){
        super();
        numberOfLines = inNumberOfLines;
        lines = inLines;
        for (int f = 0; f < distances.length; f++){
            distances[f] = lines[f].getDistance();
        }
    }

    public void displayOrderedLines(){ // toString method
        for (int i = 0; i < distances.length; i++) { // sort distances
            int currentMinPos = i;
            double currentMin = distances[i];
            for (int j = i; j < distances.length; j++) {
                if (currentMin > distances[j]) {
                    currentMinPos = j;
                    currentMin = distances[j];
                }
            }
            double temp = distances[i];
            distances[i] = distances[currentMinPos];
            distances[currentMinPos] = temp;
        }
        for (int e = 0; e < distances.length; e++){ // sort lines relative to distances
            for (int p = 0; p < lines.length; p++){
                if (lines[p].getDistance() == distances[e])
                    lines[e] = lines[p];
            }
        }
        for (int m = 0; m < lines.length; m++){ // display sorted lines
            System.out.print((m+1)+". ");
            System.out.print(lines[m].toString());
            System.out.println();
        }
    }
}
