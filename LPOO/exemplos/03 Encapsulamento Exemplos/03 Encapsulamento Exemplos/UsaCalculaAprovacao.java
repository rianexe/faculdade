class UsaCalculaAprovacao{
	public static void main(String[] args){
		CalculaAprovacao calc = 
				new CalculaAprovacao();
		//Nao consigo chamar fora de ordem
		//calc.etapa2();
		//calc.etapa1();
		//calc.etapa3();
		//uso funcionalidades encapsulada
		calc.etapasDeAprovacao();
	}
}