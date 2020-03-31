import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RoboInteligente extends Robo{
	Random r = new Random();
	List <Integer> r2 = new ArrayList <Integer>();
		
		public RoboInteligente(String cor, int eixoX, int eixoY) {
			super(cor, eixoX, eixoY);
		}
		
		public void mover(int movimento) throws MovimentoInvalidoException{
			if(movimento == 1) {
				this.eixoX += 1;
				System.out.println();
			}else if(movimento == 2) {
					this.eixoY -= 1;
					if(eixoY < 0) {
						r2.add(1);
						r2.add(3);
						movimento = r2.get(new Random().nextInt(r2.size()));
						eixoY = 0;
							throw new MovimentoInvalidoException(eixoX, eixoY);
					}
					System.out.println();
			}else if(movimento == 3) {
					this.eixoY += 1;
					System.out.println();
			}else if(movimento == 4) {
					this.eixoX -= 1;
					if(eixoX < 0) {
						r2.add(1);
						r2.add(3);
						movimento = r2.get(new Random().nextInt(r2.size()));
						eixoX = 0;
							throw new MovimentoInvalidoException(eixoX, eixoY);
				}
					}
			}	
		
		public void matrizRobo() {
			m = new char[5][5];
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m.length; j++) {
					m[eixoX][eixoY]= 'R';
					
				}
			}
			
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m.length; j++) {
					System.out.print("[" + m[i][j] + "] ");
				}
				System.out.println();
			}
		}
		
		public void matrizAlimento(int x, int y) {
			m1 = new char[5][5];
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m.length; j++) {
					m[x][y]= 'A';
					
				}
			}
			
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m.length; j++) {
					System.out.print("[" + m[i][j] + "] ");
				}
				System.out.println();
			}
		}
		
		public void posicaoInteligente() {
			System.out.println("Robo inteligente de cor " + cor + " esta na posicao " + eixoX + " no eixo X e na posicao " + eixoY + " no eixo Y.");
		}
		
}
