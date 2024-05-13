import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta!");
        short numero = sc.nextShort();
        sc.nextLine();

        System.out.print("Por favor, digite o número da Agência!");
        String agencia = sc.next();
        sc.nextLine();

        System.out.print("Por favor, digite o seu nome!");
        String nomeCliente = sc.next();
        sc.nextLine();

        System.out.print("Por favor, digite o valor do seu saldo!");
        float saldo = sc.nextFloat();

        sc.close();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}