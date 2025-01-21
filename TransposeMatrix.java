public class TransposeMatrix {
    int matrix[][] = {{1, 2, 3}, {4, 5, 6}};

    void TransposeMatrix() {
        int TransposeMatrix[][] = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                TransposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(TransposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TransposeMatrix obj = new TransposeMatrix();

        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(obj.matrix[i][j] + " ");
            }
            System.out.println();
        }

        obj.TransposeMatrix();
    }
}