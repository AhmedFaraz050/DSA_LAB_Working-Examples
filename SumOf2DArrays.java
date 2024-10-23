public class Sum2DArrays {
    public static void main(String[] args) {
      
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] array2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

      
        int[][] result = new int[array1.length][array1[0].length];

        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

       
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
