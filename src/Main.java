public class Main {

    public static void main(String[] args) throws Exception {

        // Criação do Tabuleiro de Xadrez
        int[][] tabuleiro = new int[8][8];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                tabuleiro[i][j] = 0;
            }
        }

        /*
         * Criação da váriavel "queen";
         * A primeira se encontra numa posição fixa.
         */
        int queen = 1;
        tabuleiro[0][0] = queen;

    }

    public static boolean verificacao(int[][] tabuleiro, int linha, int coluna) {
        // Verificar coluna
        for (int i = 0; i < linha; i++) {
            if (tabuleiro[i][coluna] != 0) {
                return false;
            }
        }

        // Verificar diagonal superior esquerda
        for (int i = linha, j = coluna; i >= 0 && j >= 0; i--, j--) {
            if (tabuleiro[i][j] != 0) {
                return false;
            }
        }

        // Verificar diagonal superior direita
        for (int i = linha, j = coluna; i >= 0 && j < 8; i--, j++) {
            if (tabuleiro[i][j] != 1) {
                return false;
            }
        }

        return true;
    }

    public static void backTracking() {

        
    }
}