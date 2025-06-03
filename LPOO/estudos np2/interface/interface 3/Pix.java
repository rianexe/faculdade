public class Pix implements Pagamento{
	@Override
	public boolean processarPagamento(double valor){
		if (valor > 500){
			System.out.println("Pagamento nao realizado.");
			return false;
		} else {
			System.out.println("Pagamento de " + valor + " realizado via PIX");
			return true;
		}
	}
}