public class ContaSalario extends Conta {
    public ContaSalario(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial, 0.0);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            extrato.add(new Movimentacao("Saque", -valor));
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (saldo + limiteCredito >= valor) {
            double valorDeduzido = valor - saldo;
            saldo = 0.0;
            limiteCredito -= valorDeduzido;
            extrato.add(new Movimentacao("Saque", -valor));
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Limite de crédito utilizado: R$" + (valor - saldo));
            if (limiteCredito <= 0) {
                System.out.println("Limite de crédito zerado.");
            }
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}