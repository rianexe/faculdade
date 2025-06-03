public class UsaPagamento{
	public static void main(String[]args){
		Boleto b = new Boleto();
		CartaoCredito cc = new CartaoCredito();

		b.realizarPagamento(100.00);
		cc.realizarPagamento(300.00);
	}
}