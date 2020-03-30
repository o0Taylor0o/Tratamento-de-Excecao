

	public class Robo {
		protected  String cor;
		protected int eixoX = 0;
		protected int eixoY = 0;
		char m[][], m1[][];
	
		public Robo(String cor, int eixoX, int eixoY) {
			this.cor = cor;
			this.eixoX = eixoX;
			this.eixoY = eixoY;
		}
		
		public int getEixoX() {
			return this.eixoX;
		}
		public void setEixoX(int eixoX) {
			this.eixoX = eixoX;
		}
		
		public int getEixoY() {
			return this.eixoY;
		}
		public void setEixoY(int eixoY) {
			this.eixoY = eixoY;
		}
		
		public void posicao3() {
			System.out.println("Robo " + cor + " esta na posicao " + eixoX + " no eixo X e na posicao " + eixoY + " no eixo Y.");
		}
		
		public void posicao2() {
			System.out.println("Robo " + cor + " esta na posicao " + eixoX + " no eixo X e na posicao " + eixoY + " no eixo Y.");
		}
		
		public void posicao() {
			System.out.println("Robo " + cor +" esta na posicao " + eixoX + " no eixo X e na posicao " + eixoY + " no eixo Y.");
		}
		
		public void posicaoInteligente(String cor) {
			System.out.println("Robo inteligente de " + cor + " esta na posicao " + eixoX + " no eixo X e na posicao " + eixoY + " no eixo Y.");
		}

		public void mover(int movimento) throws MovimentoInvalidoException{
			if(movimento == 1) {
				this.eixoX += 1;
				System.out.println();
			}else if(movimento == 2) {
					this.eixoY -= 1;
					if(eixoY < 0) {
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
						eixoX = 0;
							throw new MovimentoInvalidoException(eixoX, eixoY);
				}
					}
			}	
		
		public boolean verificar(int x, int y) {
			if(eixoX == x && eixoY == y) {
				System.out.println();
				System.out.println("Alimento encontrado.");
				System.out.println();
				return true;
			}else {
				System.out.println();
				System.out.println("Alimento nao encontrado.");
				System.out.println();
				return false;
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

	}
