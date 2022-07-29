package velha;
import java.util.*;

public class Tabuleiro {
    public static String[] tabuleiro;
    public static String rodada;
    public static String jogador;

    //Montagem do tabuleiro.
    static void PrintTabuleiro(){
        System.out.println("|---|---|---|");
        System.out.println("| " + tabuleiro[0] + " | "
                           + tabuleiro[1] + " | " + tabuleiro[2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabuleiro[3] + " | "
                           + tabuleiro[4] + " | " + tabuleiro[5]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabuleiro[6] + " | "
                           + tabuleiro[7] + " | " + tabuleiro[8]
                           + " |");
        System.out.println("|---|---|---|");
    }
    //Verificação das linhas e colunas para saber se há algum vencedor na rodada.
    static String verificaVencedor(){
        for (int a = 0; a < 8; a++) {
            String linha = null;
  
            switch (a) {
            case 0:
                linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                break;
            case 1:
                linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                break;
            case 2:
                linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                break;
            case 3:
                linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                break;
            case 4:
                linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                break;
            case 5:
                linha = tabuleiro[2] + tabuleiro[5] + tabuleiro[8];
                break;
            case 6:
                linha = tabuleiro[0] + tabuleiro[4] + tabuleiro[8];
                break;
            case 7:
                linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                break;
            }
            //Para o vencedor X
            if (linha.equals("XXX")) {
                return "X";
            }
              
            //Para o vencedor O
            else if (linha.equals("OOO")) {
                return "O";
            }
        }
          
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(tabuleiro).contains(
                    String.valueOf(a + 1))) {
                break;
            }//Se nenhum jogador preencheu as linhas retorna empate.
            else if (a == 8) {
                return "empate";
            }
        }
  
       //Para inserir o X ou o O no lugar escolhido pelos jogadores.
        System.out.println("Vez do jogador " +
            rodada + "! Escolha um número da tabela para inserir o "
            + rodada + ":");
        return null;
    }
    
}
