import java.util.Scanner;

public class ExecutarOperação {
    private static Cliente cliente;
    private static Conta conta;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Banco Virtual!");

        if (cliente == null) {
            System.out.println("Opa, percebi que você não possui cadastro, irei te cadastrar no nosso banco.");
            cadastrarUsuario();
        }

        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Salário");
        int tipoConta = scanner.nextInt();

        System.out.println("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        if (tipoConta == 1) {
            System.out.println("Digite o limite de crédito da Conta Corrente: ");
            double limiteCredito = scanner.nextDouble();
            conta = new ContaCorrente("CC123", saldoInicial, limiteCredito);
        } else if (tipoConta == 2) {
            conta = new ContaSalario("CS456", saldoInicial);
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Consulta de saldo");
            System.out.println("4 - Gerar Extrato");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    realizarSaque();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    gerarExtrato();
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o Banco Virtual. Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void cadastrarUsuario() {
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.next();
        System.out.print("Digite seu telefone: ");
        String telefone = scanner.next();
        System.out.print("Digite seu CEP: ");
        String cep = scanner.next();
        System.out.print("Digite seu e-mail: ");
        String email = scanner.next();
        System.out.print("Digite seu RG: ");
        String rg = scanner.next();
        System.out.print("Digite sua data de nascimento: ");
        String dataNascimento = scanner.next();

        cliente = new Cliente(nome, cpf, telefone, cep, email, rg, dataNascimento);
        System.out.println("Cadastro realizado com sucesso!");
    }

    private static void realizarSaque() {
        System.out.print("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
    }

    private static void realizarDeposito() {
        System.out.print("Digite o valor que deseja depositar: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);
    }

    private static void consultarSaldo() {
        conta.consultarSaldo();
    }

    private static void gerarExtrato() {
        conta.gerarExtrato();
    }
}
