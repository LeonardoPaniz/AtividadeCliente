public class ContaCorrente extends Conta {
    public ContaCorrente(String numeroConta, double saldoInicial, double limiteCredito) {
        super(numeroConta, saldoInicial, limiteCredito);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteCredito >= valor) {
            saldo -= valor;
            extrato.add(new Movimentacao("Saque", -valor));
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}