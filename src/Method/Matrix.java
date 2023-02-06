package Method;

public class Matrix {
    int numberOfRows;
    int numberOfColumns;

    public Matrix(int numberOfRows, int numberOfColumns) {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
    }
    public int getNumberOfRows(){
        return numberOfRows;
    }
    public int getNumberOfColumns(){
        return numberOfRows;
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,4);
        System.out.println("No of rows: "+matrix.getNumberOfRows());
        System.out.println("No of colums: "+matrix.getNumberOfColumns());
    }
}
