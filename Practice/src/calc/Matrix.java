package calc;

public class Matrix {
    //universe is a matrix.
    private int[][] matrix;
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int rows, int cols) {
    }

    public int[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public void printMatrix() {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}

