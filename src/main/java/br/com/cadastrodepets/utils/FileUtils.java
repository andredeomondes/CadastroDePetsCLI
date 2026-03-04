package main.java.br.com.cadastrodepets.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Collections;

public final class FileUtils {

    private FileUtils() {}

    public static List<String> readQuestions(String fileName) {
        Path path = Paths.get(fileName);

        if (!Files.exists(path)) {
            StyleTerminal.error("Arquivo forms.txt não encontrado: " + path.toAbsolutePath());
            return Collections.emptyList();
        }

        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            StyleTerminal.error("Erro na leitura de arquivo: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}