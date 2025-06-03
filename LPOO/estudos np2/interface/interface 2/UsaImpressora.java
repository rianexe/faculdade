public class UsaImpressora{
	public static void main(String[]args){
		ImpressoraLaser laser = new ImpressoraLaser();
		ImpressoraTinta tinta = new ImpressoraTinta();
		
		laser.imprimir("Relatorio de vendas");
		tinta.imprimir("Relatorio de vendas");
	}
}