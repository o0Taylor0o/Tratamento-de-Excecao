
import java.util.Scanner; 
import java.util.Random;
	
	public class Main2 {

		public static void main(String[] args) {
			int alimentoX;
			int alimentoY;
			int aux1 = 0, aux2 = 0;
			int i;
			int j;
			String cor1, cor2;
			
			Random r = new Random();
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Escolha a cor do primeiro robo.");
			cor1 = scan.next();
			Robo r2 = new Robo(cor1);
			System.out.println("Escolha a cor do segundo robo.");
			cor2 = scan.next();
			Robo r3 = new Robo(cor2);
			
			System.out.println("Determine a posicao do alimento no eixo X: ");
			alimentoX = scan.nextInt();
			System.out.println("Determine a posicao do alimento no eixo Y: ");
			alimentoY = scan.nextInt();
			
				do {
					i = r.nextInt(4)+1; 
					try {
						System.out.println();
						System.out.println("Comando: " + i);
						r2.mover(i);
						aux1 ++;
						r2.posicao2();
						r2.matrizRobo();
						System.out.println("-------------------");
						r2.matrizAlimento(alimentoX, alimentoY);
						r2.verificar(alimentoX,alimentoY);
					}catch(MovimentoInvalidoException e) {
						System.out.println();	
						System.out.println("Movimento invalido.");
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Numero de casas ultrapassadas.");
						System.out.println();
					}
					
					j = r.nextInt(4)+1;
					try {
						System.out.println();
						System.out.println("Comando: " + j);
						r3.mover(j);
						aux2 ++;
						r3.posicao3();
						r3.matrizRobo();
						System.out.println("-------------------");
						r3.matrizAlimento(alimentoX, alimentoY);
						r3.verificar(alimentoX,alimentoY);
					
					}catch(MovimentoInvalidoException e) {
						System.out.println();	
						System.out.println("Movimento invalido.");
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Numero de casas ultrapassadas.");
					}
					
					if(r2.getEixoX() == alimentoX && r2.getEixoY() == alimentoY) {
						System.out.print("Robo " + cor1 + " achou o alimento ");
						System.out.println("fazendo " + aux1 + " movimentos.");
						System.out.println("Robo " + cor2 + " fez " + aux2 + " movimentos.");
							break;
						}else if(r3.getEixoX() == alimentoX && r3.getEixoY() == alimentoY){
							System.out.print("Robo " + cor2 + " achou o alimento");
							System.out.println(" fazendo "+ aux2 + " movimentos.");
							System.out.println("Robo " + cor1 + " fez " + aux1 + " movimentos.");
								break;
						}
				
				}while((r2.getEixoX() != alimentoX || r2.getEixoY() != alimentoY) || (r3.getEixoX() != alimentoX || r3.getEixoY() != alimentoY));
			
		} 
		}

