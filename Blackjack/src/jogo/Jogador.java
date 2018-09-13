package jogo;
import java.util.ArrayList;


public class Jogador {
	private String nome;
	private Integer soma = 0;
	private Boolean parou;
	private ArrayList<Carta> cartas = new ArrayList<>();
	
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public void adicionarCarta(Carta c) {
		boolean trocou = false;
		if(Integer.parseInt(c.getValor()) == 1) {
			//System.out.println("Temos um As !");
			for(int i = 0; i < cartas.size();i++) {
				if(Integer.parseInt(cartas.get(i).valor) >= 10) {
					trocou = true;
					//cartas.get(i).setValor("10");
					c.setValor("10");
					//System.out.println("Agora o valor do As agora é 10");
				}
			}
			if(trocou == false) {
				//System.out.println("O valor dele é 1");
			}
		}else if(Integer.parseInt(c.getValor()) >= 10) {
			for(int i =0 ;i < cartas.size();  i++) {
				if(Integer.parseInt(cartas.get(i).valor) == 1) {
					cartas.get(i).setValor("10");
					//System.out.println("Agora o valor do As agora é 10");
				}
			}
		}
		this.soma =this.soma + Integer.parseInt(c.getValor());
		
		cartas.add(c);
	}
	
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
	
	public void somarMao(Integer valor) {
		this.soma +=valor;
	}
	
	public void imprimirMao() {
		for(int i =0 ; i< cartas.size();i++) {
			System.out.printf("%s %s\n",this.cartas.get(i).getValor(),this.cartas.get(i).getNaip());
			//System.out.println(this.cartas.get(i).getNaip());
		}
	}
	
}
