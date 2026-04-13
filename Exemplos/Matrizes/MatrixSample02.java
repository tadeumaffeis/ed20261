
public class MatrixSample02 {
    public static void main(String[] args)
    {
        int[][] matrix = new int[3][];
        matrix[0] = new int[3];
        matrix[1] = new int[4];
        matrix[2] = new int[5];

        System.out.println("Size 0: " + matrix[0].length);
        System.out.println("Size 1: " + matrix[1].length);
        System.out.println("Size 2: " + matrix[2].length);

        int sizeX = 0;
        int sizeY = matrix.length;

        for (int y=0; y < sizeY; y++)
        {
            sizeX = matrix[y].length;
            for (int x=0; x < sizeX; x++)
            {
                matrix[y][x] = (y + 1) * (x + 1);
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