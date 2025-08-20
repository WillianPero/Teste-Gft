import java.util.Scanner;

@SuppressWarnings("unused")
public class InventarioCriaturas {
    public static void main(String[] args) {
        String nome1 = "Dragao";
        String poder1 = "Fogo";
        int forcaBase1 = 80;
        int forcaTotal1 = forcaBase1 * 2;

        String nome2 = "Fenix";
        String poder2 = "Renascimento";
        int forcaBase2 = 100;
        int forcaTotal2 = forcaBase2 + 87;

        String nome3 = "Grifo";
        String poder3 = "Voo Cortante";
        int forcaBase3 = 90;
        int forcaTotal3 = (int)(forcaBase3 * 1.5);

        String maisPoderosa = nome1;
        String poderMaisForte = poder1;
        int maiorForca = forcaTotal1;

        if (forcaTotal2 > maiorForca) {
            maisPoderosa = nome2;
            poderMaisForte = poder2;
            maiorForca = forcaTotal2;
        }

        if (forcaTotal3 > maiorForca) {
            maisPoderosa = nome3;
            poderMaisForte = poder3;
            maiorForca = forcaTotal3;
        }

        System.out.println("Criatura mais poderosa: " + maisPoderosa +
            " (Poder: " + poderMaisForte + ", Força Total: " + maiorForca + ")");
    }
}

