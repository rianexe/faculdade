public class CartaoDebito implements Pagamento{
	@Override
	public void pagar(double valor){
		System.out.println("Pagamento de "+ valor + " realizado no cartao de debito");
	}
}