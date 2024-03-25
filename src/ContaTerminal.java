import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");

        String inputAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta !");

        Integer inputNumero = Integer.parseInt(scanner.nextLine());

        if (inputAgencia.equals(agencia) && inputNumero.equals(numero)) {
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } else {
            System.out.println("Não encontramos sua agência no sistema, tente novamente mais tarde!");
        }
    }
}