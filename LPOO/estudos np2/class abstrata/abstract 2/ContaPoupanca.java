public class ContaPoupanca extends ContaBancaria{
	ContaPoupanca(double saldoInicial){
		super(saldoInicial);
	}
	
	@Override
	public void sacar(double valor){
		if (valor <= saldo){
			saldo -= valor;
			System.out.println("Saque realizado: R$" + valor);
		} else {
			System.out.println("Saldo insuficiente para saque de: R$" + valor);
		}
	}
}
