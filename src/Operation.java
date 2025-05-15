import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        String name = "Ana Luiza ✴";
        String accountType = "Corrente";
        double balance = 2864.23;

        int option = 0;

        String accountData = String.format("""
                ╔════════════════════════════════╗
                   Nome do cliente: %s
                   Tipo da conta: %s
                ╚════════════════════════════════╝;
                """, name, accountType);
        System.out.println(accountData);

        String menu = """
                ╔═                           ═╗
                   Digite a opção desejada:
                
                   1 - Consultar saldo
                   2 - Realizar transferência
                   3 - Realizar saque
                   4 - Sair
                ╚═                           ═╝""";
        Scanner reading = new Scanner(System.in);

        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1) {
                String accountBalance = String.format("""
                    ╔════════════════════════════════╗
                       Saldo da conta: %.2f
                    ╚════════════════════════════════╝;
                    """, balance);

                System.out.println(accountBalance);
            }

            if (option == 2) {
                System.out.println("\nDigite o valor para transferêcia:");
                double transferAmount = reading.nextInt();

                if (transferAmount > balance) {
                    System.out.println("\n⛌ Saldo insuficiente \n");
                } else {
                    balance -= transferAmount;
                    System.out.println("\nTransferência concluída ✔\n");
                }

            }

        }






    }
}