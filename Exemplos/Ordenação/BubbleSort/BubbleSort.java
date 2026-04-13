
public class BubbleSort {
    private int[] array = null;
    private int size = 0;
    public BubbleSort(int[] array)
    {
        this.array = array;
        this.size = array.length;
    }

    private void swap(int a, int b)
    {
        int aux = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = aux;
    }

    public void sort()
    {
        boolean changed = true;
        while (changed)
        {
            changed = false;
            for (int i=0; i < this.size - 1; i++)
            {
                if (this.array[i] > this.array[i+1])
                {
                    this.swap(i,i+1);
                    changed = true;
                }
            }
        }
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        for (int i=0; i < this.size; i++)
        {
            sb.append("\n" + i + ".\t" + this.array[i]);
        }

        return sb.toString();
    }
}

