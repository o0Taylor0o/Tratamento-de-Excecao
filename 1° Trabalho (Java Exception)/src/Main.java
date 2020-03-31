import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int alimentoX; 
		int alimentoY; 
		int aux, aux1 = 0; 
		String cor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha a cor do robo.");
		cor = scan.next();
		Robo r1 = new Robo(cor, 0, 0);
		
		System.out.println("Determine a posicao do alimento no eixo X em ate 4 casas: ");
		alimentoX = scan.nextInt();
		System.out.println("Determine a posicao do alimento no eixo Y em ate 4 casas: ");
		alimentoY = scan.nextInt();
		
		System.out.println("Comando de movimentos:");
		System.out.println("Numero 1 = uma casa para baixo.");
		System.out.println("Numero 2 = uma casa para esquerda.");
		System.out.println("Numero 3 = uma casa para a direita.");
		System.out.println("Numero 4 = uma casa para a cima.");
		System.out.println();
		System.out.println("Comece a movimentar o robo.");
		
			do {	
				aux = scan.nextInt();
				try {
					r1.mover(aux);
					aux1 ++;
					r1.posicao();
					r1.matrizRobo();
					System.out.println("-------------------");
					r1.matrizAlimento(alimentoX, alimentoY);
					r1.verificar(alimentoX,alimentoY);
				}catch(MovimentoInvalidoException e) {
					System.out.println();
					System.out.println("Movimento invalido.");
					System.out.println("Faça outro movimento.");
				}catch(ArrayIndexOutOfBoundsException e ) {
					System.out.println("Numero de casas ultrapassadas.");
				}
				
			}while(r1.getEixoX() != alimentoX || r1.getEixoY() != alimentoY);
				System.out.println("O Robo achou o alimento fazendo " + aux1 + " movimentos.");
				
	}
}
