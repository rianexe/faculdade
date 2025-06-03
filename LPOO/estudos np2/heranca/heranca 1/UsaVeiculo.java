public class UsaVeiculo{
	public static void main(String[]args){
		System.out.println("Bem-vindo ao teste de veiculos");
		
		Veiculo veiculo = new Veiculo();
		veiculo.mover();
		
		Carro carro = new Carro();
		carro.ligarSom();
		carro.mover();
		
		Bicicleta bike = new Bicicleta();
		bike.pedalar();
		bike.mover();
	}
}