public class UsaPagamento{
	public static void main(String[]args){
		Pix pix = new Pix();
		TransferenciaBancaria transf = new TransferenciaBancaria();
		
		pix.processarPagamento(300.00);
		pix.processarPagamento(700.00);
		transf.processarPagamento(1000.00);
	}
}