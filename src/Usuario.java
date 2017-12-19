
public class Usuario {

	String nome;
	int idade;
	int cpf;
	
	public Usuario(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public Usuario() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		System.out.println("Nome: " + this.nome + " | Idade: " + this.idade + " | CPF: " + this.cpf);
		
		return null;
	}
	
}
