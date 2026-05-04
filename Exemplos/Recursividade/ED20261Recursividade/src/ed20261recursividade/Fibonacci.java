/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed20261recursividade;

/**
 *
 * @author amaffeis
 */
public class Fibonacci {
    private final long factors[] = new long[100];
    private long size = 0;
    
    public long[] getNelements(long n)
    {
        this.size = n;
        factors[0] = 0;
        factors[1] = 1;
        return getNelements(0, 1, 2);
    }
    private long[] getNelements(long f, long s, int n )
    {
        if (n >= size)
            return factors;
        
        factors[n] = f + s;
        
        return getNelements(s, f + s, n + 1);
    }
}
