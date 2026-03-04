package main.java.br.com.cadastrodepets.service;

import main.java.br.com.cadastrodepets.utils.FileUtils;
import main.java.br.com.cadastrodepets.utils.StyleTerminal;

import java.util.List;
import java.util.Scanner;

public class PetService {

    private final Scanner scanner = new Scanner(System.in);

    public void registerPet() {
        List<String> questions = FileUtils.readQuestions("forms.txt");
        if (questions.isEmpty()) {
            StyleTerminal.error("Nenhuma pergunta encontrada para o cadastro de pets. Verifique o arquivo forms.txt.");
            return;
        }

        StyleTerminal.info("Formulário de Cadastro\n");

        for (String question : questions) {
            StyleTerminal.print(StyleTerminal.BOLD_CYAN, "➤ " + question + ": ");
            String answer = scanner.nextLine();
            System.out.println("Resposta para '" + question + "': " + answer);
            StyleTerminal.print(StyleTerminal.BOLD_BLACK, "----------------------------------------------\n");


        }

        System.out.println();
        StyleTerminal.success("Cadastro finalizado com sucesso!");
        StyleTerminal.print(StyleTerminal.BOLD_BLACK, "----------------------------------------------\n");


    }

    public void changePet() {
        StyleTerminal.info("Em breve...");
    }

    public void deletePet() {
        StyleTerminal.info("Em breve...");
    }

    public void allPet() {
        StyleTerminal.info("Em breve...");
    }

    public void listByCriteriaPet() {
        StyleTerminal.info("Em breve...");
    }
}
