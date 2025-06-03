public class CartaoCredito implements Pagamento{
	@Override
	public void realizarPagamento(double valor){
		System.out.println("Pagamento de "+ valor + ", realizado no cartao de credito");
	}
}