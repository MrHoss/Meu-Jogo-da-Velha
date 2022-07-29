package velha;

public class Jogo {
    //Inicia o jogo
    public static void main(String[] args) {
        Tabuleiro.tabuleiro = new String[9];//Define o número de espaços jogáveis no tabuleiro.
        Tabuleiro.rodada = "X";//Define o símbolo e rodada de cada jogador.
        Tabuleiro.jogador = "jogador1";//Cria váriável para identificar humano de robô.
        String vencedor = null;

        //Inicia o Tabuleiro com números de localização dos espaços vazios.
        for (int a = 0; a < 9; a++){
            Tabuleiro.tabuleiro[a] = String.valueOf(a+1);
        }
        System.out.println("Aluno: Daniel Souza\nRU:3731026");
        System.out.println("\nBem vindo ao jogo da Velha!");
        //Inicia a escolha dos oponentes.
        int bot = Computador.escolherbot();
        
        Tabuleiro.PrintTabuleiro();//Mostra o Tabuleiro
        System.out.println("Jogador X irá jogar primeiro, por favor digite a posição em que irá jogar no tabuleiro:");
        //Enquanto não houver vencedor o jogo continua em looping
        while (vencedor == null){
            
            int numEsc;//Variavel que armazena a escolha dos jogadores a cada rodada.
            //Se for a vez do jogador humano abre a entrada de teclado para realizar a jogada...
            if(Tabuleiro.jogador=="jogador1"){
                    numEsc = Jogador.SelecionarSlot();
            //Se não for a vez do humano é a vez do robô escolher a jogada.
            }else{
                
                //Faz a verificação da dificuldade escolhida e define quem irá jogar.
                if (bot==1){
                   numEsc= ComputadorA.Escolha();
                }
                else if (bot==2){
                    numEsc= ComputadorB.Escolha();
                }
                else if (bot==3){
                    numEsc= ComputadorC.Escolha();
                }
                else if (bot==4){
                        numEsc= Jogador.SelecionarSlot();
                }else 
                System.out.println("Entrada inválida, Computador A foi escolhido automáticamente!");
                numEsc=Computador.rand.nextInt(9)+1;
                
            }
            //Verifica se o espaço escolhido já foi preenchido...
            if (Tabuleiro.tabuleiro[numEsc - 1].equals(
					String.valueOf(numEsc))) {
				Tabuleiro.tabuleiro[numEsc - 1] = Tabuleiro.rodada;
                //Se não foi preenchido realiza a troca da rodada.
				if (Tabuleiro.rodada.equals("X")) {
					Tabuleiro.rodada = "O";
					Tabuleiro.jogador = "jogador2";
				}
				else {
					Tabuleiro.rodada = "X";
					Tabuleiro.jogador = "jogador1";
				}
                //Mostra o tabuleiro a cada rodada e verifica se há algum vencedor.
				Tabuleiro.PrintTabuleiro();
				vencedor = Tabuleiro.verificaVencedor();
			}
            //Se o espaço já tiver sido preenchido retorna um print alertando aos jogadores.
			else {
				System.out.println("Opção já preenchida, por favor escolha outra!");
			}
        }
        //Se nenhum jogador conseguiu completar as linhas é empate.
        if (vencedor.equalsIgnoreCase("empate")) {
			System.out.println("O jogo empatou!");
        }else {
			System.out.println("Parabéns! " + vencedor + " Ganhou a rodada!");
        }
	}
    
}
