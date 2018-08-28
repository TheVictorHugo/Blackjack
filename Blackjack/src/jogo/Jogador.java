package jogo;

public class Jogador {
	private String nome;
	private Integer soma;
	private Boolean parou;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getSoma() {
		return soma;
	}
	public void setSoma(Integer soma) {
		this.soma = soma;
	}
	public Boolean getParou() {
		return parou;
	}
	public void setParou(Boolean parou) {
		this.parou = parou;
	}
}
