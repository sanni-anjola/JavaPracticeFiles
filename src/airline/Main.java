package airline;

import airline.exception.InvalidInputException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline();
//        final String FILE_NAME = "TestPhase1.txt";
        final String FILE_NAME2 = "TestPhase4.txt";
//        readInputFile(FILE_NAME, airline);
        readInputFile(FILE_NAME2, airline);
    }

    private static void readInputFile(String fileName, Airline airline) {
        String filePath = new File("src/airline/"+fileName).getAbsolutePath();
        try(Stream<String> lines = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)){
            lines.forEach(line -> {
                String[] tokens = line.split(" ");
                try {
                    if(Objects.equals(tokens[0], "*")) {
                        String data = String.join(" ", Arrays.copyOfRange(tokens, 1, tokens.length));
                        processComment(data);
                    }
                    else parseCommand(tokens, airline);
                }catch (Exception ex){
                    System.out.println(ex.getClass().getSimpleName() + ": " + ex.getMessage());
                }
            });
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void processComment(String data) {
        System.out.println(data);
    }

    static void parseCommand(String[] tokens, Airline air) throws InvalidInputException {
        if(Objects.equals(tokens[0], "CREATE-FLIGHT")) air.addFlight(tokens[1].charAt(0));
        else if(Objects.equals(tokens[0], "GET-FLIGHT")) {
            Flight flight = air.getFlight(Integer.parseInt(tokens[1]));
            if(flight == null) System.out.println("Flight " + tokens[1] + " not found");
            else System.out.println(flight);
        }
        else throw new InvalidInputException("Command not found");
    }
}
