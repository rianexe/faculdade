public class ImpressoraTinta implements Impressora{
	@Override
	public void imprimir(String documento){
		System.out.println("Impressao a tinta: " + documento);
	}
}