package projeto.cli;

import java.util.Scanner;

import projeto.cli.exceptions.InvalidArgumentsException;
import projeto.cli.service.FolderService;

public class App {
    public static void main(String[] args) {

        if (args.length <= 0) {
            throw new InvalidArgumentsException();
        }

        String path = args[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Criar pastas padrão");

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                FolderService.createDefaultFolder(path);
                break;
            default:
                System.out.println("Opção invalida");
        }
        scanner.close();
    }
}
