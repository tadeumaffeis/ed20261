public class RandomNumbers {
    public static void main(String[] args) {
        // Valida se o usuário informou o argumento
        if (args.length == 0) {
            System.out.println("Por favor, informe o tamanho via argumento.");
            return;
        }

        int size = Integer.parseInt(args[0]);
        for (int i = 0; i < size; i++) {
            System.out.printf(" %d", (int) (Math.random() * (size + 1)));
        }
        System.out.println(); // Quebra de linha ao final
    }
}
