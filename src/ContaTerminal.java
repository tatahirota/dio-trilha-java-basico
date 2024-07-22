//Importa a classe Scanner
import java.util.Scanner; 
import java.util.Locale;

public class ContaTerminal {
        public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler a entrada de dados do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicita e le o número da conta
        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        //Solicita e le a agência
        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.nextLine();

        //Solicita e le o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        //Fecha o scanner
        scanner.close();

        //Constrói e exibe a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";
        System.out.println(mensagem);
    }
    
}
