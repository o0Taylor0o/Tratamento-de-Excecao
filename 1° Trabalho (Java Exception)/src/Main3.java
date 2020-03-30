
import java.util.Scanner;
import java.util.Random;
	public class Main3 {

		public static void main(String[] args) {
			int alimentoX;
			int alimentoY;
			int aux1 = 0, aux2 = 0;
			int i;
			int j;
			String cor1, cor2;
			
			Scanner scan = new Scanner(System.in);
			Random r = new Random();
			
			System.out.println("Escolha a cor do robo.");
			cor1 = scan.next();
			Robo r1 = new Robo(cor1);
			System.out.println("Escolha a cor do robo inteligente.");
			cor2 = scan.next();
			Robo r2 = new RoboInteligente(cor2);
			
			System.out.println("Determine a posicao do alimento no eixo X: ");
			alimentoX = scan.nextInt();
			System.out.println("Determine a posicao do alimento no eixo Y: ");
			alimentoY = scan.nextInt();
			
				do {
					i = r.nextInt(4)+1;
					try {
						System.out.println();
						System.out.println("Comando: " + i);
						r1.mover(i);
						aux1 ++;
						r1.posicao2();
						r1.matrizRobo();
						System.out.println("-------------------");
						r1.matrizAlimento(alimentoX, alimentoY);
						r1.verificar(alimentoX,alimentoY);
					}catch (MovimentoInvalidoException e) {
						System.out.println();	
						System.out.println("Movimento invalido.");
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Numero de casas ultrapassadas.");
						}
					
					j = r.nextInt(4)+1;
					try {
						System.out.println();
						System.out.println("Comando: " + j);
						r2.mover(j);
						aux2 ++;
						r2.posicaoInteligente(cor2);
						r2.matrizRobo();
						System.out.println("-------------------");
						r2.matrizAlimento(alimentoX, alimentoY);
						r2.verificar(alimentoX,alimentoY);
					}catch (MovimentoInvalidoException e) {
						System.out.println();	
						System.out.println("Movimento invalido.");
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Numero de casas ultrapassadas.");
						}
					
					if(r1.getEixoX() == alimentoX && r1.getEixoY() == alimentoY) {
						System.out.print("Robo " + cor1 + " achou o alimento ");
						System.out.println("fazendo " + aux1 + " movimentos.");
						System.out.println("Robo inteligente de cor " + cor2 + " fez " + aux2 + " movimentos.");
							break;
						}else if(r2.getEixoX() == alimentoX && r2.getEixoY() == alimentoY){
							System.out.print("Robo inteligente de " + cor2 + " achou o alimento");
							System.out.println(" fazendo "+ aux2 + " movimentos.");
							System.out.println("Robo de cor " + cor1 + " fez " + aux1 + " movimentos.");
								break;
				}
				
				}while((r1.getEixoX() != alimentoX || r1.getEixoY() != alimentoY) || (r2.getEixoX() != alimentoX || r2.getEixoY() != alimentoY));

		}
	}
	

