import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        String name = "Ana Luiza ✴";
        String accountType = "Corrente";
        double balance = 2864.23;

        int option = 0;
        String invalidOperation = "\nOperação inválida.\n";

        String accountData = String.format("""
                ╔════════════════════════════════╗
                   Bem vindo(a) à sua conta!
                
                   Nome do cliente: %s
                   Tipo da conta: %s
                ╚════════════════════════════════╝
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
            option = (int) validateInput(reading);
            if (option == -1) {
                System.out.println(invalidOperation);
                continue;
            }

            switch (option) {
                case 1:
                    String accountBalance = String.format("""
                ╔════════════════════════════════╗
                   Saldo da conta: R$ %.2f
                ╚════════════════════════════════╝
                """, balance);
                    System.out.println(accountBalance);
                    break;

                case 2:
                    System.out.println("\nDigite um valor para depósito:");
                    double depositAmount = validateInput(reading);
                    if (depositAmount == -1) {
                        System.out.println(invalidOperation);
                    } else {
                        balance += depositAmount;
                        System.out.println("\nDepósito realizado ✔\n");
                    }
                    break;

                case 3:
                    System.out.println("\nDigite um valor para saque:");
                    double withdrawalAmount = validateInput(reading);
                    if (withdrawalAmount == -1) {
                        System.out.println(invalidOperation);
                    } else if (withdrawalAmount > balance) {
                        System.out.println("\n⛌ Saldo insuficiente \n");
                    } else {
                        balance -= withdrawalAmount;
                        System.out.println("\nSaque concluído ✔\n");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println(invalidOperation);
                    break;
            }
        }
        System.out.println("\nAgradecemos e volte sempre!\n");
        reading.close();
    }

    private static double validateInput(Scanner reading) {
        String input = reading.nextLine().trim();
        if (input.isEmpty()) {
            return -1;
        }
        try {
            double value = Double.parseDouble(input);
            if (value <= 0) {
                return -1;
            }
            return value;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}