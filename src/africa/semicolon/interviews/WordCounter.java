package africa.semicolon.interviews;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        //        var mtn = "0703,0706,0803,0806,0810,0813,0814,0816,0903,0916,07025,07026,0704";
//        var air = "0701,0708,0802,0808,0812,0901,0902,0904,0907,0912";
//        var glo = "0705,0805,0807,0811,0815,0905,0915";
//        var mobile = "0809,0817,0818,0909,0908";
//        var mtel = "0804";

        Map<String, List<String>> listOfProviderPrefixes = new HashMap<>();
        listOfProviderPrefixes.put("mtn", List.of("0703" ,"0706", "0803","0806", "0810", "0813", "0814", "0816", "0903", "0916", "07025", "07026", "0704"));
        listOfProviderPrefixes.put("air", List.of("0701", "0708", "0802", "0808", "0812", "0901", "0902", "0904", "0907", "0912"));
        listOfProviderPrefixes.put("glo", List.of("0705", "0805", "0807", "0811", "0815", "0905", "0915"));
        listOfProviderPrefixes.put("nineMobile", List.of("0809", "0817", "0818", "0909", "0908"));
        listOfProviderPrefixes.put("mtel", List.of("0804"));
        System.out.println(providersPhoneNumberCount("/home/anjola/IdeaProjects/deitelJavaExercises/src/africa/semicolon/interviews/PhoneNumbers.txt", listOfProviderPrefixes));
    }


    public static Map<String, Integer> providersPhoneNumberCount(String filePath, Map<String, List<String>> listOfProviderPrefixes) {

        final Map<String, Integer> phoneNumberCount = new HashMap<>();
        for (var listOfProviderPrefix: listOfProviderPrefixes.entrySet()) {
            phoneNumberCount.put(listOfProviderPrefix.getKey(), 0);
        }
        try(Stream<String> lines = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            lines.forEach(line -> phoneNumberCount.keySet().forEach(key -> {
                var providerPrefix = String.join(",",listOfProviderPrefixes.get(key));
                if(providerPrefix.contains(line.substring(0, 4)) || providerPrefix.contains(line.substring(0, 5))){
                    phoneNumberCount.put(key, phoneNumberCount.get(key) + 1);
                }
            }));
        }catch (IOException ex){
            System.out.println("File not find, check the path: ");
        }

        return phoneNumberCount;
    }

}
