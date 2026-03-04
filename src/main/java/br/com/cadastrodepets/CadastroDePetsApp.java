package main.java.br.com.cadastrodepets;


import main.java.br.com.cadastrodepets.controller.MenuController;
import main.java.br.com.cadastrodepets.utils.FileUtils;
import main.java.br.com.cadastrodepets.utils.StyleTerminal;

public class CadastroDePetsApp {
    public static void main(String[] args) {

        // Caminho para o arquivo de formulários
        String path = "src/main/resources/forms.txt";

        System.out.println();
        StyleTerminal.info("Bem-vindo ao Cadastro de Pets!\n");

        MenuController menu = new MenuController();
        menu.start();

        FileUtils.readQuestions(path);

    }
}
