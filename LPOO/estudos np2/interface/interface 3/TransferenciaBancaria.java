public class TransferenciaBancaria implements Pagamento{
	@Override
	public boolean processarPagamento(double valor){
		System.out.println("Pagamento de " + valor + " realizado por transferencia bancaria.");
		return true;
	}
}