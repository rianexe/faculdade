class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, String cpf) {
        super(nome, 0); 
        this.cpf = cpf;
    }

    public Cliente(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("CPF: " + cpf);
    }
}