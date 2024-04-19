import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta poupança: ");
        double saldoInicial = scanner.nextDouble();

        double reajuste = 0.02; 
        double novoSaldo = saldoInicial * (1 + reajuste);

        System.out.println("Novo saldo após o reajuste: R$" + novoSaldo);

        scanner.close();
    }
}