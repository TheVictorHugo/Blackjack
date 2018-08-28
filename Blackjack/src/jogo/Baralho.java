package jogo;
import java.util.ArrayList;
import java.util.List;

public class Baralho {
	private  List<Carta> carta;
	
	
	
	private void criabaralho() {
		this.carta = new ArrayList<Carta>();
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 13; j++) {
				Carta c = new Carta();
				c.setNaip(Integer.toString(i));
				c.setValor(Integer.toString(j));	
			}
		}
	}
	
	public void embaralhar() {
		
	}
	
	public List<Carta> pegarCarta() {
		
		return this.carta;
	}
	
	public void imprimirBaralho() {
		for(int i = 0; i < this.carta.length; i++) {
			
		}
	}
	

}
