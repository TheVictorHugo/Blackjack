package jogo;
import java.util.ArrayList;
import java.util.Random;


public class Baralho {
	private  ArrayList<Carta> cartas;
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public void criabaralho() {
		this.cartas = new ArrayList<>();
		
			for(int i = 1; i < 14; i++) {
				Carta c = new Carta();
				c.setNaip("ouro");
				c.setValor(Integer.toString(i));
				cartas.add(c);
			}
			for(int i = 1; i < 14; i++) {
				Carta c = new Carta();
				c.setNaip("copas");
				c.setValor(Integer.toString(i));
				cartas.add(c);
			}
			
			for(int i = 1; i < 14; i++) {
				Carta c = new Carta();
				c.setNaip("espada");
				c.setValor(Integer.toString(i));
				cartas.add(c);
			}
			
			for(int i = 1; i < 14; i++) {
				Carta c = new Carta();
				c.setNaip("paus");
				c.setValor(Integer.toString(i));
				cartas.add(c);
			}
		
	}
	
	public void embaralha() {
		Random random = new Random();
		ArrayList<Carta> temp = new ArrayList<Carta>();
		int j = 0;
		for(int i = 0; i < cartas.size(); i++) {
			j = random.nextInt(cartas.size());
			temp.add(cartas.get(j));
			cartas.remove(j);
		}
		cartas = temp;
	}
	
	public Carta retornatop() {
		Carta cartaTemp = new Carta();
		cartaTemp = this.cartas.get(0);
		this.cartas.remove(0);
		return cartaTemp;
	}
	
	
	public void imprimirBaralho() {
		
		for(int i = 0; i < this.cartas.size(); i++) {
			System.out.println(this.cartas.get(i).getValor());
			System.out.println(this.cartas.get(i).getNaip());
		}
	}
	

}
