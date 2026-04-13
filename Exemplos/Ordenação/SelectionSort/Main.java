public class Main {
    public static void main(String[] args)
    {
        int[] array = {10,9,101,7,44,28};
        SelectionSort bubble = new SelectionSort(array);
        bubble.sort();

        System.out.println(bubble.toString());
    }
}
