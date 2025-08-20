import java.util.Scanner;

public class CofreSonoro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] senha = {"DO", "RE", "MI", "FA"};
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.println("Digite 4 notas separadas por espaço (ex: DO RE MI FA):");
            String entrada = scanner.nextLine();
            String[] notas = entrada.toUpperCase().split(" ");

            if (notas.length != 4) {
                System.out.println("Você precisa digitar exatamente 4 notas.");
                continue;
            }

            boolean correta = true;
            for (int i = 0; i < 4; i++) {
                if (!notas[i].equals(senha[i])) {
                    correta = false;
                    break;
                }
            }

            if (correta) {
                System.out.println("Cofre aberto com sucesso!");
                break;
            } else {
                System.out.println("Sequência incorreta.");
                tentativas--;
            }
        }

        if (tentativas == 0) {
            System.out.println("Você usou todas as tentativas.");
        }

        scanner.close();
    }
}

