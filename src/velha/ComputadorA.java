package velha;

public class ComputadorA extends Computador{
    //Este computador possui táticas defensivas.
    public static int Escolha(){
        for (int a = 0; a < 25; a++) {
            String linha = null;
            switch (a) {//Faz a verificação de cada linha do tabuleiro.
                case 1:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("3XX")){
                        return 3;}
                case 2:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("XX3")){
                    return 3;}
                case 3:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("XX6")){
                    return 6;}
                case 4:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("XX9")){
                    return 9;}
                case 5:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("XX7")){
                        return 7;}
                case 6:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("XX8")){
                        return 8;}
                case 7:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("XX9")){
                        return 9;}
                case 8:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("XX9")){
                        return 9;}
                case 9:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("XX7")){
                        return 7;}
                case 10:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("X2X")){
                    return 2;}
                case 11:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("X5X")){
                    return 5;}
                case 12:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("X8X")){
                    return 8;}
                case 13:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("X4X")){
                        return 4;}
                case 14:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("X5X")){
                        return 5;}
                case 15:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("X6X")){
                        return 6;}
                case 16:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("X5X")){
                        return 5;}
                case 17:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("X5X")){
                        return 5;}
                case 18:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    if (linha.equals("1XX")){
                    return 1;}
                case 19:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    if (linha.equals("4XX")){
                    return 4;}
                case 20:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    if (linha.equals("7XX")){
                    return 7;}
                case 21:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    if (linha.equals("1XX")){
                        return 1;}
                case 22:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    if (linha.equals("2XX")){
                        return 2;}
                case 23:
                    linha = tabuleiro[2] + tabuleiro[5]+ tabuleiro[8];
                    if (linha.equals("3XX")){
                        return 3;}
                case 24:
                    linha = tabuleiro[0] + tabuleiro[4]+ tabuleiro[8];
                    if (linha.equals("1XX")){
                        return 1;}
                case 25:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    if (linha.equals("3XX")){
                        return 3;}
                }
        	}//Retorna randomicamente um número entre 1 e 9 caso nenhuma condição do switch seja atendida.
            return rand.nextInt(9)+1;

    }

}
