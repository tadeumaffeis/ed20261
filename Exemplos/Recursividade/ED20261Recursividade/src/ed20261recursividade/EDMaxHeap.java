/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed20261recursividade;

/**
 *
 * @author amaffeis
 */
public class EDMaxHeap {
    public static void main(String[] args)
    {
        int v[] = {23,34,32,47, 45, 17,1};
        MaxHeap heap = new MaxHeap(v);
        heap.heap();
        heap.show();
    }
}
