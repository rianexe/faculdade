public class Dinheiro implements Pagamento{
	@Override
	public void pagar(double valor){
		System.out.println("Pagamento de "+ valor + " realizado em dinheiro");
	}
}