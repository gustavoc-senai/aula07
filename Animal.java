package aula07;

public class Animal {
	private String nome;
	private String cor;
	private String tamanho;
	private String peso;
	private String raca;
	
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor (String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho (String tamanho) {
		this.tamanho = tamanho;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso (String peso) {
		this.peso = peso;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca (String raca) {
		this.raca = raca;
	}
	protected void imprimirDados () {
		System.out.println("Nome: " + nome);
		System.out.println("Cor: " +cor);
		System.out.println("Tamanho: " +tamanho);
		System.out.println("Peso: " +peso);
		System.out.println("Raça: " + raca);
	}
}
