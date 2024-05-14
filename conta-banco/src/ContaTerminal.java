import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o seu nome: ");
        String cliente = scanner.next();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + cliente + "!" + " Obrigado por criar uma conta em nosso banco, a sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de: " + saldo + " já está disponivel! Agradecemos sua confiança em nosso banco.");


    }
}
