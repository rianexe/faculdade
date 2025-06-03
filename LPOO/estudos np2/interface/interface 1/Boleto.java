public class Boleto implements Pagamento{
	@Override
	public void realizarPagamento(double valor){
		System.out.println("Pagamento de "+ valor + ", realizado por boleto");
	}
}