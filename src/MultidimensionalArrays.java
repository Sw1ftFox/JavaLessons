public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        System.out.println(matrix[2][1]);

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String[][] strings = new String[2][3];
        System.out.println(strings[0][1]);
    }
}