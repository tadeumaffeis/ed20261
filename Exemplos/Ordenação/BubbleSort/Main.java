public class Main {
    public static void main(String[] args)
    {
        int[] array = {10,9,101,7,44,28};
        BubbleSort bubble = new BubbleSort(array);
        bubble.sort();

        System.out.println(bubble.toString());
    }
}
