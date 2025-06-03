public class CalculaAprovacao{

	//esses metodos tem que ser chamado na ordem
	private void etapa1(){
		System.out.println("Primeira etapa da aprovacao");
	}
	private void etapa2(){
		System.out.println("Segunda etapa da aprovacao");
	}
	private void etapa3(){
		System.out.println("Terceira etapa da aprovacao");
	}

	public void etapasDeAprovacao(){
		etapa1();
		etapa2();
		etapa3();
	}

}