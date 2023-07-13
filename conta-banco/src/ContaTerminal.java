import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String agencia, nomeCliente;
        int numeroConta;
        double saldo;

        System.out.println("Ola usuário, qual é o seu nome?");
        nomeCliente = sc.nextLine();

        System.out.println("Ola " + nomeCliente + " qual é o número da sua agencia?");
        agencia = sc.next();

        System.out.println("Qual é o número da sua conta?");
        numeroConta = sc.nextInt();

        System.out.println(nomeCliente + " qual é o seu saldo?");
        saldo = sc.nextDouble();

        String olaUser = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

        System.out.println(olaUser);

    }
}
