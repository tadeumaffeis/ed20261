import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Define o alfabeto com letras maiúsculas e minúsculas
        String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int quantidade = 0;
	if (args.length > 0)
	{
	  quantidade = Integer.parseInt(args[0]);
	}

            // Gera e imprime cada letra na saída padrão
            for (int i = 0; i < quantidade; i++) {
                int indiceAleatorio = random.nextInt(alfabeto.length());
                char letra = alfabeto.charAt(indiceAleatorio);
                System.out.print(letra + " ");
            }
            System.out.println(); // Quebra de linha no final
        }
}