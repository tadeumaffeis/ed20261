import java.util.Scanner;

public class SampleMatrixExercise {
    private static final int dias = 31;
    private static final int horas = 24;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Person[][] horario = new Person[dias][horas];
        
        String nome;
        String email;
        int dia = 0;
        int hora = 0;

        for (int d = 0; d < dias; d++) {
            for (int h = 0; h < horas; h++) {
                horario[d][h] = new Person();
            }
        }

        for (int d = 0; d < dias; d++) {
            for (int h = 0; h < horas; h++) {
                System.out.println("Nome...: ");
                nome = in.nextLine();
                System.out.println("Email..: ");
                email = in.nextLine();
                System.out.println("Dia....: ");
                dia = in.nextInt();
                System.out.println("Hora...: ");
                hora = in.nextInt();
                in.nextLine();
                if (dia < 0) {
                    break;
                }
                horario[dia][hora].setNome(nome);
                horario[dia][hora].setEmail(email);
                horario[dia][hora].setDia(dia);
                horario[dia][hora].setHora(hora);
            }
            if (dia < 0) {
                break;
            }
        }

        for (int d = 0; d < dias; d++) {
            for (int h = 0; h < horas; h++) {
                if (horario[d][h].getDia() <= 0)
                {
                    continue;
                }
                System.out.printf("\n%d\t%d\t%s\t%s", 
                        horario[d][h].getDia(), 
                        horario[d][h].getHora(),
                        horario[d][h].getNome(),
                        horario[d][h].getEmail()
                    );
            }
        }

    }
}
