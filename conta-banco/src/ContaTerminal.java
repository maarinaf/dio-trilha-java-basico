import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Nome do cliente
        System.out.print("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        // Numero da occonta
        System.out.print("Numero da conta: ");
        int numeroConta = scanner.nextInt();

        //Numero da agencia
        System.out.print("Digite o numero da Agência: ");
        String agencia = scanner.next();

        //Saldo
        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        //Mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
                
    }
    
}
