import java.util.Scanner;

public class Contador {
 public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.print("Digite o primeiro parametro: ");
    int parametroUm = terminal.nextInt();
    System.out.print("Digite o segundo parametro: ");
    int parametroDois = terminal.nextInt();

    try {
        contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
        System.out.println(exception.getMessage());
    } finally {
        terminal.close();
    }


 }

 static void contar ( int num1, int num2) throws ParametrosInvalidosException {

    if (num1 > num2) {
        throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
    }

    int contagem = num2 - num1;

    for (int i = 1; i <= contagem; i++){
        System.out.println("Imprimindo o numero " + i);
    }

 }
}
