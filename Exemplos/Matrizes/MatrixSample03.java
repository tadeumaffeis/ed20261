/**
 *  Criar um programa que receba Linha x Coluna elementos
 *  armazene-os em uma matriz de Linha x Coluna de tamanho
 *  e em seguida faça a transposição da matrix. Ao final 
 *  exiba a matriz transposta. com Linha = Coluna 
 */

import java.util.Scanner;

public class MatrixSample03 {
    public static void main(String[] args)
    {
        int[][] matrix = new int[3][3];
        int matrix1[][] = new int[3][3];
        Scanner in = new Scanner(System.in);

        int sizeX = matrix.length;
        int sizeY = matrix[0].length;

        for (int y=0; y < sizeY; y++)
        {
            for (int x=0; x < sizeX; x++)
            {
                matrix[x][y] = in.nextInt();
            }
        }
        System.out.println("----------------");
        for (int y=0; y < sizeY; y++)
        {
            for (int x=0; x < sizeX; x++)
            {
                int aux = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = aux; 
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