import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste (exemplo: 10 para 10%): ");
        double percentualReajuste = scanner.nextDouble();

        double reajuste = salarioAtual * (percentualReajuste / 100);

        double novoSalario = salarioAtual + reajuste;

        System.out.println("\nNovo salário após o reajuste: R$" + novoSalario);

        scanner.close();
    }
}