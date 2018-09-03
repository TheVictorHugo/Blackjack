package jogo;
import java.util.Scanner;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		
		System.out.println("\n");
		/*
		System.out.println("aperte ENTER");
		keyAdapter(ler.nextLine());
		
		 KeyAdapter keyAdapter = new KeyAdapter() {
			 public void keyPressed(KeyEvent evt) {
	                if (evt.getKeyCode() == evt.VK_ENTER) { 
	                	boolean verifica = true;
	                	
	                	jogador1.adicionarCarta(b.retornatop());
	        			
	        			if(jogador1.getSoma() > 21) {
	        				verifica = false;
	        				System.out.printf("o %s perdeu !\n",jogador1.getNome() );
	        			}
	        			
	        			if(jogador2.getSoma() == 21) {
	        				verifica = false;
	        				System.out.printf("O %s Venceu !",jogador1.getNome() );
	        			}
	        			
	        			jogador2.adicionarCarta(b.retornatop());
	        			
	        			if(jogador2.getSoma() > 21) {
	        				verifica = false;
	        				System.out.printf("o %s perdeu !\n",jogador2.getNome() );
	        			}
	        			
	        			if(jogador2.getSoma() == 21) {
	        				verifica = false;
	        				System.out.printf("O %s Venceu !",jogador2.getNome() );
	        			}
	                
	                }
	            }
		 };*/
		 
		
		boolean verifica = true;
		while(verifica) {
			jogador1.adicionarCarta(b.retornatop());
			System.out.printf("O jogador %s recebeu a carta %s de %s \n",
					jogador1.getNome(), b.retornatop().valor, b.retornatop().Naip );
			
			if(jogador1.getSoma() > 21) {
				verifica = false;
				System.out.printf("o %s perdeu !\n",jogador1.getNome() );
			}
			
			if(jogador2.getSoma() == 21) {
				verifica = false;
				System.out.printf("O %s Venceu !\n",jogador1.getNome() );
			}
			
			jogador2.adicionarCarta(b.retornatop());
			System.out.printf("O jogador %s recebeu a carta %s de %s \n",
					jogador2.getNome(), b.retornatop().valor, b.retornatop().Naip );
			
			if(jogador2.getSoma() > 21) {
				verifica = false;
				System.out.printf("o %s perdeu !\n",jogador2.getNome() );
			}
			
			if(jogador2.getSoma() == 21) {
				verifica = false;
				System.out.printf("O %s Venceu !\n",jogador2.getNome() );
			}
		};
		
		//jogador1.adicionarCarta(b.retornatop());
		//jogador1.adicionarCarta(b.retornatop());
		//jogador1.adicionarCarta(b.retornatop());

		
		
		for(int i = 0; i < jogador1.getCartas().size(); i++) {
			System.out.printf("jogador: %s, e a soma é: %d \n", 
					jogador1.getNome(),
					//jogador1.getCartas().get(i).getValor(),
					jogador1.getSoma());
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < jogador1.getCartas().size(); i++) {
			System.out.printf("jogador: %s, e a soma é: %d \n", 
					jogador2.getNome(),
					//jogador2.getCartas().get(i).getValor(),
					jogador2.getSoma());
		}
		
		
	}

}
