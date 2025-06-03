public class UsaConta{
	public static void main (String[]args){
		ContaCorrente cc = new ContaCorrente(500.00);
		ContaPoupanca cp = new ContaPoupanca(300.00);
		
		cc.depositar(200.00);
		cp.depositar(100.00);
		
		cc.sacar(150.00);
		cp.sacar(500.00);
		
		cc.exibirSaldo();
		cp.exibirSaldo();
	}			
}