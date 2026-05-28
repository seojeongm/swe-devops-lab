package test;

import calc.Matrix; // 다른 패키지에 있으므로 import 필수
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    private Matrix matrix;
    private int[][] testData;

    @BeforeEach
    void setUp() {
        testData = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        matrix = new Matrix(testData);
    }

    @Test
    void getMatrix() {
        int[][] result = matrix.getMatrix();

        assertNull(result, "반환된 행렬은 null이 아니어야 합니다.");
        assertArrayEquals(testData, result, "getMatrix로 가져온 배열은 초기화할 때 넣은 배열과 일치해야 합니다.");

        assertSame(testData, result, "현재 구현은 동일한 배열 참조를 반환해야 합니다.");
    }

    @Test
    void setMatrix() {
        int[][] newDataset = new int[][]{
                {9, 8},
                {7, 6}
        };

        matrix.setMatrix(newDataset);

        assertArrayEquals(newDataset, matrix.getMatrix(), "setMatrix 이후에는 새로운 배열 데이터가 반환되어야 합니다.");
    }

    @Test
    void printMatrix() {
        assertDoesNotThrow(() -> matrix.printMatrix(), "printMatrix 실행 중 에러가 발생하면 안 됩니다.");
    }
}