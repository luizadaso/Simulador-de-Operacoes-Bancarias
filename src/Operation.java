import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        String name = "Ana Luiza ✴";
        String accountType = "Corrente";
        double balance = 2864.23;
        String invalidOperation = "\nOperação inválida.\n";

        int option = 0;

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
            String input = reading.nextLine().trim();
            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
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
                    input = reading.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println(invalidOperation);
                        break;
                    }
                    try {
                        double depositAmount = Double.parseDouble(input);
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println("\nDepósito realizado ✔\n");
                        } else {
                            System.out.println(invalidOperation);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(invalidOperation);
                    }
                    break;

                case 3:
                    System.out.println("\nDigite um valor para saque:");
                    input = reading.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println(invalidOperation);
                        break;
                    }
                    try {
                        double withdrawalAmount = Double.parseDouble(input);
                        if (withdrawalAmount <= 0) {
                            System.out.println(invalidOperation);
                        } else if (withdrawalAmount > balance) {
                            System.out.println("\n⛌ Saldo insuficiente \n");
                        } else {
                            balance -= withdrawalAmount;
                            System.out.println("\nSaque concluído ✔\n");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(invalidOperation);
                        reading.next();
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("\nAgradecemos e volte sempre!\n");
        reading.close();
    }
}