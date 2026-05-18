/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amaffeis
 */
public class Main {
    public static void main(String[] args)
    {
        int v[] = {23,34,32,47, 45, 17,1};
        HeapSort sort = new HeapSort(v);
        
        sort.sort();
        
        sort.show();
    }
}
