public class ImpressoraLaser implements Impressora{
	@Override
	public void imprimir(String documento){
		System.out.println("Impressao a laser: " + documento);
	}
}