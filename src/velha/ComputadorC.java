package velha;

public class ComputadorC extends Computador{
    public static int Escolha(){
        //Este jogador possui táticas ofensivas e defensivas tendo como prioridade a ofensiva.
        for (int a = 0; a < 49; a++) {
            String linha = null;
            switch (a) {//Faz a verificação de cada linha do tabuleiro.
                case 0:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("OO3")){
                    return 3;}
                case 1:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("OO6")){
                    return 6;}
                case 2:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("OO9")){
                    return 9;}
                case 3:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("OO7")){
                        return 7;}
                case 4:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("OO8")){
                        return 8;}
                case 5:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("OO9")){
                        return 9;}
                case 6:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("OO9")){
                        return 9;}
                case 7:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("OO7")){
                        return 7;}
                case 8:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("O2O")){
                    return 2;}
                case 10:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("O5O")){
                    return 5;}
                case 11:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("O8O")){
                    return 8;}
                case 12:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("O4O")){
                        return 4;}
                case 13:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("O5O")){
                        return 5;}
                case 14:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("O6O")){
                        return 6;}
                case 15:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("O5O")){
                        return 5;}
                case 16:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("O5O")){
                        return 5;}
                case 17:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("1OO")){
                    return 1;}
                case 18:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("4OO")){
                    return 4;}
                case 19:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("7OO")){
                    return 7;}
                case 20:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("1OO")){
                        return 1;}
                case 21:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("2OO")){
                        return 2;}
                case 22:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("3OO")){
                        return 3;}
                case 23:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("1OO")){
                        return 1;}
                case 24:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("3XX")){
                        return 3;}
                case 25:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("XX3")){
                    return 3;}
                case 26:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("XX6")){
                    return 6;}
                case 27:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("XX9")){
                    return 9;}
                case 28:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("XX7")){
                        return 7;}
                case 29:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("XX8")){
                        return 8;}
                case 30:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("XX9")){
                        return 9;}
                case 31:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("XX9")){
                        return 9;}
                case 32:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("XX7")){
                        return 7;}
                case 33:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("X2X")){
                    return 2;}
                case 34:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("X5X")){
                    return 5;}
                case 35:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("X8X")){
                    return 8;}
                case 36:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("X4X")){
                        return 4;}
                case 37:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("X5X")){
                        return 5;}
                case 38:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("X6X")){
                        return 6;}
                case 39:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("X5X")){
                        return 5;}
                case 40:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("X5X")){
                        return 5;}
                case 41:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("1XX")){
                    return 1;}
                case 42:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("4XX")){
                    return 4;}
                case 43:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("7XX")){
                    return 7;}
                case 44:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("1XX")){
                        return 1;}
                case 45:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("2XX")){
                        return 2;}
                case 46:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("3XX")){
                        return 3;}
                case 47:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("1XX")){
                        return 1;}
                case 48:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("3XX")){
                        return 3;}

                        
                }
            }//Retorna randomicamente um número entre 1 e 9 caso nenhuma condição do switch seja atendida.
            return rand.nextInt(9)+1;
    }   
}
