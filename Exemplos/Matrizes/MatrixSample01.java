
public class MatrixSample01 {
    public static void main(String[] args)
    {
        int[] vet1 = new int[3];
        int vet2[] = new int[3];
        int[][] matrix = new int[3][3];
        int matrix1[][] = new int[3][3];

        int sizeX = matrix.length;
        int sizeY = matrix[0].length;

        for (int y=0; y < sizeY; y++)
        {
            for (int x=0; x < sizeX; x++)
            {
                matrix[x][y] = (y + 1) * (x + 1);
            }
        }

        for (int[] row : matrix)
        {
            for (int col : row)
            {
                System.out.println(col);
            }
        }
    }
} 