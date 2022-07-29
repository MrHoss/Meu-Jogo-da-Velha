package velha;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Computador {
    static String[] tabuleiro = Tabuleiro.tabuleiro;
    static Scanner entrada = new Scanner(System.in);
    protected static Random rand = new Random();
    static int opcao;
    //Pergunta ao jogador X quem ele irá desafiar.
    public static int escolherJogadores(){
        System.out.println("Escolha o adversário:\n1=Computador A\n2=Computador B\n3=Computador C\n4=Jogador vs Jogador");
            try{//Verifica se o jogador escolheu uma opção válida.
                opcao = entrada.nextInt();
                if (!(opcao > 0 && opcao <= 4)) {
                    System.out.println("Entrada inválida, por favor escreva um dos números abaixo!\nEscolha a jogadorEsc:\n1=Computador A\n2=Computador B\n3=Computador C\n4=Jogador vs Jogador");   
                    escolherJogadores(); 
                }
            }catch(InputMismatchException e){//Se houver algum erro de entrada, o jogador será redirecionado para o método escolherJogadores() novamente.
                System.out.println("Entrada inválida, por favor escreva um dos números abaixo!\nEscolha a jogadorEsc:\n1=Computador A\n2=Computador B\n3=Computador C\n4=Jogador vs Jogador");
                entrada.nextLine();
                entrada.nextInt();
                escolherJogadores(); 
            }//Realiza o retorno das opções escolhidas.
            if (opcao == 1){
                
                 return opcao;
                
            }
            else if (opcao == 2){
                
                return opcao;
            }
            else if (opcao == 3){
                
                return opcao;
            }
            else if (opcao == 4){
                
                return opcao;
            }else{
                return 0;
            }    
    }//Verifica a escolha dos jogadores e retorna o valor respectivo de cada um deles.
    public static int escolherbot(){
        int jogadorEsc = escolherJogadores();
        if (jogadorEsc==1){
            System.out.println("Computador A escolhido!");
            return 1;
            
        }
        else if (jogadorEsc==2){
            System.out.println("Computador B escolhido!");
            return 2;
        }
        else if (jogadorEsc==3){
            System.out.println("Computador C escolhido!");
            return 3;
        }
        else if (jogadorEsc==4){
            System.out.println("Jogador vs Jogador Escolhido");
            return 4;
        }else{
        return 0;}

    }
    
}
