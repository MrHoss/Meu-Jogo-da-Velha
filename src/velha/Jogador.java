package velha;
import java.util.*;
public class Jogador {
    static Scanner entrada = new Scanner(System.in);
    static int numEsc;
    //Controle de entrada dos jogadores humanos.
    public static int SelecionarSlot(){
        
            try{
                numEsc = entrada.nextInt();
                if (!(numEsc > 0 && numEsc <= 9)) {//Verifica se o número escolhido é entre 1 e 9
                    System.out.println("Entrada inválida, por favor escreva um dos números do tabuleiro!");
                    SelecionarSlot();
                }
            }catch(Exception e){//Realiza o tratamento de exceção caso o jogador não digite um número.
                System.out.println("Entrada inválida!");
                entrada.nextLine();
                entrada.nextInt();
                SelecionarSlot(); 
            }
            return numEsc;
        
    }
}
