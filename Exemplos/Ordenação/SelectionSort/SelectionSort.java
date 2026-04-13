
public class SelectionSort {
    private int[] array = null;
    private int size = 0;

    public SelectionSort(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    private void swap(int a, int b) {
        int aux = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = aux;
    }

    public void sort() {
        System.out.println(this.toString());
        for (int y = 0; y < size - 1; y++) {
            for (int x = y + 1; x < size; x++) {
                if (this.array[y] > this.array[x]) {
                    swap(x, y);
                    System.out.println(this.toString());
                }
            }
        }

    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.size; i++) {
            sb.append("\t" + this.array[i]);
        }

        return sb.toString();
    }
}
