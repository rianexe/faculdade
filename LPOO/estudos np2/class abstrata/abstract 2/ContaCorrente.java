public class ContaCorrente extends ContaBancaria{
	
	ContaCorrente(double saldoInicial){
		super(saldoInicial);
	}
	
	@Override
	public void sacar(double valor){
		saldo -= valor;
		System.out.println("Saque realizado: R$" + valor);
	}
}