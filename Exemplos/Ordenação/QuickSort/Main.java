import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] v;
        int size = Integer.parseInt(args[0]);
        v = new int[size];

        for (int i=0; i < size; i++)
        {
            v[i] = in.nextInt();
        }
        
        QuickSort qs = new QuickSort(v);
        qs.sort();
        qs.show();
    }
}
