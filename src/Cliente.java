// Aluno: Eduardo Luiz Pontes de Souza - UC19100270
public class Cliente { // Função que cadastra o usuário no banco de dados da pizzaria
	// ATRIBUTOS
	private String nome;
	private String cpfCliente;
	private String endereco;
	private int idade;
	private int telefoneCliente;

	// CONSTRUTORES
	Cliente(String nome, String cpfCliente, String endereco, int idade, int telefoneCliente) {
		this.setNome(nome);
		this.setCpfCliente(cpfCliente);
		this.setEndereco(endereco);
		this.setIdade(idade);
		this.setTelefoneCliente(telefoneCliente);

	}

	// GETTING, SETTING E VALIDAÇÃO
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (!endereco.isEmpty()) {
			this.endereco = endereco;
		} else {
			throw new IllegalArgumentException("[ENDEREÇO]: Campo obrigatório.");
		}
	}

	public void setNome(String nome) {
		if (!nome.isEmpty()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("[NOME]: Campo obrigatório.");
		}

	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		if (!cpfCliente.isEmpty()) {
			this.cpfCliente = cpfCliente;
		} else {
			throw new IllegalArgumentException("[CPF]: Campo obrigatório.");
		}

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {

		if (idade >= 18) {
			this.idade = idade;
		} else {
			throw new IllegalArgumentException("[IDADE]: Não é permitido o cadastro de menores de 18 anos.");
		}

	}

	public int getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(int telefoneCliente) {
		if (telefoneCliente > 0) {
			this.telefoneCliente = telefoneCliente;
		} else {
			throw new IllegalArgumentException("[TELEFONE PARA CONTATO]: Campo obrigatório.");
		}

	}

	public String toString() { // Dados do cliente com função toUpperCase para passar para maiúsculo 
		return "NOME: " + getNome().toUpperCase() + "\nCPF: " + getCpfCliente() + "\nENDEREÇO: "
				+ getEndereco().toUpperCase() + "\nIDADE: " + getIdade() + "\nTELEFONE PARA CONTATO: "
				+ getTelefoneCliente();
	}

}