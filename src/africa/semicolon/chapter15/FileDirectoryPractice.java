package africa.semicolon.chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDirectoryPractice {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file path: ");
        Path path = Paths.get(scanner.nextLine());

        if(Files.exists(path)){
            System.out.println(path.getFileName() + " exists");
            if(Files.isDirectory(path)) System.out.println("Is a directory");
            if(path.isAbsolute()) System.out.println("Is an absolute path");
            System.out.println("Last modified time: " + Files.getLastModifiedTime(path));
            System.out.println("Size: " + Files.size(path));
            System.out.println("Path: " + path);
            System.out.println("Absolute: " + path.toAbsolutePath());

            if(Files.isDirectory(path)){
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                System.out.println("Directory contents:");
                for (Path p : directoryStream){
                    System.out.println(p);
                }
            }else {
                System.out.println(path + "Is not a directory");
            }

        }else {
            System.out.println("No such file exists");
        }
    }
}
