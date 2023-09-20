import java.util.ArrayList;
import java.util.List;

class Movimentacao {
    private String descricao;
    private double valor;

    public Movimentacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}

abstract class Conta {
    protected String numeroConta;
    protected double saldo;
    protected double limiteCredito;
    protected List<Movimentacao> extrato = new ArrayList<>();

    public Conta(String numeroConta, double saldoInicial, double limiteCredito) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.limiteCredito = limiteCredito;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            if (saldo < 0) {
                double valorDeduzido = Math.min(valor, -saldo);
                saldo += valorDeduzido;
                valor -= valorDeduzido;
            }
            saldo += valor;
            extrato.add(new Movimentacao("Depósito", valor));
            if (saldo >= 0) {
                limiteCredito = 0.0;
            }
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public abstract void sacar(double valor);

	public void consultarSaldo() {
		System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);
		if (limiteCredito > 0) {
			System.out.println("Limite de crédito disponível: R$" + limiteCredito);
		}
	}	

    public void gerarExtrato() {
        double saldoTotal = saldo + limiteCredito;
        if (saldoTotal >= 0) {
            System.out.println("Extrato da Conta " + numeroConta + ":");
            for (Movimentacao movimentacao : extrato) {
                System.out.println(movimentacao.getDescricao() + ": R$" + movimentacao.getValor());
            }
            System.out.println("Saldo atual: R$" + saldo);
            if (limiteCredito > 0) {
                System.out.println("Limite de crédito disponível: R$" + limiteCredito);
                limiteCredito = 0.0;
            }
        } else {
            System.out.println("Saldo insuficiente para extrato.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
