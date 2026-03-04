package main.java.br.com.cadastrodepets.utils;

public final class StyleTerminal {

    private StyleTerminal() {
        throw new UnsupportedOperationException("Utilidade de estilo de terminal não pode ser instanciada");
    }

    public static final String RESET = "\033[0m";

    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";

    public static final String BOLD = "\033[1m";
    public static final String UNDERLINE = "\033[4m";

    public static final String BOLD_BLACK = "\033[1;30m";
    public static final String BOLD_RED = "\033[1;31m";
    public static final String BOLD_GREEN = "\033[1;32m";
    public static final String BOLD_YELLOW = "\033[1;33m";
    public static final String BOLD_BLUE = "\033[1;34m";
    public static final String BOLD_PURPLE = "\033[1;35m";
    public static final String BOLD_CYAN = "\033[1;36m";
    public static final String BOLD_WHITE = "\033[1;37m";

    public static void print(String color, String text) {
        System.out.print(color + text + RESET);
    }

    public static void println(String color, String text) {
        System.out.println(color + text + RESET);
    }

    public static void success(String message) {
        println(BOLD_GREEN, "✔ " + message);
    }

    public static void error(String message) {
        println(BOLD_RED, "✖ " + message);
    }

    public static void warning(String message) {
        println(BOLD_YELLOW, "⚠ " + message);
    }

    public static void info(String message) {
        println(BOLD_CYAN, "➤ " + message);
    }

    public static void loadingDots(int count, long delayMs) {
        try {
            for (int i = 0; i < count; i++) {
                Thread.sleep(delayMs);
                System.out.print(BOLD_YELLOW + "." + RESET);
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void spinner(long durationMs) {
        char[] frames = {'|', '/', '-', '\\'};
        long endTime = System.currentTimeMillis() + durationMs;
        int i = 0;

        try {
            while (System.currentTimeMillis() < endTime) {
                System.out.print("\r" + BOLD_CYAN + frames[i++ % frames.length] + " Loading..." + RESET);
                Thread.sleep(100);
            }
            System.out.print("\r          \r"); // Clear the spinner line
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void progressBar(int totalSteps, long stepDelayMs) {
        int barLength = 20;
        try {
            for (int i = 0; i <= totalSteps; i++) {
                double progress = (double) i / totalSteps;
                int filledLength = (int) (barLength * progress);

                StringBuilder bar = new StringBuilder("[");
                for (int j = 0; j < barLength; j++) {
                    if (j < filledLength) bar.append("■");
                    else bar.append(" ");
                }
                bar.append("]");

                System.out.print("\r" + BOLD_GREEN + bar + " " + (int) (progress * 100) + "%" + RESET);
                Thread.sleep(stepDelayMs);
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}