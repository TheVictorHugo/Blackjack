package jogo;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baralho b = new Baralho();
		b.criabaralho();
		b.embaralha();
		
		Scanner ler = new Scanner(System.in);
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		
		System.out.println("Digite o nome do jogador1");
		jogador1.setNome(ler.nextLine());
		
		System.out.println("Digite o nome do jogador2");
		jogador2.setNome(ler.nextLine());
		
		//jogador 1 pega carta e soma no valor do jogador
		
		//System.out.println(jogador1.getNome());
		int valor;
		valor = Integer.parseInt(b.retornatop().valor);
		jogador1.setSoma(valor);
		System.out.printf("jogador: %s, está com o valor: %d\n", jogador1.getNome(),jogador1.getSoma());
		
		valor = Integer.parseInt(b.retornatop().valor);
		jogador1.setSoma(valor);
		System.out.printf("jogador: %s, está com o valor: %d\n", jogador1.getNome(),jogador1.getSoma());
		
		/*
		Baralho b = new Baralho();
		b.criabaralho();
		b.embaralha();
		//b.imprimirBaralho();
		
		System.out.println(b.retornatop().valor);
		System.out.println(b.retornatop().valor);
		*/
		
	}

}
