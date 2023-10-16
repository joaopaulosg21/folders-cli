package projeto.cli.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FolderService {
    private static String[] defaultFolders = { "model", "repository", "service", "controller", "configuration","exceptions" };

    public static void createDefaultFolder(String absolutPath) {
        Path path = Paths.get(absolutPath);

        try {
            for (String folder : defaultFolders) {
                Files.createDirectory(Paths.get(path.toAbsolutePath() + "/" + folder));
                System.out.println(folder + " criado com sucesso!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
