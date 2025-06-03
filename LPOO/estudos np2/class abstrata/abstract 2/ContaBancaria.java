public abstract class ContaBancaria{
	protected double saldo;
	
	ContaBancaria(double saldoInicial){
		this.saldo = saldoInicial;
	}
	
	public abstract void sacar(double valor);
	
	public void depositar(double valor){
		saldo += valor;
		System.out.println("Deposito realizado: R$" + valor);
	}
	
	public void exibirSaldo(){
		System.out.println("Saldo atual: R$" + saldo);
	}
}