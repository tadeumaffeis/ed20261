
public class InsertionSort {
    private int[] array = null;
    private int size = 0;

    public InsertionSort(int[] array) {
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
        for (int i = 1; i < this.size; i++) {

            int aux = this.array[i];
            int j = i;

            while ((j > 0) && (this.array[j - 1] > aux)) {
                this.array[j] = this.array[j - 1];
                j -= 1;
                System.out.println(toString());
            }
            this.array[j] = aux;

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
