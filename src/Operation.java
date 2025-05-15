import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        String name = "Ana Luiza ✴";
        String accountType = "Corrente";
        double balance = 2864.23;

        int option = 0;

        String accountData = String.format("""
                ╔════════════════════════════════╗
                   Bem vindo(a) à sua conta!
                
                   Nome do cliente: %s
                   Tipo da conta: %s
                ╚════════════════════════════════╝;
                """, name, accountType);
        System.out.println(accountData);

        String menu = """
                ╔═                           ═╗
                   Digite a opção desejada:
                
                   1 - Consultar Saldo
                   2 - Realizar Depósito
                   3 - Realizar Saque
                   4 - Sair da Conta
                ╚═                           ═╝""";
        Scanner reading = new Scanner(System.in);

        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1) {
                String accountBalance = String.format("""
                    ╔════════════════════════════════╗
                       Saldo da conta: R$ %.2f
                    ╚════════════════════════════════╝;
                    """, balance);

                System.out.println(accountBalance);
            }

            if (option == 2) {
                System.out.println("\nDigite um valor para depósito:");
                double depositAmount = reading.nextInt();

                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("\nDepósito realizado ✔\n");
                } else {
                    System.out.println("\nOperação inválida.\n");
                }
            }

            if (option == 3) {
                System.out.println("\nDigite um valor para saque:");
                double withdrawalAmount = reading.nextInt();

                if (withdrawalAmount <= 0){
                    System.out.println("\nOperação inválida.\n");
                } else if (withdrawalAmount > balance) {
                    System.out.println("\n⛌ Saldo insuficiente \n");
                } else {
                    balance -= withdrawalAmount;
                    System.out.println("\nSaque concluído ✔\n");
                }
            }
        }
        System.out.println("\nAgradecemos e volte sempre!\n");
        reading.close();
    }
}