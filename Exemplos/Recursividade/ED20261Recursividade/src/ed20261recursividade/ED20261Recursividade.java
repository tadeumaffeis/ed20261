/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed20261recursividade;

/**
 *
 * @author amaffeis
 */
import java.util.Scanner;

public class ED20261Recursividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade de numeros de Fibonacci: ");
        int qtty = in.nextInt();
        long fib[] = (new Fibonacci()).getNelements(qtty);
        for (int i=0; i < qtty; i++)
        {
            System.out.println((i + 1) + " " + fib[i]);
        }
    }
    
    
}
