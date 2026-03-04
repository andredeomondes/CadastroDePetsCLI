package main.java.br.com.cadastrodepets.controller;

import main.java.br.com.cadastrodepets.service.PetService;
import main.java.br.com.cadastrodepets.utils.StyleTerminal;

import java.util.Scanner;

public class MenuController {

    private final Scanner scanner;
    private final PetService petService;
    private boolean isRunning;

    public MenuController() {
        this.scanner = new Scanner(System.in);
        this.petService = new PetService();
        this.isRunning = true;
    }

    public void start() {
        StyleTerminal.print(StyleTerminal.BOLD_BLACK, "----------------------------------------------\n");
        StyleTerminal.success("Iniciando sistema de cadastro...");
        StyleTerminal.print(StyleTerminal.BOLD_BLACK, "----------------------------------------------\n");

        StyleTerminal.spinner(1000);


        while (isRunning) {
            displayOptions();
            handleUserInput();
        }
    }

    public void displayOptions() {
        System.out.println();
        StyleTerminal.info("Menu principal \n");
        StyleTerminal.success("1 - Cadastrar um novo pet");
        StyleTerminal.success("2 - Alterar os dados do pet cadastrado");
        StyleTerminal.success("3 - Excluir um pet cadastrado");
        StyleTerminal.success("4 - Listar todos os pets cadastrados");
        StyleTerminal.success("5 - Buscar pets por critérios de busca");
        StyleTerminal.success("6 - Sair");
        System.out.println();
    }

    private void handleUserInput() {
        StyleTerminal.print(StyleTerminal.BOLD_BLACK, "----------------------------------------------\n");

        StyleTerminal.print(StyleTerminal.BOLD_CYAN, "➤ Selecione uma opção: ");
        String choice = scanner.nextLine();
        StyleTerminal.print(StyleTerminal.BOLD_BLACK, "----------------------------------------------\n");

        switch (choice) {
            case "1" -> petService.registerPet();
            case "2" -> petService.changePet();
            case "3" -> petService.deletePet();
            case "4" -> petService.allPet();
            case "5" -> petService.listByCriteriaPet();
            case "6" -> exit();
            default -> StyleTerminal.error("Opção inválida. Por favor, tente novamente.");


        }
    }

    private void registerPet() {
        StyleTerminal.info("Feature (Coming soon)");
    }

    private void changePet() {
        StyleTerminal.info("Feature (Coming soon)");
    }

    private void deletePet() {
        StyleTerminal.info("Feature (Coming soon)");
    }

    private void allPet() {
        StyleTerminal.info("Feature (Coming soon)");
    }

    private void listByCriteriaPet() {
        StyleTerminal.info("Feature (Coming soon)");
    }

    private void exit() {
        StyleTerminal.warning("Encerrando sistema..");
        this.isRunning = false;
    }

}