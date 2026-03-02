package utils;

public final class EstilizarTerminal {

    public static final String RESET = "\033[0m";
    public static final String PRETO = "\033[0;30m";
    public static final String VERMELHO = "\033[0;31m";
    public static final String VERDE = "\033[0;32m";
    public static final String AMARELO = "\033[0;33m";
    public static final String AZUL = "\033[0;34m";
    public static final String ROXO = "\033[0;35m";
    public static final String CIANO = "\033[0;36m";
    public static final String BRANCO = "\033[0;37m";

    public static final String NEGRITO = "\033[1m";
    public static final String SUBLINHADO = "\033[4m";

    public static final String NEGRITO_PRETO = "\033[1;30m";
    public static final String NEGRITO_VERMELHO = "\033[1;31m";
    public static final String NEGRITO_VERDE = "\033[1;32m";
    public static final String NEGRITO_AMARELO = "\033[1;33m";
    public static final String NEGRITO_AZUL = "\033[1;34m";
    public static final String NEGRITO_ROXO = "\033[1;35m";
    public static final String NEGRITO_CIANO = "\033[1;36m";
    public static final String NEGRITO_BRANCO = "\033[1;37m";

    public static void imprimir(String cor, String texto) {
        System.out.print(cor + texto + RESET);
    }

    public static void imprimirLinha(String cor, String texto) {
        System.out.println(cor + texto + RESET);
    }

    public static void sucesso(String texto) {
        imprimirLinha(NEGRITO_VERDE, "✔ " + texto);
    }

    public static void erro(String texto) {
        imprimirLinha(NEGRITO_VERMELHO, "✖ " + texto);
    }

    public static void aviso(String texto) {
        imprimirLinha(NEGRITO_AMARELO, "⚠ " + texto);
    }

    public static void info(String texto) {
        imprimirLinha(NEGRITO_CIANO, "➤ " + texto);
    }

    public static void pontosCarregando(int quantidade, long atrasoMs) throws InterruptedException {
        for (int i = 0; i < quantidade; i++) {
            Thread.sleep(atrasoMs);
            System.out.print(NEGRITO_AMARELO + "." + RESET);
        }
        System.out.println();
    }

    public static void spinner(long duracaoMs) throws InterruptedException {
        char[] quadros = {'|', '/', '-', '\\'};
        long fim = System.currentTimeMillis() + duracaoMs;
        int i = 0;

        while (System.currentTimeMillis() < fim) {
            System.out.print("\r" + NEGRITO_CIANO + quadros[i++ % quadros.length] + RESET);
            Thread.sleep(100);
        }
        System.out.print("\r ");
        System.out.println();
    }

    public static void barraProgresso(int passosTotais, long atrasoMs) throws InterruptedException {
        System.out.print(NEGRITO_VERDE + "[" + RESET);

        for (int i = 0; i < passosTotais; i++) {
            Thread.sleep(atrasoMs);
            System.out.print(NEGRITO_VERDE + "■" + RESET);
        }

        System.out.println(NEGRITO_VERDE + "]" + RESET);
    }
}