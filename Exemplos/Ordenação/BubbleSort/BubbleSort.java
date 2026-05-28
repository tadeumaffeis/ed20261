public class BubbleSort {
    private int[] array = null;
    private int size = 0;

    public BubbleSort(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    private void swap(int a, int b) {
        int aux = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = aux;
    }

    public void sort() {
        boolean changed = true;
        // Otimização: reduz o escopo a cada passada, pois o maior elemento "flutua"
        // para o fim
        int currentSize = this.size;

        while (changed) {
            changed = false;
            for (int i = 0; i < currentSize - 1; i++) {
                if (this.array[i] > this.array[i + 1]) {
                    this.swap(i, i + 1);
                    changed = true;
                }
            }
        }
    }

    public void sortO2() {
        boolean changed = true;
        // Otimização: reduz o escopo a cada passada, pois o maior elemento "flutua"
        // para o fim
        int currentSize = this.size;
        int i = 0;
        int minLimit = 0;
        int totalTimes = 0;
        int minValueIndex = 0;
        int times = 0;
        while (changed) {
            changed = false;
            minValueIndex = minLimit;
            i = minLimit;
            for (times = 0; i < (currentSize - 1); i++,times++) {
                if (this.array[i] > this.array[i + 1]) {
                    this.swap(i, i + 1);
                    changed = true;
                }
                if (this.array[i] < this.array[minValueIndex]) {
                    minValueIndex = i;
                }
            }
            swap(minValueIndex, minLimit);
            currentSize = currentSize - 1; // limit-- -> limit = limit - 1
            totalTimes += times;
            minLimit = minLimit + 1;
        }

        System.out.println("\n\n\nTotal = " + totalTimes);
    }

    private boolean validate()
    {
        for (int i=0; i < this.array.length - 1; i++)
        {
            if (this.array[i] > this.array[i+1])
            {
                return false;
            }
        }

        return true;
    }

    public void sortO() {
        boolean changed = true;
        // Otimização: reduz o escopo a cada passada, pois o maior elemento "flutua"
        // para o fim
        int currentSize = this.size;
        int i = 0;
        int totalTimes = 0;
        while (changed) {
            changed = false;
            for (i = 0; i < (currentSize - 1); i++) {
                if (this.array[i] > this.array[i + 1]) {
                    this.swap(i, i + 1);
                    changed = true;
                }
            }
            currentSize = currentSize - 1; // limit-- -> limit = limit - 1
            totalTimes += i;
        }
        System.out.println("\n\nArray valido: " + this.validate());
        System.out.println("\n\n\nTotal = " + totalTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            sb.append("\n").append(i).append(".\t").append(this.array[i]);
        }
        return sb.toString();
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }
}
