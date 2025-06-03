class UsaProduto{

	public static void main(String[] args){

		produto mouse = new produto();
		produto teclado = new produto();
		produto controle = new produto();
		
		mouse.inicializaProduto("Mouse Vermelho X6 2.4GHZ", "Attack Shark", 250.00, 0.53); 
		teclado.inicializaProduto("Teclado Branco k500 60%", "Machenike", 50.00, 2.00);
		controle.inicializaProduto("Controle Wireless", "Xbox", 300.00, 1.00);

		mouse.imprime();
		teclado.imprime();
		controle.imprime();

	}
}