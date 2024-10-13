package ContaBanco;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;
    private Scanner scanner;

    public void criarConta(){
        scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número de saldo");
        saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
