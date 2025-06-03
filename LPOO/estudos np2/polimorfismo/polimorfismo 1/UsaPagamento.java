public class UsaPagamento{
	public static void main(String[]args){
		Pagamento[] formasDePagamento = new Pagamento[3];
		
		formasDePagamento[0] = new CartaoDebito();
		formasDePagamento[1] = new CartaoCredito();
		formasDePagamento[2] = new Dinheiro();
		
		for (Pagamento p: formasDePagamento){
			p.pagar(100.00);
		}
	}
}